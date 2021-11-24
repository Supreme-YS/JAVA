package ch2;

public class Ex2_7 {
    public static void main(String[] args) {

        String name = "JA" + "VA";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + ""); // 14, 숫자 + 숫자 + 문자열
        System.out.println("" + 7 + 7); // 77, 문자열 + 문자열 + 문자열
    }
}
