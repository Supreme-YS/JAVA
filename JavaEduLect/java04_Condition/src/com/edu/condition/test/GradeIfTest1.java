package com.edu.condition.test;

/**
 * Short Circuit
 * & 와 &&
 * &&는 실행시간을 단축시킴 (만일, 앞의 연산이 F면 뒤에 수행을 안함)
 * 뒤에 연산을 실행함으로써 발생할 수 있는 에러를 없앤다.
 * 
 * step 2.
 * 실행할 때마다 서로 다른 성적을 입력 받을 수 있도록 하겠다.
 * Scanner 객체를 이용..
 */
public class GradeIfTest1 {

	public static void main(String[] args) {
		
		int grade = 88; //로컬 변수 초기화
		if (grade <= 100 && grade > 90) { //연산 수행 결과로 true, false 값으로 리턴되는 값이어야만 한다.
			System.out.println("A Grade...");
		}
		else if (grade <= 90 && grade > 80) {
			System.out.println("B Grade...");
		}
		else if (grade <= 80 && grade > 70) {
			System.out.println("C Grade...");
		}
		else { // 조건식이 들어가면 안된다.
			System.out.println("Try again!");
		}
	}

}
