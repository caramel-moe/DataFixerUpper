// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license.
package com.mojang.serialization;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CodecTests {
    private static final Codec<String> TO_LOWER_CASE = Codec.STRING.xmap(s -> s.toLowerCase(Locale.ROOT), s -> s.toLowerCase(Locale.ROOT));

    private static <T> Object toJava(final Codec<T> codec, final T value) {
        return codec.encodeStart(JavaOps.INSTANCE, value).getOrThrow(AssertionError::new);
    }

    private static <T> T fromJava(final Codec<T> codec, final Object value) {
        return codec.parse(JavaOps.INSTANCE, value).getOrThrow(AssertionError::new);
    }

    private static <T> T fromJavaOrPartial(final Codec<T> codec, final Object value) {
        return codec.parse(JavaOps.INSTANCE, value).getPartialOrThrow(AssertionError::new);
    }

    private static void assertFromJavaFails(final Codec<?> codec, final Object value) {
        final DataResult<?> result = codec.parse(JavaOps.INSTANCE, value);
        assertTrue("Expected data result error, but got: " + result.result(), result.result().isEmpty());
    }

    private static <T> void assertRoundTrip(final Codec<T> codec, final T value, final Object java) {
        assertEquals(
            java,
            toJava(codec, value)
        );
        assertEquals(
            value,
            fromJava(codec, java)
        );
    }

    @Test
    public void unboundedMap_simple() {
        assertRoundTrip(
            Codec.unboundedMap(Codec.STRING, Codec.INT),
            Map.of(
                "foo", 1,
                "bar", 2
            ),
            Map.of(
                "foo", 1,
                "bar", 2
            )
        );
    }

    @Test
    public void unboundedMap_invalidEntry() {
        final Codec<Map<String, Integer>> codec = Codec.unboundedMap(Codec.STRING, Codec.INT);
        assertFromJavaFails(codec, Map.of(
            "foo", 1,
            "bar", "garbage",
            "baz", 3
        ));
    }

    @Test
    public void unboundedMap_invalidEntryPartial() {
        final Codec<Map<String, Integer>> codec = Codec.unboundedMap(Codec.STRING, Codec.INT);
        assertEquals(
            Map.of(
                "foo", 1,
                "baz", 3
            ),
            fromJavaOrPartial(codec, ImmutableMap.of(
                "foo", 1,
                "bar", "garbage",
                "baz", 3
            ))
        );
    }

    @Test
    public void unboundedMap_invalidEntryNestedPartial() {
        final Codec<Map<String, Map<String, Integer>>> codec = Codec.unboundedMap(Codec.STRING, Codec.unboundedMap(Codec.STRING, Codec.INT));
        assertEquals(
            Map.of(
                "foo", Map.of(
                    "foo", 1
                ),
                "bar", Map.of(
                    "foo", 1,
                    "baz", 3
                )
            ),
            fromJavaOrPartial(codec, ImmutableMap.of(
                "foo", Map.of(
                    "foo", 1
                ),
                "bar", Map.of(
                    "foo", 1,
                    "bar", "garbage",
                    "baz", 3
                )
            ))
        );
    }

    @Test
    public void unboundedMap_repeatedKeys() {
        final Codec<Map<String, Integer>> codec = Codec.unboundedMap(TO_LOWER_CASE, Codec.INT);
        assertFromJavaFails(codec, Map.of(
            "foo", 1,
            "FOO", 2
        ));
    }

    @Test
    public void unboundedMap_repeatedKeysPartial() {
        final Codec<Map<String, Integer>> codec = Codec.unboundedMap(TO_LOWER_CASE, Codec.INT);
        assertEquals(
            Map.of(
                // The first entry is picked for the partial result
                "foo", 1,
                "bar", 2
            ),
            fromJavaOrPartial(codec, ImmutableMap.of(
                "foo", 1,
                "bar", 2,
                "FOO", 3
            ))
        );
    }

    @Test
    public void list_roundTrip() {
        assertRoundTrip(
            Codec.STRING.listOf(),
            List.of("foo", "bar", "baz"),
            List.of("foo", "bar", "baz")
        );
    }

    @Test
    public void list_invalidValues() {
        final Codec<List<String>> codec = Codec.STRING.listOf();
        assertFromJavaFails(codec, List.of("foo", 2, "baz", false));

        assertEquals(
            List.of("foo", "bar"),
            fromJavaOrPartial(codec, List.of("foo", "bar", 2, false))
        );

        assertEquals(
            List.of("foo", "baz"),
            fromJavaOrPartial(codec, List.of("foo", 2, "baz", false))
        );
    }

    @Test
    public void withAlternative_simple() {
        final Codec<String> codec = Codec.withAlternative(Codec.STRING, Codec.INT, integer -> "integer:" + integer);
        assertRoundTrip(codec, "string", "string");
        assertEquals("integer:23", fromJava(codec, 23));
        // Alternative is only used for reads
        assertEquals("integer:4", toJava(codec, "integer:4"));

        assertFromJavaFails(codec, Map.of());
        assertFromJavaFails(codec, false);
    }

    @Test
    public void withAlternative_bothSuccessful() {
        final Codec<String> codec = Codec.withAlternative(Codec.STRING, TO_LOWER_CASE);
        assertRoundTrip(codec, "string", "string");

        // Primary codec is chosen over alternative
        assertRoundTrip(codec, "STRING", "STRING");
    }
}