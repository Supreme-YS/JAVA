package basic.java;

import java.util.Scanner;

public class Gugudan2 {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number :" + number);

        if (number < 2){
            System.out.println("2 이상의 숫자를 입력하세욧");
        }
        else if (number > 9){
            System.out.println("9 보다는 작은 숫자를 입력하세요");
        }
        else{
            for (int i = 1; i < 10; i++){
                System.out.println(i * number);
            }
        }
    }
}
