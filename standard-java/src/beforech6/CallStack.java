package beforech6;

public class CallStack {
    public static void main(String[] args) {
        System.out.println("Call Stack");
        // main 메서드 실행 -> println 메서드 호출 -> main 메서드 대기
        // -> println 메서드 실행 -> 작업 마친 후 메모리 반환 후 -> main 메소드 실행 상태 전환
        // -> 더이상 호출할 메서드가 없으므로 프로그램 종료
    }
}
