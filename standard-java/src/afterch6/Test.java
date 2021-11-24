package afterch6;
/* N을 입력받아 1~N의 합을 구하는 코드 */
/* 공식을 이용해보자 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum = a * (a + 1) / 2;

        System.out.println(sum);
    }
}