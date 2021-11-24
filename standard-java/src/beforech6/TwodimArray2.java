package beforech6;

public class TwodimArray2 {
    public static void main(String[] args) {
        int[][] score = {
                { 100, 100, 100 },
                { 20, 20, 20},
                { 30, 30, 30},
                { 40, 40, 40}
        }; // new int[4][3]
        int sum = 0;

        System.out.println(score.length); // 4 출력
        // 배열의 모든 요소의 합
        for (int i=0; i<score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

                sum = sum + score[i][j];
            }
        }
        System.out.println("sum =" + sum);
    }
}
