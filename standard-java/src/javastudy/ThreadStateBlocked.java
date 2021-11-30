package javastudy;

public class ThreadStateBlocked {
    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = new Thread(new MakeThread());
        Thread secondThread = new Thread(new MakeThread());

        firstThread.start();
        secondThread.start();

        Thread.sleep(3000);

        System.out.println("firstThread = " + firstThread);
        System.out.println("firstThread state = " + firstThread.getState());
        System.out.println("secondThread = " + secondThread);
        System.out.println("secondThread = " + secondThread.getState());
        System.exit(0);
    }
}

class MakeThread implements Runnable {
    @Override
    public void run() {
        makeThread();
    }

    public static synchronized void makeThread() {
        while (true){
            // 쓰레드가 실행되고 있다는 가정하에
            // 만약 새로운 쓰레드가 생성이 된다면, 먼저 시작한 쓰레드가 처리를 마칠때까지
            // 다른 쓰레드를 실행시킬 수 없다.
        }
    }
}

/* 출력값
    firstThread = Thread[Thread-0,5,main]
    firstThread state = RUNNABLE
    secondThread = Thread[Thread-1,5,main]
    secondThread = BLOCKED
 */