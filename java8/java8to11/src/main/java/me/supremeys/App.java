package me.supremeys;

import java.util.Arrays;
import java.util.function.*;

public class App {

    public static void main(String[] args) {

        UnaryOperator<String> hi = (s) -> "hi" + s;

        // 생성자 참조 - 입력값은 없고, 결과값은 있는 Supplier
        Supplier<Greeting> newGreeting = Greeting::new;
        System.out.println("Greeting 기본 생성자 반환 : " + newGreeting.get()); // 이때, 인스턴스가 생성된다.

        // 생성자 참조 2 - 입력값이 있고, 결과값도 있는 Function이 적합
        Function<String, Greeting> newGreeting2 = Greeting::new;
        Greeting supreme = newGreeting2.apply("supreme");
        System.out.println(supreme.getName());

        // Instance Method
        Greeting greeting = new Greeting();
        UnaryOperator<String> hiUsedByInstanceMethod = greeting::hello;
        System.out.println(hiUsedByInstanceMethod.apply("Supreme"));

        // Static Method
        UnaryOperator<String> hiUsedByStaticMethod = Greeting::hi;
        System.out.println(hiUsedByStaticMethod.apply("Supreme"));

        // 임의 객체의 메서드 참조
        String[] names = {"ys", "supreme", "excelsior"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
