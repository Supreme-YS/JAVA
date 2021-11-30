package javastudy;

public class ThreadStateTimeWaiting {
    public static void main(String[] args) throws InterruptedException {
        Thread presentThread = new Thread(new PresentThread());
        presentThread.start(); // 현재 쓰레드 시작

        Thread.sleep(1000);
        System.out.println("presentThread state : " + presentThread.getState());

        Thread.sleep(6000);
        System.out.println("presentThread state : " + presentThread.getState());
    }
}

class PresentThread implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("쓰레드 실행중입니다.");

        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            ie.printStackTrace();
        }
    }
    // 먼저 실행은 되지만, start()를 호출했고 -> run() 실행되니,
    // 기존에 실행되던 쓰레드는 잠시 멈추고, PresentThread의 클래스의 run() 메서드가 실행됨
    // 따라서 기존 쓰레드는 TIMED_WAITING 상태로 전환되고 호출스택에 있는 클래스를 실행
    // 이후, 기존 쓰레드는 TERMINATE 된다.
}

/* 출력값
    presentThread state : TIMED_WAITING
    쓰레드 실행중입니다.
    presentThread state : TERMINATED
 */