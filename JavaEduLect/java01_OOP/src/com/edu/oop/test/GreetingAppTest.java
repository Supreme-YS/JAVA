package com.edu.oop.test;

import com.edu.oop.Greeting;

/*
 * 실행 클래스는 Main 메서드를 가진다
 * 실행 클래스의 역할
 * ::
 * 1. 메모리에 클래스의 멤버드를 다 올린다(Load) == 객체 생성
 * 2. 접근
 * 	  필드 접근----> 값 할당, 초기화
 *    메서드 접근 ---> 함수 호출 
 */
public class GreetingAppTest {

	public static void main(String[] args) {
		//1. 메모리에 클래스 멤버들(Greeting 변수(2)+메서드(1)을 다 올린다. == 객체 생성
		Greeting hello = new Greeting();
		
		//2. 변수에 값 저장(할당)...*필드초기화*
		hello.who = "롯데정보통신 사원 여러분";
		hello.greet = "안녕하세요";
		
		//3. 메서드(함수)를 동작
		hello.sayHello();//호출
	}
}
