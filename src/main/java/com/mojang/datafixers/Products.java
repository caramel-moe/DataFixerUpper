package com.mojang.datafixers;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.util.Function10;
import com.mojang.datafixers.util.Function11;
import com.mojang.datafixers.util.Function12;
import com.mojang.datafixers.util.Function13;
import com.mojang.datafixers.util.Function14;
import com.mojang.datafixers.util.Function15;
import com.mojang.datafixers.util.Function16;
// caramel start - Extended Codec
import com.mojang.datafixers.util.Function17;
import com.mojang.datafixers.util.Function18;
import com.mojang.datafixers.util.Function19;
import com.mojang.datafixers.util.Function20;
import com.mojang.datafixers.util.Function21;
import com.mojang.datafixers.util.Function22;
import com.mojang.datafixers.util.Function23;
import com.mojang.datafixers.util.Function24;
import com.mojang.datafixers.util.Function25;
import com.mojang.datafixers.util.Function26;
import com.mojang.datafixers.util.Function27;
import com.mojang.datafixers.util.Function28;
import com.mojang.datafixers.util.Function29;
import com.mojang.datafixers.util.Function30;
import com.mojang.datafixers.util.Function31;
import com.mojang.datafixers.util.Function32;
// caramel end - Extended Codec
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import com.mojang.datafixers.util.Function6;
import com.mojang.datafixers.util.Function7;
import com.mojang.datafixers.util.Function8;
import com.mojang.datafixers.util.Function9;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface Products {
    final class P1<F extends K1, T1> {
        private final App<F, T1> t1;

        public P1(final App<F, T1> t1) {
            this.t1 = t1;
        }

        public App<F, T1> t1() {
            return t1;
        }

        public <T2> P2<F, T1, T2> and(final App<F, T2> t2) {
            return new P2<>(t1, t2);
        }

        public <T2, T3> P3<F, T1, T2, T3> and(final P2<F, T2, T3> p) {
            return new P3<>(t1, p.t1, p.t2);
        }

        public <T2, T3, T4> P4<F, T1, T2, T3, T4> and(final P3<F, T2, T3, T4> p) {
            return new P4<>(t1, p.t1, p.t2, p.t3);
        }

        public <T2, T3, T4, T5> P5<F, T1, T2, T3, T4, T5> and(final P4<F, T2, T3, T4, T5> p) {
            return new P5<>(t1, p.t1, p.t2, p.t3, p.t4);
        }

        public <T2, T3, T4, T5, T6> P6<F, T1, T2, T3, T4, T5, T6> and(final P5<F, T2, T3, T4, T5, T6> p) {
            return new P6<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T2, T3, T4, T5, T6, T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final P6<F, T2, T3, T4, T5, T6, T7> p) {
            return new P7<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <T2, T3, T4, T5, T6, T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P7<F, T2, T3, T4, T5, T6, T7, T8> p) {
            return new P8<>(t1, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6, p.t7);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function<T1, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function<T1, R>> function) {
            return instance.ap(function, t1);
        }
    }

    static <T1, T2> P2<IdF.Mu, T1, T2> of(final T1 t1, final T2 t2) {
        return new P2<>(IdF.create(t1), IdF.create(t2));
    }

    final class P2<F extends K1, T1, T2> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;

        public P2(final App<F, T1> t1, final App<F, T2> t2) {
            this.t1 = t1;
            this.t2 = t2;
        }

        public App<F, T1> t1() {
            return t1;
        }

        public App<F, T2> t2() {
            return t2;
        }

        public <T3> P3<F, T1, T2, T3> and(final App<F, T3> t3) {
            return new P3<>(t1, t2, t3);
        }

        public <T3, T4> P4<F, T1, T2, T3, T4> and(final P2<F, T3, T4> p) {
            return new P4<>(t1, t2, p.t1, p.t2);
        }

        public <T3, T4, T5> P5<F, T1, T2, T3, T4, T5> and(final P3<F, T3, T4, T5> p) {
            return new P5<>(t1, t2, p.t1, p.t2, p.t3);
        }

        public <T3, T4, T5, T6> P6<F, T1, T2, T3, T4, T5, T6> and(final P4<F, T3, T4, T5, T6> p) {
            return new P6<>(t1, t2, p.t1, p.t2, p.t3, p.t4);
        }

        public <T3, T4, T5, T6, T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final P5<F, T3, T4, T5, T6, T7> p) {
            return new P7<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <T3, T4, T5, T6, T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P6<F, T3, T4, T5, T6, T7, T8> p) {
            return new P8<>(t1, t2, p.t1, p.t2, p.t3, p.t4, p.t5, p.t6);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final BiFunction<T1, T2, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, BiFunction<T1, T2, R>> function) {
            return instance.ap2(function, t1, t2);
        }
    }

    final class P3<F extends K1, T1, T2, T3> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;

        public P3(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
        }

        public App<F, T1> t1() {
            return t1;
        }

        public App<F, T2> t2() {
            return t2;
        }

        public App<F, T3> t3() {
            return t3;
        }

        public <T4> P4<F, T1, T2, T3, T4> and(final App<F, T4> t4) {
            return new P4<>(t1, t2, t3, t4);
        }

        public <T4, T5> P5<F, T1, T2, T3, T4, T5> and(final P2<F, T4, T5> p) {
            return new P5<>(t1, t2, t3, p.t1, p.t2);
        }

        public <T4, T5, T6> P6<F, T1, T2, T3, T4, T5, T6> and(final P3<F, T4, T5, T6> p) {
            return new P6<>(t1, t2, t3, p.t1, p.t2, p.t3);
        }

        public <T4, T5, T6, T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final P4<F, T4, T5, T6, T7> p) {
            return new P7<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4);
        }

        public <T4, T5, T6, T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P5<F, T4, T5, T6, T7, T8> p) {
            return new P8<>(t1, t2, t3, p.t1, p.t2, p.t3, p.t4, p.t5);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function3<T1, T2, T3, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function3<T1, T2, T3, R>> function) {
            return instance.ap3(function, t1, t2, t3);
        }
    }

    final class P4<F extends K1, T1, T2, T3, T4> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;

        public P4(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
        }

        public App<F, T1> t1() {
            return t1;
        }

        public App<F, T2> t2() {
            return t2;
        }

        public App<F, T3> t3() {
            return t3;
        }

        public App<F, T4> t4() {
            return t4;
        }

        public <T5> P5<F, T1, T2, T3, T4, T5> and(final App<F, T5> t5) {
            return new P5<>(t1, t2, t3, t4, t5);
        }

        public <T5, T6> P6<F, T1, T2, T3, T4, T5, T6> and(final P2<F, T5, T6> p) {
            return new P6<>(t1, t2, t3, t4, p.t1, p.t2);
        }

        public <T5, T6, T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final P3<F, T5, T6, T7> p) {
            return new P7<>(t1, t2, t3, t4, p.t1, p.t2, p.t3);
        }

        public <T5, T6, T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P4<F, T5, T6, T7, T8> p) {
            return new P8<>(t1, t2, t3, t4, p.t1, p.t2, p.t3, p.t4);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function4<T1, T2, T3, T4, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function4<T1, T2, T3, T4, R>> function) {
            return instance.ap4(function, t1, t2, t3, t4);
        }
    }

    final class P5<F extends K1, T1, T2, T3, T4, T5> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;

        public P5(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
        }

        public App<F, T1> t1() {
            return t1;
        }

        public App<F, T2> t2() {
            return t2;
        }

        public App<F, T3> t3() {
            return t3;
        }

        public App<F, T4> t4() {
            return t4;
        }

        public App<F, T5> t5() {
            return t5;
        }

        public <T6> P6<F, T1, T2, T3, T4, T5, T6> and(final App<F, T6> t6) {
            return new P6<>(t1, t2, t3, t4, t5, t6);
        }

        public <T6, T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final P2<F, T6, T7> p) {
            return new P7<>(t1, t2, t3, t4, t5, p.t1, p.t2);
        }

        public <T6, T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P3<F, T6, T7, T8> p) {
            return new P8<>(t1, t2, t3, t4, t5, p.t1, p.t2, p.t3);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function5<T1, T2, T3, T4, T5, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function5<T1, T2, T3, T4, T5, R>> function) {
            return instance.ap5(function, t1, t2, t3, t4, t5);
        }
    }

    final class P6<F extends K1, T1, T2, T3, T4, T5, T6> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;

        public P6(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
        }

        public App<F, T1> t1() {
            return t1;
        }

        public App<F, T2> t2() {
            return t2;
        }

        public App<F, T3> t3() {
            return t3;
        }

        public App<F, T4> t4() {
            return t4;
        }

        public App<F, T5> t5() {
            return t5;
        }

        public App<F, T6> t6() {
            return t6;
        }

        public <T7> P7<F, T1, T2, T3, T4, T5, T6, T7> and(final App<F, T7> t7) {
            return new P7<>(t1, t2, t3, t4, t5, t6, t7);
        }

        public <T7, T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final P2<F, T7, T8> p) {
            return new P8<>(t1, t2, t3, t4, t5, t6, p.t1, p.t2);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function6<T1, T2, T3, T4, T5, T6, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function6<T1, T2, T3, T4, T5, T6, R>> function) {
            return instance.ap6(function, t1, t2, t3, t4, t5, t6);
        }
    }

    final class P7<F extends K1, T1, T2, T3, T4, T5, T6, T7> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;

        public P7(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
        }

        public App<F, T1> t1() {
            return t1;
        }

        public App<F, T2> t2() {
            return t2;
        }

        public App<F, T3> t3() {
            return t3;
        }

        public App<F, T4> t4() {
            return t4;
        }

        public App<F, T5> t5() {
            return t5;
        }

        public App<F, T6> t6() {
            return t6;
        }

        public App<F, T7> t7() {
            return t7;
        }

        public <T8> P8<F, T1, T2, T3, T4, T5, T6, T7, T8> and(final App<F, T8> t8) {
            return new P8<>(t1, t2, t3, t4, t5, t6, t7, t8);
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function7<T1, T2, T3, T4, T5, T6, T7, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function7<T1, T2, T3, T4, T5, T6, T7, R>> function) {
            return instance.ap7(function, t1, t2, t3, t4, t5, t6, t7);
        }
    }

    final class P8<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;

        public P8(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
        }

        public App<F, T1> t1() {
            return t1;
        }

        public App<F, T2> t2() {
            return t2;
        }

        public App<F, T3> t3() {
            return t3;
        }

        public App<F, T4> t4() {
            return t4;
        }

        public App<F, T5> t5() {
            return t5;
        }

        public App<F, T6> t6() {
            return t6;
        }

        public App<F, T7> t7() {
            return t7;
        }

        public App<F, T8> t8() {
            return t8;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>> function) {
            return instance.ap8(function, t1, t2, t3, t4, t5, t6, t7, t8);
        }
    }

    final class P9<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;

        public P9(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>> function) {
            return instance.ap9(function, t1, t2, t3, t4, t5, t6, t7, t8, t9);
        }
    }

    final class P10<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;

        public P10(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R>> function) {
            return instance.ap10(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
        }
    }

    final class P11<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;

        public P11(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R>> function) {
            return instance.ap11(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11);
        }
    }

    final class P12<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;

        public P12(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R>> function) {
            return instance.ap12(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12);
        }
    }

    final class P13<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;

        public P13(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R>> function) {
            return instance.ap13(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
        }
    }

    final class P14<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;

        public P14(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R>> function) {
            return instance.ap14(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14);
        }
    }

    final class P15<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;

        public P15(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R>> function) {
            return instance.ap15(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15);
        }
    }

    final class P16<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;

        public P16(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R>> function) {
            return instance.ap16(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16);
        }
    }

    // caramel start - Extended Codec
    final class P17<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;

        public P17(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R>> function) {
            return instance.ap17(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17);
        }
    }

    final class P18<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;

        public P18(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R>> function) {
            return instance.ap18(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18);
        }
    }

    final class P19<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;

        public P19(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R>> function) {
            return instance.ap19(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
        }
    }

    final class P20<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;

        public P20(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R>> function) {
            return instance.ap20(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20);
        }
    }

    final class P21<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;

        public P21(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R>> function) {
            return instance.ap21(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21);
        }
    }

    final class P22<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;

        public P22(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R>> function) {
            return instance.ap22(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22);
        }
    }

    final class P23<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;
        private final App<F, T23> t23;

        public P23(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
            this.t23 = t23;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, R>> function) {
            return instance.ap23(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23);
        }
    }

    final class P24<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;
        private final App<F, T23> t23;
        private final App<F, T24> t24;

        public P24(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
            this.t23 = t23;
            this.t24 = t24;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R>> function) {
            return instance.ap24(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24);
        }
    }

    final class P25<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;
        private final App<F, T23> t23;
        private final App<F, T24> t24;
        private final App<F, T25> t25;

        public P25(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
            this.t23 = t23;
            this.t24 = t24;
            this.t25 = t25;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, R>> function) {
            return instance.ap25(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25);
        }
    }

    final class P26<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;
        private final App<F, T23> t23;
        private final App<F, T24> t24;
        private final App<F, T25> t25;
        private final App<F, T26> t26;

        public P26(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
            this.t23 = t23;
            this.t24 = t24;
            this.t25 = t25;
            this.t26 = t26;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, R>> function) {
            return instance.ap26(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26);
        }
    }

    final class P27<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;
        private final App<F, T23> t23;
        private final App<F, T24> t24;
        private final App<F, T25> t25;
        private final App<F, T26> t26;
        private final App<F, T27> t27;

        public P27(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
            this.t23 = t23;
            this.t24 = t24;
            this.t25 = t25;
            this.t26 = t26;
            this.t27 = t27;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, R>> function) {
            return instance.ap27(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27);
        }
    }

    final class P28<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;
        private final App<F, T23> t23;
        private final App<F, T24> t24;
        private final App<F, T25> t25;
        private final App<F, T26> t26;
        private final App<F, T27> t27;
        private final App<F, T28> t28;

        public P28(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27, final App<F, T28> t28) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
            this.t23 = t23;
            this.t24 = t24;
            this.t25 = t25;
            this.t26 = t26;
            this.t27 = t27;
            this.t28 = t28;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, R>> function) {
            return instance.ap28(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28);
        }
    }

    final class P29<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;
        private final App<F, T23> t23;
        private final App<F, T24> t24;
        private final App<F, T25> t25;
        private final App<F, T26> t26;
        private final App<F, T27> t27;
        private final App<F, T28> t28;
        private final App<F, T29> t29;

        public P29(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27, final App<F, T28> t28, final App<F, T29> t29) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
            this.t23 = t23;
            this.t24 = t24;
            this.t25 = t25;
            this.t26 = t26;
            this.t27 = t27;
            this.t28 = t28;
            this.t29 = t29;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, R>> function) {
            return instance.ap29(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29);
        }
    }

    final class P30<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;
        private final App<F, T23> t23;
        private final App<F, T24> t24;
        private final App<F, T25> t25;
        private final App<F, T26> t26;
        private final App<F, T27> t27;
        private final App<F, T28> t28;
        private final App<F, T29> t29;
        private final App<F, T30> t30;

        public P30(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27, final App<F, T28> t28, final App<F, T29> t29, final App<F, T30> t30) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
            this.t23 = t23;
            this.t24 = t24;
            this.t25 = t25;
            this.t26 = t26;
            this.t27 = t27;
            this.t28 = t28;
            this.t29 = t29;
            this.t30 = t30;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, R>> function) {
            return instance.ap30(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30);
        }
    }

    final class P31<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;
        private final App<F, T23> t23;
        private final App<F, T24> t24;
        private final App<F, T25> t25;
        private final App<F, T26> t26;
        private final App<F, T27> t27;
        private final App<F, T28> t28;
        private final App<F, T29> t29;
        private final App<F, T30> t30;
        private final App<F, T31> t31;

        public P31(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27, final App<F, T28> t28, final App<F, T29> t29, final App<F, T30> t30, final App<F, T31> t31) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
            this.t23 = t23;
            this.t24 = t24;
            this.t25 = t25;
            this.t26 = t26;
            this.t27 = t27;
            this.t28 = t28;
            this.t29 = t29;
            this.t30 = t30;
            this.t31 = t31;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, R>> function) {
            return instance.ap31(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31);
        }
    }

    final class P32<F extends K1, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32> {
        private final App<F, T1> t1;
        private final App<F, T2> t2;
        private final App<F, T3> t3;
        private final App<F, T4> t4;
        private final App<F, T5> t5;
        private final App<F, T6> t6;
        private final App<F, T7> t7;
        private final App<F, T8> t8;
        private final App<F, T9> t9;
        private final App<F, T10> t10;
        private final App<F, T11> t11;
        private final App<F, T12> t12;
        private final App<F, T13> t13;
        private final App<F, T14> t14;
        private final App<F, T15> t15;
        private final App<F, T16> t16;
        private final App<F, T17> t17;
        private final App<F, T18> t18;
        private final App<F, T19> t19;
        private final App<F, T20> t20;
        private final App<F, T21> t21;
        private final App<F, T22> t22;
        private final App<F, T23> t23;
        private final App<F, T24> t24;
        private final App<F, T25> t25;
        private final App<F, T26> t26;
        private final App<F, T27> t27;
        private final App<F, T28> t28;
        private final App<F, T29> t29;
        private final App<F, T30> t30;
        private final App<F, T31> t31;
        private final App<F, T32> t32;

        public P32(final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27, final App<F, T28> t28, final App<F, T29> t29, final App<F, T30> t30, final App<F, T31> t31, final App<F, T32> t32) {
            this.t1 = t1;
            this.t2 = t2;
            this.t3 = t3;
            this.t4 = t4;
            this.t5 = t5;
            this.t6 = t6;
            this.t7 = t7;
            this.t8 = t8;
            this.t9 = t9;
            this.t10 = t10;
            this.t11 = t11;
            this.t12 = t12;
            this.t13 = t13;
            this.t14 = t14;
            this.t15 = t15;
            this.t16 = t16;
            this.t17 = t17;
            this.t18 = t18;
            this.t19 = t19;
            this.t20 = t20;
            this.t21 = t21;
            this.t22 = t22;
            this.t23 = t23;
            this.t24 = t24;
            this.t25 = t25;
            this.t26 = t26;
            this.t27 = t27;
            this.t28 = t28;
            this.t29 = t29;
            this.t30 = t30;
            this.t31 = t31;
            this.t32 = t32;
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final Function32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, R> function) {
            return apply(instance, instance.point(function));
        }

        public <R> App<F, R> apply(final Applicative<F, ?> instance, final App<F, Function32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, R>> function) {
            return instance.ap32(function, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31, t32);
        }
    }
    // caramel end - Extended Codec
}
