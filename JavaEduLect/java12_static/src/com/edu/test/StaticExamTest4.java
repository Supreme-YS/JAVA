/*
 * Singleton Pattern
 * 하나의 클래스로부터 단 한 개의 인스턴스만 생성하는 패턴
 * 
 * 코드 순서
 * 1. 일단 클래스 안에서 하나의 객체는 생성
 *   private static으로 지정해서 객체를 생성
 *   
 * 2. 다른 곳에서(다른 클래스에서)는 해당 클래스 타입으로 객체 생성 못하도록 막아둔다.
 *   private 생성자() {} ;
 *  
 * 3. 하나 생성해둔 객체는 여기 저기서 불러다 쓸 수 있도록 만든다.
 *   단, 객체 생성 과정 없이 가져다 쓸 수 있어야 한다. --> Static을 붙여줘야한다.
 *   public 클래스 getInstance() {}
 *   public static 클래스 getInstance() {}
 */
package com.edu.test;

import java.util.regex.Pattern;

class Service {
	//1. 하나의 객체를 생성
	private static Service service = new Service();
	
	//2. 다른 곳에서 해당 클래스 타입으로 객체 생성 못하게 막는다.
	private Service() {
		System.out.println("Singleton Pattern...Ready!");
	};
	
	//3. 여기 저기서 불러다 쓸 수 있도록 만든다.
	public static Service getInstance() {
		return service;
	}
	
	
}

public class StaticExamTest4 {

	public static void main(String[] args) {
		
//		Service s1 = new Service(); getInstance 쓰고 싶은데, 객체 생성을 막아놓음 --> Static을 쓰면되지
		Service s1 = Service.getInstance();
		Service s2 = Service.getInstance();
		Service s3 = Service.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
