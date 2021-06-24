package basic.java;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args){
        // 2단
        System.out.println(2 * 1);
        System.out.println(2 * 2);
        System.out.println(2 * 3);
        System.out.println(2 * 4);
        System.out.println(2 * 5);
        System.out.println(2 * 6);
        System.out.println(2 * 7);
        System.out.println(2 * 8);
        System.out.println(2 * 9); // 한 줄 복사 cmd + d
        System.out.println("*****");
        // 3단
        System.out.println(3 * 1);
        System.out.println(3 * 2);
        System.out.println(3 * 3);
        System.out.println(3 * 4);
        System.out.println(3 * 5);
        System.out.println(3 * 6);
        System.out.println(3 * 7);
        System.out.println(3 * 8);
        System.out.println(3 * 9);
        System.out.println("*****");
        // 변수를 활용한 4단
        int result = 4 * 1;
        System.out.println(result);
        // 사용자에게 입력을 받고 값을 출력하기
        System.out.println("구구단 중 출력할 단은?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number : " + number);

        int results = number * 1;
        System.out.println(results);
        results = number * 2;
        System.out.println(results);
        results = number * 3;
        System.out.println(results);
        results = number * 4;
        System.out.println(results);
        results = number * 5;
        System.out.println(results);
        results = number * 6;
        System.out.println(results);
        results = number * 7;
        System.out.println(results);
        results = number * 8;
        System.out.println(results);
        results = number * 9;
        System.out.println(results);
    }
}