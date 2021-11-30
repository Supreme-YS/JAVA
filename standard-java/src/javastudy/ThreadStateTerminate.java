package javastudy;

public class ThreadStateTerminate implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadStateTerminate());
        thread.start();

        Thread.sleep(1000);
        System.out.println(thread.getState());
    }
    @Override
    public void run() {

    }
}
/* 출력값
    TERMINATED
 */