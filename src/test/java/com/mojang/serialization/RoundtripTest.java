package com.mojang.serialization;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class RoundtripTest {
    private enum Day {
        TUESDAY("tuesday", TuesdayData.CODEC),
        WEDNESDAY("wednesday", WednesdayData.CODEC),
        SUNDAY("sunday", SundayData.CODEC),
        ;

        private static final Map<String, Day> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(v -> v.name, Function.identity()));
        public static final Codec<Day> CODEC = Codec.STRING.comapFlatMap(DataResult.partialGet(BY_NAME::get, () -> "unknown day"), d -> d.name);

        private final String name;
        private final MapCodec<? extends DayData> codec;

        Day(final String name, final MapCodec<? extends DayData> codec) {
            this.name = name;
            this.codec = codec;
        }

        public MapCodec<? extends DayData> codec() {
            return codec;
        }
    }

    interface DayData {
        Codec<DayData> CODEC = Day.CODEC.dispatch(DayData::type, Day::codec);

        Day type();
    }

    private record TuesdayData(int x) implements DayData {
        public static final MapCodec<TuesdayData> CODEC = Codec.INT.xmap(TuesdayData::new, d -> d.x).fieldOf("value");

        @Override
        public Day type() {
            return Day.TUESDAY;
        }
    }

    private record WednesdayData(String y) implements DayData {
        public static final MapCodec<WednesdayData> CODEC = Codec.STRING.xmap(WednesdayData::new, d -> d.y).fieldOf("value");

        @Override
        public Day type() {
            return Day.WEDNESDAY;
        }
    }

    private record SundayData(float z) implements DayData {
        public static final MapCodec<SundayData> CODEC = Codec.FLOAT.xmap(SundayData::new, d -> d.z).fieldOf("value");

        @Override
        public Day type() {
            return Day.SUNDAY;
        }
    }

    private record TestData(
        float a,
        double b,
        byte c,
        short d,
        int e,
        long f,
        boolean g,
        String h,
        List<String> i,
        Map<String, String> j,
        List<Pair<String, String>> k,
        DayData dayData
        // caramel start - Extended Codec
        ,
        int test1,
        int test2,
        int test3,
        int test4,
        int test5,
        int test6,
        int test7,
        int test8,
        int test9,
        int test10,
        int test11,
        int test12,
        int test13,
        int test14,
        int test15,
        int test16,
        int test17,
        int test18,
        int test19,
        int test20
        // caramel end - Extended Codec
    ) {
        // caramel start - Extended Codec
        private TestData(final float a, final double b, final byte c, final short d, final int e, final long f, final boolean g, final String h, final List<String> i, final Map<String, String> j, final List<Pair<String, String>> k, final DayData dayData) {

            this(a, b, c, d, e, f, g, h, i, j, k, dayData, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        }
        // caramel end - Extended Codec
        public static final Codec<TestData> CODEC = RecordCodecBuilder.create(i -> i.group(
            Codec.FLOAT.fieldOf("a").forGetter(d -> d.a),
            Codec.DOUBLE.fieldOf("b").forGetter(d -> d.b),
            Codec.BYTE.fieldOf("c").forGetter(d -> d.c),
            Codec.SHORT.fieldOf("d").forGetter(d -> d.d),
            Codec.INT.fieldOf("e").forGetter(d -> d.e),
            Codec.LONG.fieldOf("f").forGetter(d -> d.f),
            Codec.BOOL.fieldOf("g").forGetter(d -> d.g),
            Codec.STRING.fieldOf("h").forGetter(d -> d.h),
            Codec.STRING.listOf().fieldOf("i").forGetter(d -> d.i),
            Codec.unboundedMap(Codec.STRING, Codec.STRING).fieldOf("j").forGetter(d -> d.j),
            Codec.compoundList(Codec.STRING, Codec.STRING).fieldOf("k").forGetter(d -> d.k),
            DayData.CODEC.fieldOf("day_data").forGetter(d -> d.dayData)
            // caramel start - Extended Codec
            ,
            Codec.INT.fieldOf("test1").forGetter(d -> d.test1),
            Codec.INT.fieldOf("test2").forGetter(d -> d.test2),
            Codec.INT.fieldOf("test3").forGetter(d -> d.test3),
            Codec.INT.fieldOf("test4").forGetter(d -> d.test4),
            Codec.INT.fieldOf("test5").forGetter(d -> d.test5),
            Codec.INT.fieldOf("test6").forGetter(d -> d.test6),
            Codec.INT.fieldOf("test7").forGetter(d -> d.test7),
            Codec.INT.fieldOf("test8").forGetter(d -> d.test8),
            Codec.INT.fieldOf("test9").forGetter(d -> d.test9),
            Codec.INT.fieldOf("test10").forGetter(d -> d.test10),
            Codec.INT.fieldOf("test11").forGetter(d -> d.test11),
            Codec.INT.fieldOf("test12").forGetter(d -> d.test12),
            Codec.INT.fieldOf("test13").forGetter(d -> d.test13),
            Codec.INT.fieldOf("test14").forGetter(d -> d.test14),
            Codec.INT.fieldOf("test15").forGetter(d -> d.test15),
            Codec.INT.fieldOf("test16").forGetter(d -> d.test16),
            Codec.INT.fieldOf("test17").forGetter(d -> d.test17),
            Codec.INT.fieldOf("test18").forGetter(d -> d.test18),
            Codec.INT.fieldOf("test19").forGetter(d -> d.test19),
            Codec.INT.fieldOf("test20").forGetter(d -> d.test20)
            // caramel end - Extended Codec
        ).apply(i, TestData::new));
    }

    private static TestData makeRandomTestData() {
        final Random random = new Random(4);
        return new TestData(
            random.nextFloat(),
            random.nextDouble(),
            (byte) random.nextInt(),
            (short) random.nextInt(),
            random.nextInt(),
            random.nextLong(),
            random.nextBoolean(),
            Float.toString(random.nextFloat()),
            IntStream.range(0, random.nextInt(100))
                .mapToObj(i -> Float.toString(random.nextFloat()))
                .collect(Collectors.toList()),
            IntStream.range(0, random.nextInt(100))
                .boxed()
                .collect(Collectors.toMap(
                    i -> Float.toString(random.nextFloat()),
                    i -> Float.toString(random.nextFloat()))
                ),
            IntStream.range(0, random.nextInt(100))
                .mapToObj(i -> Pair.of(Float.toString(random.nextFloat()), Float.toString(random.nextFloat())))
                .collect(Collectors.toList()
                ),
            new WednesdayData("meetings lol"));
    }

    private <T> void testWriteRead(final DynamicOps<T> ops) {
        final TestData data = makeRandomTestData();

        final DataResult<T> encoded = TestData.CODEC.encodeStart(ops, data);
        final DataResult<TestData> decoded = encoded.flatMap(r -> TestData.CODEC.parse(ops, r));

        assertEquals("read(write(x)) == x", DataResult.success(data), decoded);
    }

    private <T> void testReadWrite(final DynamicOps<T> ops) {
        final TestData data = makeRandomTestData();

        final DataResult<T> encoded = TestData.CODEC.encodeStart(ops, data);
        final DataResult<TestData> decoded = encoded.flatMap(r -> TestData.CODEC.parse(ops, r));
        final DataResult<T> reEncoded = decoded.flatMap(r -> TestData.CODEC.encodeStart(ops, r));

        assertEquals("write(read(x)) == x", encoded, reEncoded);
    }

    @Test
    public void testWriteReadJson() {
        testWriteRead(JsonOps.INSTANCE);
    }

    @Test
    public void testReadWriteJson() {
        testReadWrite(JsonOps.INSTANCE);
    }

    @Test
    public void testWriteReadJava() {
        testWriteRead(JavaOps.INSTANCE);
    }

    @Test
    public void testReadWriteJava() {
        testReadWrite(JavaOps.INSTANCE);
    }

    @Test
    public void testWriteReadCompressedJson() {
        testWriteRead(JsonOps.COMPRESSED);
    }

    @Test
    public void testReadWriteCompressedJson() {
        testReadWrite(JsonOps.COMPRESSED);
    }
}