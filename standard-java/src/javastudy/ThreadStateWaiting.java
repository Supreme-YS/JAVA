package javastudy;

public class ThreadStateWaiting implements Runnable {

    public static Thread firstThread;

    public static void main(String[] args) {
        firstThread = new Thread(new ThreadStateWaiting()); // 첫번째 쓰레드를 생성한다.
        firstThread.start(); // 첫번째 쓰레드를 실행했다.
    }

    @Override
    public void run() {
        Thread eventThread = new Thread(new EventThread()); // 새로운 이벤트 쓰레드가 발생했다.
        eventThread.start(); // 새로운 이벤트 시작

        try {
            eventThread.join(); // 쓰레드를 join 한다.
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            ie.printStackTrace();
        }
    }
}

class EventThread implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("새로운 이벤트가 발생했을 때");
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt(); // 현재 쓰레드를 인터럽트 상태로 하고
            ie.printStackTrace();
        }
        // 이벤트에 대해 선 처리한다.
        // 생긴 이벤트가 종료될 때까지 기존에 진행하던 쓰레드는 잠시 멈춤 상태로 기다린다.
        System.out.println("기존 스레드는 잠시 : " + ThreadStateWaiting.firstThread.getState());
        // 기존 쓰레드의 상태를 출력해보자
    }
}

/* 출력값
   새로운 이벤트가 발생했을 때
   기존 스레드는 잠시 : WAITING
 */