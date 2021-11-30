package javastudy;

// 인터페이스 상속
class RunThread implements Runnable {

    @Override
    public void run() {
        System.out.println("쓰레드 실행");
    }
}

public class ThreadExampleRunnable {
    public static void main(String[] args) {
        // Runnable 인터페이스를 이용해서 쓰레드를 만들 경우
        // 객체 생성시 Thread 타입으로 객체를 생성해야 한다.
        // 실제로 Runnable 인터페이스에는 run() 메서드 밖에 없는데.
        // 이 메서드를 실행케 하는게 start() 메서드가 Thread 클래스에 있기 때문이다.
        // 따라서 Thread 타입으로 객체를 생성해야 한다.
        Thread runThread = new Thread(new RunThread());
        runThread.start();
    }
}
