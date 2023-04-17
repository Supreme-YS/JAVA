package me.supremeys;

import java.util.function.Function;

public class Foo {

    public static void main(String[] args) {

        // 클래스 활용
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(10));

        // 람다식 표현 - 1
        Function<Integer, Integer> plus20 = (i) -> {
            return i + 20;
        };
        System.out.println(plus20.apply(10));
        // 람다식 표현 - 2
        Function<Integer, Integer> plus30 = (i) -> i+20;
        System.out.println(plus30.apply(30));

        // Higher-Order Functions
        Function<Integer, Integer> minusOne = (i) -> i-1;
        Function<Integer, Integer> multiplyTwo = (i) -> i*2;

        Function<Integer, Integer> multiplyTwoAndMinusOne = minusOne.compose(multiplyTwo);
        System.out.println(multiplyTwoAndMinusOne.apply(10));

    }
}
