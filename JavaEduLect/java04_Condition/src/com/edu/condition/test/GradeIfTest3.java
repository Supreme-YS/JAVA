package com.edu.condition.test;

import java.util.Scanner;

/**
 * step3 
 * 이전의 if문을 switch 문으로 변경해서 사용
 */
public class GradeIfTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적 입력 >>>>");
		int grade = sc.nextInt();
		
		
		switch(grade) {
		
			case 95:
			case 90:
				System.out.println("A grade...");
				break;//케이스를 빠져나오고 스위치까지 끈다.
			case 85:
			case 80:
				System.out.println("B grade...");
				break;
			case 75:
			case 70:
				System.out.println("C grade...");
				break;
			default:
				System.out.println("Nuts!");
		
		} //switch
	} //main
}//class
