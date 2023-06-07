	package com.edu.oop2;

/**
 * 
 * NoteBook을 가지고 있는 개발자 클래스
 * 
 * 이름, 주요기술, 급여, 주소
 * 			+
 * 		  노트북
 *::
 * Programmer <---has a relation---NoteBook
 * 1. 필드 레벨에 NoteBook을 선언한다.
 * 2. setXxxx(NoteBook noteBook) 기능을 통해서 주입
 */
public class Programmer {
	
	public String name;
	public String mainSkill;
	public int salary;
	public String address;
	
	// Has a Relation
	public NoteBook noteBook;//identifier
	
	// 값 주입...기능...2개
	public void setProgrammer(String name, String mainSkill, int salary, String address) {//지역변수
		//필드변수 앞에 this
		this.name = name;
		this.mainSkill = mainSkill;
		this.salary = salary;
		this.address = address;
	}
	
	public void buyNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}
	
	public NoteBook getNoteBook() {
		return noteBook;
	}
	
	// 추가적으로 필요한 기능을 정의
	public String getProgrammerInfo() {
		return name+","+mainSkill+","+salary+","+address;
	}
	
	// 기능을 추가...연봉을 리턴
	public int getAnnualSalary() {
		return salary * 12 + 1000000;
	}
}
