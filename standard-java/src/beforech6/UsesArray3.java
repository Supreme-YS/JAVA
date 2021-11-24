package beforech6;

import java.util.Arrays;

// 랜덤 숫자 셔플
public class UsesArray3 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for (int i=0; i<100; i++) {
            int n = (int)(Math.random() * 10); // 0~9까지 정수형 난수 생성
            int temp = 0;
            temp = numArr[0];

            numArr[0] = numArr[n];
            numArr[n] = temp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
