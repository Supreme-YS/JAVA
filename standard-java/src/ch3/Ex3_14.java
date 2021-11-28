package ch3;

public class Ex3_14 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.println("abc" == "abc");
        System.out.println(str1 == "abc");
        System.out.println(str2 == "abc"); // 내용은 같지만 서로 다른 객체라서 false
        System.out.println(str1.equals("abc")); // true
        System.out.println(str2.equals("abc")); // true
        System.out.println(str2.equals("ABC")); // false
        System.out.println(str2.equalsIgnoreCase("ABC")); // true, 대소문자를 구별하지 않고 비교!
    }
}
