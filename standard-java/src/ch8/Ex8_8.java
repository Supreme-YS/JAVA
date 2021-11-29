package ch8;

public class Ex8_8 {
    public static void main(String[] args) {
        throw new RuntimeException(); // RuntimeException을 고의로 발생
        // RuntimeException클래스와 그 자손에 해당되는 예외는 프로그래머가 실수로 발생하는 것이기 때문에
        // 예외처리를 강조하지 않는 것
    }
}
