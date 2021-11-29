package ch8;

public class Ex8_6 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시킨 에러");
            throw e; // 예외를 발생시킴
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

        // Exception 인스턴스를 생성할 때, 생성자에 String을 넣어주면
        // String이 Exception 인스턴스 메시지로 저장된다.
    }
}
