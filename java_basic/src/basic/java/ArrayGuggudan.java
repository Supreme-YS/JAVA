package basic.java;

public class ArrayGuggudan {
    public static void main(String[] args) {
        System.out.println("Array GUGUDAN");
        // 배열의 크기가 9인 result 배열 생성
        int [] result = new int[9];
        // 배열의 크기(길이) 출력
        System.out.println("array의 길이 " + result.length);

        for (int i = 0; i < result.length; i++){
            // i 는 0부터 9까지 증가
            // result 배열의 인덱스(주소값)에 연산 이후의 값을 담기
            result[i] = 2 * (i + 1);
        }
        for (int i = 0; i < result.length; i++ ){
            // result의 담긴 값들을 출력하기
            System.out.println(result[i]);
        }
        int [] dan3 = new int[9];
        for (int i = 0; i < dan3.length; i++) {
            dan3[i] = 3 * (i + 1);
        }
        for (int i = 0; i < dan3.length; i++) {
            System.out.println(dan3[i]);
        }
    }
}
