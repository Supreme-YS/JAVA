package com.edu.condition.test;

import java.util.Scanner;

/**
 * 
 *  % ---나머지
 *  / ---몫
 *  Scanner를 통해서
 *  10~99사이의 정수를 하나 입력
 *  3의 배수가 들어있는 숫자에는 @를 표시
 *  31 --> @
 *  11 --> 11
 *  96 --> @@
 */

public class OperatorTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >>> ");
		int n = sc.nextInt();
		
		int start = n / 10;
		int end = n % 10;
		
		if (start == 3 | start == 6 | start == 9) {
			if (end == 3 || end == 6 || end == 9) {
				System.out.println("@@");
				System.exit(0);
			}
			System.out.println("@");
		} else if  (end == 3 || end == 6 || end == 9) {
			System.out.println("@");
		} else {
			System.out.println(n);
		}
		
	}

}
