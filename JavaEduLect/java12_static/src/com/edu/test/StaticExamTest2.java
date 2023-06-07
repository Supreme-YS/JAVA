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
 * 객체 마다마다 값이 같으면 static
 * 
 * class Card{
 * int number;
 * String shape;
 * boolean front;
 * 
 * -- static int width; / static int height; / static int cardCount; 
 * -- Usage Modifier : static final int WIDTH; / static final int HEIGHT; / final static int cardCount;
 * 
 * ---Singleton Pattern
 * 하나의 클래스 타입으로 오직 단 하나의 인스턴스만 생성되도록 코드를 강제하는 패턴
 */

class Car {
	int serialNumber;    //field
	static int counter;  //static V
	
	// 생성자 access modifier는 클래스를 따라간다. 그래서 아무것도 안붙인다.
	Car() {
		counter++;
		serialNumber = counter;
	}
}


public class StaticExamTest2 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		System.out.println("===========field=============");
		System.out.println(c1.serialNumber); // 1
		System.out.println(c2.serialNumber); // 2
		System.out.println(c3.serialNumber); // 3
		
		System.out.println("===========static v=============");
		System.out.println(Car.counter); // 3
		System.out.println(c1.counter); // 3
		System.out.println(c2.counter); // 3
		System.out.println(c3.counter); // 3

	}

}
