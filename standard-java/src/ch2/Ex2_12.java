package ch2;

public class Ex2_12 {
    public static void main(String[] args) {

        String str = "3";

        System.out.println(str.charAt(0) - '0'); // 문자열 -> 문자(charAt(0)) -> 숫자( - '0') = 숫자
        System.out.println('3' - '0' + 1); // 문자 - '0' = 숫자 , 숫자 + 숫자 = 숫자
        System.out.println(Integer.parseInt("3") + 1); // 문자열 -> 숫자 , 숫자 + 숫자 = 숫자
        System.out.println("3" + 1); // 문자열 + 숫자 = 문자열
        System.out.println((char) (3 + '0')); // 숫자를 문자로 변환 = 문자
    }
}
