package com.edu.loop.test;

/**
 * 
 * Looping
 * ::
 * break
 * continue
 *
 */

public class BasicLoopingTest {

	public static void main(String[] args) {
		
		int total = 0; //필드가 아닌 메서드 안에 선언된 변수이기 때문에 초기화 필수
		
//		for (int num = 1; num <= 10; num++) {
////			total = total + num;
//			if (total >= 30) break;
//			total += num;
//		}
//		// 1~10까지 홀수의 합
		for (int num = 1; num <= 10; num++) {
			if (num % 2 == 0) continue; //break는 반복을 멈추지만, continue는 반복을 계속시킨다.
			total += num;
		}
		System.out.println("total :: " + total);

	}

}
