package com.edu.oop2;

/**
 * 
 * Object Class
 * Field / Method
 *
 */
public class NoteBook {
	
	//1. field
	public String brand;
	public int price;
	public int serialNumber;
	
	
	//2. Method
	public String getNoteBookInfo() { // Working Method
		return brand + ", "+price; //String + Non String 자동 형변환
	}
	// 파일이 저장이 됐다 -> 컴파일 됐다.
	// 컴파일 시 문법과 타입 체크 
	
	//필드에 값을 주입하는 기능을 추가..(확장성, 재사용성을 위해)
	public void setNoteBook(String brand, int price, int serialNumber) {
		this.brand = brand;
		this.price = price;
		this.serialNumber = serialNumber;
		//로컬변수와 필드변수의 이름이 같을 때 구별하기 위해 필드 앞에 this라는 키워드를 붙인다.
	}
}
