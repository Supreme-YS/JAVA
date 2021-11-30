package javastudy;

public class ThreadStateRunnable {
    public static void main(String[] args) {
        Thread threadStateRunnableExam = new Thread(new ThreadStateRunnableExam());
        System.out.println(threadStateRunnableExam.getState());
        threadStateRunnableExam.start();
        System.out.println(threadStateRunnableExam.getState());
    }

    static class ThreadStateRunnableExam implements Runnable {
        @Override
        public void run() {
            System.out.println("RUNNABLE 상태 !");
        }
    }
    /* 출력값
    NEW
    RUNNABLE
    RUNNABLE 상태 !
     */
}
