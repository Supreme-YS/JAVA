package com.edu.condition.test;

import java.util.Scanner;

/**
 * step 2.
 * 실행할 때마다 서로 다른 성적을 입력 받을 수 있도록 하겠다.
 * Scanner 객체를 이용..
 */
public class GradeIfTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적 입력 >>>>");
		int grade = sc.nextInt();
		
		
		System.out.println("과목 입력 >>>>");
		String subject = sc.next();
		
		
		if (grade <= 100 && grade > 90) System.out.println(subject + " A Grade...");
		else if (grade <= 90 && grade > 80) System.out.println(subject + " B Grade...");
		else if (grade <= 80 && grade > 70) System.out.println(subject + " C Grade...");
		else System.out.println("Try again!");
	}

}
