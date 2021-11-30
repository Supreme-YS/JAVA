package javastudy;


public class ThreadExample {

    public static void main(String[] args) {

        RunThread runThread = new RunThread(); // Thread 객체 생성
        runThread.start(); // start() 메서드를 호출하면 Thread가 실행된다.
        // start() 메서드는 Thread 객체의 run() 메서드를 호출한다.
    }

    // java.lang.Thread 클래스를 상속받는다.
    static class RunThread extends Thread {

        // 이 클래스에서 상위 클래스인 Thread의 run() 메서드를 상속받아 메서드를 재정의해야 실행부분을 작성할 수 있다.
        @Override
        public void run() {
            super.run();
            System.out.println("쓰레드 실행");
        }
    }
}
