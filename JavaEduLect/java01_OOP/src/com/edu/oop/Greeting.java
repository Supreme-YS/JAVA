package com.edu.oop;

/*
 * 대상을 저장하는 공간
 * 인사말을 저장하는 공간 > Variable(값이 저장되는 공간)
 * 
 * 특정 대상에서 인삿말을 콘솔로 출력하는 기능 > Method
 * 
 * 클래스 구성 요소 : 필드 + 메서드
 */
public class Greeting {
	
	//1. 필드(Member 변수)선언 
	public String who;
	public String greet;
	
	//2. 메서드 정의 = 선언부 + 구현부 
	public void sayHello() {
		System.out.println(who+" , "+ greet);
	}
	// 값을 주입한 상태가 객체다. 클래스(틀)만으로는 객체가 아니다.
}
