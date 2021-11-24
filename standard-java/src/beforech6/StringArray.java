package beforech6;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] strArr = new String[3];
        System.out.println(Arrays.toString(strArr)); // 참조형 변수인 String은 기본값으로 null값을 가진다. <-> 기본형은 0의 값을 가진다.

        String[] strArr2 = {"rock", "scissors", "paper"};
        System.out.println(Arrays.toString(strArr2));

        for (int i = 0; i < 10; i++){
            int n = (int)(Math.random() * 3);
            System.out.println(strArr2[n]);
        }
    }
}
