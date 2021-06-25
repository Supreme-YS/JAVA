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
        System.out.println(2 * 9);
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
        // 변수를 사용한 4단
        int dan = 4;
//        System.out.println(dan);
        System.out.println(dan * 1);
        System.out.println(dan * 2);
        System.out.println(dan * 3);
        System.out.println(dan * 4);
        System.out.println(dan * 5);
        System.out.println(dan * 6);
        System.out.println(dan * 7);
        System.out.println(dan * 8);
        System.out.println(dan * 9);
        System.out.println("*****");
        // 사용자 입력을 받는 5단
        System.out.println("구구단 중 몇 단을 알고싶은가 자네");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number * 1);
        System.out.println(number * 2);
        System.out.println(number * 3);
        System.out.println(number * 4);
        System.out.println(number * 5);
        System.out.println(number * 6);
        System.out.println(number * 7);
        System.out.println(number * 8);
        System.out.println(number * 9);
    }
}