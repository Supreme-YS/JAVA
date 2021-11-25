package ch8;

public class Ex8_2 {
    public static void main(String args[]) {
        System.out.println(1);
        try {
            System.out.println(0/0); // ArithmeticException 에러! 0으로 나눌 수 없음.
            System.out.println(2); 	// 실행되지 않는다.
        } catch (ArithmeticException ae) { // 에러 발생했으니 catch문 실행
            System.out.println(3);
        }	// try-catch의 끝
        System.out.println(4);
    }	// main메서드의 끝
    // 1
    // 3
    // 4 출력!
}
