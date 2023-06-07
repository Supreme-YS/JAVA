package com.edu.test;

/*
 * 인터페이스
 * ::
 * 구성요소
 * (public abstract) 추상메서드;
 * (public static final) 상수;
 * ::
 * 특이점
 * 구현부가 있는 기능이 올 수 없다.
 * 필드가 없다.
 * 객체 생성의 대상이 될 수 없다.(abstract...)
 * 객체 생성시 타입으로서 존재
 */

interface Flyer {
	
	int MAX_SPEED = 200; // public static final 이 생략되어 있기 때문에 글자가 기울어지는거
	
	public abstract void fly();
	void land(); //public abstract
	void take_off();
}

//인터페이스는 abstract다 전부 --> 그걸 구현한 클래스도 abstract라서 객체 생성 불가하다
abstract class Bird implements Flyer {
	
	// 선언부는 같고 구현부는 다르기 때문에 오버라이딩이다
	@Override
	public void fly() {
		System.out.println("Bird..fly");
		
	}

	@Override
	public void land() {
		System.out.println("Bird..land");		
	}

	@Override
	public void take_off() {
		System.out.println("Bird..take off");
		
	}
	
	public String layEggs() {
		return "새가 알을 낳다";
	}
	
}

class Superman implements Flyer {
	@Override
	public void fly() {
		System.out.println("Superman..fly");		
	}
	
	@Override
	public void land() {
		System.out.println("Superman..land");		
	}
	@Override
	public void take_off() {
		System.out.println("Superman..take off");		
	}
	
	public String stop_Bullet() {
		return "망토로 총알을 막다";
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		
//		Flyer f = new Flyer(); // 객체 생성못해 왜? --> 추상 메서드가 하나라도 있으면 미완의 설계도이기 때문에 객체 생성(제품생성) 못함
		
//		Flyer bird = new Bird(); // Polymorphism(부모타입으로 자식 생성)
//		Flyer man = new Superman();
//		
//		bird.fly();
//		bird.land();
//		bird.take_off();
//		System.out.println(((Bird) bird).layEggs());
//		
//		man.fly();
//		man.land();
//		man.take_off();
//		System.out.println(((Superman) man).stop_Bullet());
	}

}
