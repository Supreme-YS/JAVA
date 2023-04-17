package me.supremeys;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo2 {
    public static void main(String[] args) {

//        Supplier<Integer> get10 = () -> 10;
//
//        UnaryOperator<Integer> plus10 = (i) -> i + 10;
//        UnaryOperator<Integer> multiplyTwo  = (i) -> i * 2;

        Foo2 foo2 = new Foo2();
        foo2.run();


    }
    private void run() {
        int baseNumber = 10;

        // Local Class
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); // 11 , Shadowing
            }
        }

        // Anonymous Class
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) { // Shadowing
                System.out.println(baseNumber);
            }
        };

        // Lambda
//        IntConsumer printInt = (baseNumber) -> {
//            System.out.println(baseNumber + baseNumber);
//        }; // 불가

        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        }; // 같은 Scope ! Shadowing X, Effective Final 이어야만 한다. 나중에 값을 바꾸면 안됨.

        printInt.accept(10);
    }
}
