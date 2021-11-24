package beforech6;

// 배열의 모든 요소를 더해서 총합과 평균을 구하기
public class UsesArray1 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i<score.length; i++){
            sum = sum + score[i];
        }

        average = sum / (float)score.length;

        System.out.println("총합 = "+ sum);
        System.out.println("평균 = "+ average);
    }
}
