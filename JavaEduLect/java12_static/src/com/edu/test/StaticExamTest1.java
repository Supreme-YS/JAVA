package com.edu.test;

/*1. 컴파일 Test.java --> Test.class
 * 
 * static 성질
 * 1. static 으로 지정된 멤버는 객체생성 과정 없이 메모리에 올락나다.
 * 2. class 파일이 로더되는 과정에서 미리 메모리에 먼저 올라가 있다.
 * 3. static한 변수를 멤버 레벨로만 사용된다.
 * 4. static한 변수는 생성된 객체들이 모두 공유한다. 
 * 5. static은 거의 final 키워드와 함께 사용된다.
 * 6 .Singleton Pattern
 * 
 * -- field / static V / local V
 *  
 */

class StaticExam {
	int count = 1; //field, 멤버변수
	static String name = "홍길동"; // Static V, Class V
	static int age = 19;
	
	
	public void getMember() {
		// static은 메모리에 올랐는데, 메서드가 안올라감.
		// 그래서 static은 지역에 못씀
//		static String address = "민속촌";
		// static으로 이미 메모리에 올라가있음
		System.out.println("우/유/빛/깔" + name);
	}
	
	public static void getMember2() {
//		count++; // static에서 일반 필드 안됨
	}
}
public class StaticExamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExam s = new StaticExam();
		
		StaticExam.getMember2(); // 객체 생성 을 안해도 사용할 수 있다.
		// 만약에 객체생성을 안하면 즉, 원래대로 라면
		s.getMember(); //이렇게 호출하는게 맞어!
		//static이 붙은 애들은 Class Area라는 메모리 영역에 올라감.. 그래서 무작정 static을 붙일 수 없다.. Static 이 붙은 애들은 GC의 영역이 아니다. 즉 HEAP 메모리 영역이 아님
	}

}
