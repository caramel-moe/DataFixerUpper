// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license.
package com.mojang.serialization.codecs;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public final class SimpleMapCodec<K, V> extends MapCodec<Map<K, V>> {
    private final Codec<K> keyCodec;
    private final Codec<V> elementCodec;
    private final Keyable keys;

    public SimpleMapCodec(final Codec<K> keyCodec, final Codec<V> elementCodec, final Keyable keys) {
        this.keyCodec = keyCodec;
        this.elementCodec = elementCodec;
        this.keys = keys;
    }

    @Override
    public <T> Stream<T> keys(final DynamicOps<T> ops) {
        return keys.keys(ops);
    }

    @Override
    public <T> DataResult<Map<K, V>> decode(final DynamicOps<T> ops, final MapLike<T> input) {
        final AtomicReference<DataResult<ImmutableMap.Builder<K, V>>> result = new AtomicReference<>(DataResult.success(ImmutableMap.builder()));

        input.entries().forEach(pair -> {
            final DataResult<K> k = keyCodec.parse(ops, pair.getFirst());
            final DataResult<V> v = elementCodec.parse(ops, pair.getSecond());
            result.set(DataResult.unbox(DataResult.instance().apply3(ImmutableMap.Builder::put, result.get(), k, v)));
        });

        return result.get().map(ImmutableMap.Builder::build);
    }

    @Override
    public <T> RecordBuilder<T> encode(final Map<K, V> input, final DynamicOps<T> ops, final RecordBuilder<T> prefix) {
        for (final Map.Entry<K, V> entry : input.entrySet()) {
            prefix.add(keyCodec.encodeStart(ops, entry.getKey()), elementCodec.encodeStart(ops, entry.getValue()));
        }
        return prefix;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final SimpleMapCodec<?, ?> that = (SimpleMapCodec<?, ?>) o;
        return Objects.equals(keyCodec, that.keyCodec) && Objects.equals(elementCodec, that.elementCodec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyCodec, elementCodec);
    }

    @Override
    public String toString() {
        return "SimpleMapCodec[" + keyCodec + " -> " + elementCodec + ']';
    }
}