package ch3;

public class Ex3_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.println(b); // t
        System.out.println(!b); // f
        System.out.println(!!b); // t
        System.out.println(!!!b); // f
        System.out.println();

        System.out.println(ch); // C
        System.out.println(ch < 'a' || ch > 'z'); // true
        System.out.println(!('a' <= ch && ch <= 'z')); // true
        System.out.println('a' <= ch && ch <='z'); // false
    }
}
