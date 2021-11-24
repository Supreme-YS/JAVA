package beforech6;

// 2차원 배열
public class TwodimArray1 {
    public static void main(String[] args) {
        int[][] score = new int[4][3]; // 4행 3열의 2차원 배열 생성

        score[0][0] = 100; // 1행 1열에 값을 저장
        System.out.println(score[0][0]);

        // 초기화 방법
        int[][] arr = { {1,2,3},
                {4,5,6}}; // 1차원 배열의 배열. 1차원 배열 여러개의 참조 변수를 1차원 배열로 묶
        // {1,2,3}의 이름 arr[0], {4,5,6}의 이름 arr[1]
    }
}

