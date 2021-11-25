package ch8;

public class Ex8_1 {
    public static void main(String args[]) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(3);
        } catch (Exception e)    { // 에러 발생하지 않음
            System.out.println(4); // 내부 구문이 실행되지 않음
        }
        System.out.println(5);
        // 1
        // 2
        // 3
        // 5 출력!
    }
}
