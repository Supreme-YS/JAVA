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
        // 람다식 표현 - 2
        Function<Integer, Integer> plus30 = (i) -> i+20;
    }
}
