package com.edu.oop2.test;

import com.edu.oop2.Shirt;

public class ShirtAppTest {

	public static void main(String[] args) {
		//Stack , Heap , Method Area
		// 1. Stack 영역에 참조 변수를 위한 공간 생성 (값을 알 수 없음)
		// 2. Heap에 Class의 멤버들이 올라가자마자 묵시적 초기화 (값이 먼저 채워준 후에 주소값 라벨링 할당) , 값이 있어야 메모리에 뜸.
		// 3. Heap의 주소값 라벨링이 할당된 것이 Stack 참조 변수 안에 들어있음. Stack이 Heap 참조
		
		Shirt longT = new Shirt("Nike", true, 'L'); // 생성자 --Heap 메모리에 할당 (new 키워드)
		
		Shirt shortT = new Shirt(); // 생성자
		
		System.out.println(longT.getDetails()); //기본값 출력 --> 객체는 생성이 됐다.
		System.out.println(shortT.getDetails()); //기본값 출력 --> 객체는 생성이 됐다.
	}
	
	// 주입의 통로
	// 1. 생성자 주입
	// 2. setter 주입
	// 어떤 때 구분해서 쓸까? --> 객체가 생성될 때 반드시 필요한 것들은 생성자 주입
	// 생기고 난 후에는 setter 주입 --> 생성과 소멸을 같이 하지 않음.
	// 생성과 소멸을 같이한다 --> 생성자 주입 
	// 예. 자동차와 엔진(생성자주입) / 자동차와 네비(Setter주입)

}
