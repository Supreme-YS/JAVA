package com.edu.oop.test;

import com.edu.oop.NoteBook; //NoteBook.class 파일을 찾음.

/**
 * 
 * ~Test 클래스의 역할 및 기능
 * 1. NoteBook 클래스의 멤버를 메모리(JVM, Platform)에 올린다. == 객체 생성
 * 2. 접근
 * 	  Field Initialization 
 * 	  Method Calling 
 *
 */
public class NoteBookAppTest1 {

	public static void main(String[] args) {
		
		//1. 객체 생성(값을 넣어줘야 객체인데, 알아서 랜덤한 값을 넣어서 올려준다)
		NoteBook nb = new NoteBook(); //여기서 nb는 참조변수/객체변수 라고 함.
		NoteBook nb2 = new NoteBook();
		
		nb.setNoteBook("HP", 100, 123);
		System.out.println(nb.getNoteBookInfo());
		
		nb2.setNoteBook("LG", 200, 123);
		System.out.println(nb2.getNoteBookInfo());
		//2. 접근
//		nb.brand = "HP";
//		nb.price = 1300000;
//		nb.serialNumber = 112233;
		
		nb.getNoteBookInfo(); //Calling Method
		// No Calling , No Working
	}
}
