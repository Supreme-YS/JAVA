package beforech6;

public class ArrayLength {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 길이가 5인 arr int혀 배열 생성
        System.out.println("arr length = "+arr.length);

        for(int i=0; i < arr.length; i++){
            System.out.println("arr["+i+"]=" + arr[i]);
        }

        // 초기화 방법
        int[] score = new int[]{1,2,3,4,5};
        for(int i=0; i < score.length; i++){
            System.out.println("score["+i+"]="+score[i]);
        }

        int[] new_score = {1,2,3,4,5};
        for(int i=0; i < new_score.length; i++){
            System.out.println("new_score["+i+"]="+new_score[i]);
        }
    }
}
