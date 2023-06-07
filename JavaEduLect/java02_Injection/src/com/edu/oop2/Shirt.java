package com.edu.oop2;

/**
 * 
 * 생성자
 * "객체가 생성될 때마다 구동하는 것"
 * 
 * 하나의 클래스에느 무조건 하나 이상의 생성자가 존재한다.
 * 기본 생성자는 개발자가 작성을 안해놓으면 컴파일러가 알아서 넣고 돌린다.
 * 
 * 명시적 생성자가 하나라도 있는 경우에는 컴파일러가 기본 생성자를 안넣어준다.
 * 즉, 아무것도 없을때만 넣어준다.
 * 
 * 명시적 생성자가 하는 일은 바로 "필드초기화"
 */

public class Shirt {
	
	public String brand;
	public boolean longSleeved;
	public char size;
	
	// 기본 생성자
	// 접근제어자는 클래스와 같고, 인자없고, 함수도 없다.
	// 즉, 필드 초기화 안한다.
	public Shirt () {};
	
	// 명시적 생성자
	// 접근제어자는 클래스와 같다.
	// 필드 초기화
	public Shirt(String brand, boolean longSleeved, char size) {
		super();
		this.brand = brand;
		this.longSleeved = longSleeved;
		this.size = size;
	}

	public String getDetails() {
		return brand +"," + longSleeved + "," + size;
	}

	
}
