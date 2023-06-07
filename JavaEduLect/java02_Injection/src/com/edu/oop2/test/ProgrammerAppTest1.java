package com.edu.oop2.test;

import com.edu.oop2.NoteBook;
import com.edu.oop2.Programmer;

public class ProgrammerAppTest1 {

	public static void main(String[] args) {
		/**
		 * 1. 객체 생성 --> 메모리에 멤버들을 올림
		 * 2. 메서드 호출
		 * -------------------------------
		 * 문동은 이라는 개발자를 생성
		 * 정보를 입력..이름, 주요기술, 급여, 주소
		 * 동은은 노트북을 Has-ing 하도록 만들고
		 * 동은이 구입한 노트북 정보를 출력
		 * 동은의 1년 연봉을 출력
		 */
		Programmer pg = new Programmer();
		pg.setProgrammer("문동은", "Java", 1230000, "가산동"); //명시적 초기화
		
		// 문동은이 노트북을 가지는 관계
		NoteBook nb = new NoteBook();
		nb.setNoteBook("Apple", 1000000, 1);
		
		pg.buyNoteBook(nb); //이때 비로소 동은이의 노트북을 Has-ing 함.
		
		NoteBook pgs = pg.getNoteBook();
		System.out.println("====문동은이 구입한 노트북 정보====" );
		System.out.println(pgs.getNoteBookInfo());
		
		System.out.println("\n====문동은이 구입한 노트북 정보====" );
		System.out.println(pg.getAnnualSalary());
	}

}
