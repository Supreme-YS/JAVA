package ch8;

public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0); // ArithmeticException 에러 발생
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) { // ae 참조 변수가 ArithmeticException의 객체인지 확인 true 값 반환
                System.out.println("true");
                System.out.println("ArithmeticException");
            }
        } catch (Exception e) { // Exception : 모든 예외의 최고 조상, 따라서 catch 블럭에서 맨 마지막에 와야함. 구체적인 에러를 잡기 위해ㅣ.
            System.out.println("Exception");
        } // try-catch의 끝
        System.out.println(6);
    } // main 메서드의 끝
    /**
     * 1
     * 2
     * 3
     * true
     * ArithmeticException
     * 6
     */
}
