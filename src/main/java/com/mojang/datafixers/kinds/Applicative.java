// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license.
package com.mojang.datafixers.kinds;

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

public interface Applicative<F extends K1, Mu extends Applicative.Mu> extends Functor<F, Mu> {
    static <F extends K1, Mu extends Applicative.Mu> Applicative<F, Mu> unbox(final App<Mu, F> proofBox) {
        return (Applicative<F, Mu>) proofBox;
    }

    interface Mu extends Functor.Mu {}

    <A> App<F, A> point(final A a);

    <A, R> Function<App<F, A>, App<F, R>> lift1(final App<F, Function<A, R>> function);

    default <A, B, R> BiFunction<App<F, A>, App<F, B>, App<F, R>> lift2(final App<F, BiFunction<A, B, R>> function) {
        return (fa, fb) -> ap2(function, fa, fb);
    }

    default <T1, T2, T3, R> Function3<App<F, T1>, App<F, T2>, App<F, T3>, App<F, R>> lift3(final App<F, Function3<T1, T2, T3, R>> function) {
        return (ft1, ft2, ft3) -> ap3(function, ft1, ft2, ft3);
    }

    default <T1, T2, T3, T4, R> Function4<App<F, T1>, App<F, T2>, App<F, T3>, App<F, T4>, App<F, R>> lift4(final App<F, Function4<T1, T2, T3, T4, R>> function) {
        return (ft1, ft2, ft3, ft4) -> ap4(function, ft1, ft2, ft3, ft4);
    }

    default <T1, T2, T3, T4, T5, R> Function5<App<F, T1>, App<F, T2>, App<F, T3>, App<F, T4>, App<F, T5>, App<F, R>> lift5(final App<F, Function5<T1, T2, T3, T4, T5, R>> function) {
        return (ft1, ft2, ft3, ft4, ft5) -> ap5(function, ft1, ft2, ft3, ft4, ft5);
    }

    default <T1, T2, T3, T4, T5, T6, R> Function6<App<F, T1>, App<F, T2>, App<F, T3>, App<F, T4>, App<F, T5>, App<F, T6>, App<F, R>> lift6(final App<F, Function6<T1, T2, T3, T4, T5, T6, R>> function) {
        return (ft1, ft2, ft3, ft4, ft5, ft6) -> ap6(function, ft1, ft2, ft3, ft4, ft5, ft6);
    }

    default <T1, T2, T3, T4, T5, T6, T7, R> Function7<App<F, T1>, App<F, T2>, App<F, T3>, App<F, T4>, App<F, T5>, App<F, T6>, App<F, T7>, App<F, R>> lift7(final App<F, Function7<T1, T2, T3, T4, T5, T6, T7, R>> function) {
        return (ft1, ft2, ft3, ft4, ft5, ft6, ft7) -> ap7(function, ft1, ft2, ft3, ft4, ft5, ft6, ft7);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, R> Function8<App<F, T1>, App<F, T2>, App<F, T3>, App<F, T4>, App<F, T5>, App<F, T6>, App<F, T7>, App<F, T8>, App<F, R>> lift8(final App<F, Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>> function) {
        return (ft1, ft2, ft3, ft4, ft5, ft6, ft7, ft8) -> ap8(function, ft1, ft2, ft3, ft4, ft5, ft6, ft7, ft8);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function9<App<F, T1>, App<F, T2>, App<F, T3>, App<F, T4>, App<F, T5>, App<F, T6>, App<F, T7>, App<F, T8>, App<F, T9>, App<F, R>> lift9(final App<F, Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>> function) {
        return (ft1, ft2, ft3, ft4, ft5, ft6, ft7, ft8, ft9) -> ap9(function, ft1, ft2, ft3, ft4, ft5, ft6, ft7, ft8, ft9);
    }

    default <A, R> App<F, R> ap(final App<F, Function<A, R>> func, final App<F, A> arg) {
        return lift1(func).apply(arg);
    }

    default <A, R> App<F, R> ap(final Function<A, R> func, final App<F, A> arg) {
        return map(func, arg);
    }

    default <A, B, R> App<F, R> ap2(final App<F, BiFunction<A, B, R>> func, final App<F, A> a, final App<F, B> b) {
        final Function<BiFunction<A, B, R>, Function<A, Function<B, R>>> curry = f -> a1 -> b1 -> f.apply(a1, b1);
        return ap(ap(map(curry, func), a), b);
    }

    default <T1, T2, T3, R> App<F, R> ap3(final App<F, Function3<T1, T2, T3, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3) {
        return ap2(ap(map(Function3::curry, func), t1), t2, t3);
    }

    default <T1, T2, T3, T4, R> App<F, R> ap4(final App<F, Function4<T1, T2, T3, T4, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4) {
        return ap2(ap2(map(Function4::curry2, func), t1, t2), t3, t4);
    }

    default <T1, T2, T3, T4, T5, R> App<F, R> ap5(final App<F, Function5<T1, T2, T3, T4, T5, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5) {
        return ap3(ap2(map(Function5::curry2, func), t1, t2), t3, t4, t5);
    }

    default <T1, T2, T3, T4, T5, T6, R> App<F, R> ap6(final App<F, Function6<T1, T2, T3, T4, T5, T6, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6) {
        return ap3(ap3(map(Function6::curry3, func), t1, t2, t3), t4, t5, t6);
    }

    default <T1, T2, T3, T4, T5, T6, T7, R> App<F, R> ap7(final App<F, Function7<T1, T2, T3, T4, T5, T6, T7, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7) {
        return ap4(ap3(map(Function7::curry3, func), t1, t2, t3), t4, t5, t6, t7);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, R> App<F, R> ap8(final App<F, Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8) {
        return ap4(ap4(map(Function8::curry4, func), t1, t2, t3, t4), t5, t6, t7, t8);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> App<F, R> ap9(final App<F, Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9) {
        return ap5(ap4(map(Function9::curry4, func), t1, t2, t3, t4), t5, t6, t7, t8, t9);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> App<F, R> ap10(final App<F, Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10) {
        return ap5(ap5(map(Function10::curry5, func), t1, t2, t3, t4, t5), t6, t7, t8, t9, t10);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R> App<F, R> ap11(final App<F, Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11) {
        return ap6(ap5(map(Function11::curry5, func), t1, t2, t3, t4, t5), t6, t7, t8, t9, t10, t11);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R> App<F, R> ap12(final App<F, Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12) {
        return ap6(ap6(map(Function12::curry6, func), t1, t2, t3, t4, t5, t6), t7, t8, t9, t10, t11, t12);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R> App<F, R> ap13(final App<F, Function13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13) {
        return ap7(ap6(map(Function13::curry6, func), t1, t2, t3, t4, t5, t6), t7, t8, t9, t10, t11, t12, t13);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R> App<F, R> ap14(final App<F, Function14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14) {
        return ap7(ap7(map(Function14::curry7, func), t1, t2, t3, t4, t5, t6, t7), t8, t9, t10, t11, t12, t13, t14);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R> App<F, R> ap15(final App<F, Function15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15) {
        return ap8(ap7(map(Function15::curry7, func), t1, t2, t3, t4, t5, t6, t7), t8, t9, t10, t11, t12, t13, t14, t15);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R> App<F, R> ap16(final App<F, Function16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16) {
        return ap8(ap8(map(Function16::curry8, func), t1, t2, t3, t4, t5, t6, t7, t8), t9, t10, t11, t12, t13, t14, t15, t16);
    }

    // caramel start - Extended Codec
    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R> App<F, R> ap17(final App<F, Function17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17) {
        return ap9(ap8(map(Function17::curry8, func), t1, t2, t3, t4, t5, t6, t7, t8), t9, t10, t11, t12, t13, t14, t15, t16, t17);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R> App<F, R> ap18(final App<F, Function18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18) {
        return ap9(ap9(map(Function18::curry9, func), t1, t2, t3, t4, t5, t6, t7, t8, t9), t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R> App<F, R> ap19(final App<F, Function19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19) {
        return ap10(ap9(map(Function19::curry9, func), t1, t2, t3, t4, t5, t6, t7, t8, t9), t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R> App<F, R> ap20(final App<F, Function20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20) {
        return ap10(ap10(map(Function20::curry10, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10), t11, t12, t13, t14, t15, t16, t17, t18, t19, t20);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R> App<F, R> ap21(final App<F, Function21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21) {
        return ap11(ap10(map(Function21::curry10, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10), t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R> App<F, R> ap22(final App<F, Function22<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22) {
        return ap11(ap11(map(Function22::curry11, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11), t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, R> App<F, R> ap23(final App<F, Function23<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23) {
        return ap12(ap11(map(Function23::curry11, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11), t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R> App<F, R> ap24(final App<F, Function24<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24) {
        return ap12(ap12(map(Function24::curry12, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12), t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, R> App<F, R> ap25(final App<F, Function25<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25) {
        return ap13(ap12(map(Function25::curry12, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12), t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, R> App<F, R> ap26(final App<F, Function26<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26) {
        return ap13(ap13(map(Function26::curry13, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13), t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, R> App<F, R> ap27(final App<F, Function27<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27) {
        return ap14(ap13(map(Function27::curry13, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13), t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, R> App<F, R> ap28(final App<F, Function28<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27, final App<F, T28> t28) {
        return ap14(ap14(map(Function28::curry14, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14), t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, R> App<F, R> ap29(final App<F, Function29<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27, final App<F, T28> t28, final App<F, T29> t29) {
        return ap15(ap14(map(Function29::curry14, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14), t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, R> App<F, R> ap30(final App<F, Function30<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27, final App<F, T28> t28, final App<F, T29> t29, final App<F, T30> t30) {
        return ap15(ap15(map(Function30::curry15, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15), t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, R> App<F, R> ap31(final App<F, Function31<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27, final App<F, T28> t28, final App<F, T29> t29, final App<F, T30> t30, final App<F, T31> t31) {
        return ap16(ap15(map(Function31::curry15, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15), t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, R> App<F, R> ap32(final App<F, Function32<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26, T27, T28, T29, T30, T31, T32, R>> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9, final App<F, T10> t10, final App<F, T11> t11, final App<F, T12> t12, final App<F, T13> t13, final App<F, T14> t14, final App<F, T15> t15, final App<F, T16> t16, final App<F, T17> t17, final App<F, T18> t18, final App<F, T19> t19, final App<F, T20> t20, final App<F, T21> t21, final App<F, T22> t22, final App<F, T23> t23, final App<F, T24> t24, final App<F, T25> t25, final App<F, T26> t26, final App<F, T27> t27, final App<F, T28> t28, final App<F, T29> t29, final App<F, T30> t30, final App<F, T31> t31, final App<F, T32> t32) {
        return ap16(ap16(map(Function32::curry16, func), t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16), t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27, t28, t29, t30, t31, t32);
    }
    // caramel end - Extended Codec

    default <A, B, R> App<F, R> apply2(final BiFunction<A, B, R> func, final App<F, A> a, final App<F, B> b) {
        return ap2(point(func), a, b);
    }

    default <T1, T2, T3, R> App<F, R> apply3(final Function3<T1, T2, T3, R> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3) {
        return ap3(point(func), t1, t2, t3);
    }

    default <T1, T2, T3, T4, R> App<F, R> apply4(final Function4<T1, T2, T3, T4, R> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4) {
        return ap4(point(func), t1, t2, t3, t4);
    }

    default <T1, T2, T3, T4, T5, R> App<F, R> apply5(final Function5<T1, T2, T3, T4, T5, R> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5) {
        return ap5(point(func), t1, t2, t3, t4, t5);
    }

    default <T1, T2, T3, T4, T5, T6, R> App<F, R> apply6(final Function6<T1, T2, T3, T4, T5, T6, R> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6) {
        return ap6(point(func), t1, t2, t3, t4, t5, t6);
    }

    default <T1, T2, T3, T4, T5, T6, T7, R> App<F, R> apply7(final Function7<T1, T2, T3, T4, T5, T6, T7, R> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7) {
        return ap7(point(func), t1, t2, t3, t4, t5, t6, t7);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, R> App<F, R> apply8(final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8) {
        return ap8(point(func), t1, t2, t3, t4, t5, t6, t7, t8);
    }

    default <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> App<F, R> apply9(final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> func, final App<F, T1> t1, final App<F, T2> t2, final App<F, T3> t3, final App<F, T4> t4, final App<F, T5> t5, final App<F, T6> t6, final App<F, T7> t7, final App<F, T8> t8, final App<F, T9> t9) {
        return ap9(point(func), t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }
}
