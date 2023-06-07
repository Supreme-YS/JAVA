package com.edu.capsulation.test;

import java.util.Scanner;

import com.edu.capsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월입력 >>> ");
		int month = sc.nextInt();
		
		System.out.println("날짜입력 >>> ");
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
//		md.month = 13;
//		md.day = 33;
		
		// 값을 함수로 넣는 이유 : 직접적으로 넣으면 끝 --> 함수는 수정이 가능하니까 Valid 한 값만 필드에 할당되도록
		md.setMonth(month);
		md.setDay(day);
		
		System.out.println("Today is " + md.getMonth() + " , " + md.getDay());
		
	}

}
