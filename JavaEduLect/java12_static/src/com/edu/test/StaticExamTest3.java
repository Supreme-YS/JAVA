/*
				Modifier
				
	Access						Usage
	-public						-static
	-protected					-final
	-private					-abstract
								-synchronized
								
final
final static과 거의 함께 많이 사용된다.
"내가 마지막이다"
final + 변수    : "내가 마지막 변수" --> 상수
final + 메소드   : "내가 마지막 메소드" --> 오버라이딩 금지
final + 클래스   : "내가 마지막 클래스" --> 상속 금지 
 */
package com.edu.test;

class A {
	public static final int BASIC_SALARY = 10000; //상수.. 값변경 안됨
	public final String test() {
		return "오버라이딩 금지";
	}}

final class B {// 상속금지
}

//class C extends B{}

class D extends A {
//	BASIC_SALARY = 100;
//	public final String test() {
//		return "오버라이딩 금지" + 100;
//	}
}

public class StaticExamTest3 {

	public static void main(String[] args) {
		
	}
}
