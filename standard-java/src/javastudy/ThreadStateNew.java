package javastudy;

public class ThreadStateNew {
    public static void main(String[] args) {
        Thread threadStateNewExam = new Thread(new ThreadStateNewExam());
        System.out.println(threadStateNewExam.getState());
        threadStateNewExam.start();
    }

    static class ThreadStateNewExam implements Runnable {
        @Override
        public void run() {
            System.out.println("NEW 상태 !");
        }
    }
    /* 출력값
    NEW
    NEW 상태 !
     */
}
