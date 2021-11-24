package beforech6;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Scanner 클래스의 객체를 생성
        System.out.print("두 자리 정수 하나 입력해주세요. >");
        String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
        int num = Integer.parseInt(input); // 입력받은 문자를 int타입의 정수로 변환

        // 하지만 Scanner에는 nextInt(), nextFloat()와 같은 메서드를 통해 숫자를 바로 입력받을 수 있는 메서드가 있다.
        // int num2 = scanner.nextInt(); // 바로 숫자로 입력받는다.

        System.out.println("입력내용 : "+input);
        System.out.printf("num=%d%n", num);
    }
}
