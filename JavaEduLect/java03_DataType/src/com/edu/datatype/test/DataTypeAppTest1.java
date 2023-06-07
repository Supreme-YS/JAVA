package com.edu.datatype.test;

/*
 * Local V
 * 1) 선언된 위치가 메소드 안 == 로컬 변수
 * 2) 해당 메서드 안에서만 사용 할 수 있다.
 * 3) 로컬 변수는 기본값이 없다. 묵시적 초기화 불가능 반드시 명시적 초기화를 해줘야 함
 * 4) Temporary V, Automatically V
 * 
 * Field
 * 1) 선언된 위치가 메소드 밖
 * 2) 클래스 어디서나 사용가능..하지만 메모리에 올려서 써야한다.
 * 3) 기본값을 갖고 있어서 초기화 안하고 바로 사용해도 에러 안난다.
 */
public class DataTypeAppTest1 {
	
	int i;
	
	public static void main(String[] args) {
		
		DataTypeAppTest1 test = new DataTypeAppTest1();
		
		byte b; //변수 선언
		b = 127;

		System.out.println(b);
		System.out.println(test.i);
		
		
		/**
		 * l1과 l2가 메모리에서 소모되는 메모리는 동일
		 * 데이터 타입이 중요한 요소가 된다. 
		 * 변수 안에 저장된 값이 중요한 것이 아니다. 
		 */
		long l1 = 1;
		long l2 = 600000000;
		
		short a = 1;
		short s = 2;
		short c =(short)(a+s); // 실제값이 아닐 땐 타입비교를 한다. int 이하의 데이터 타입에서 사칙연산으로 int로 자동 승격된다. 
		System.out.println(c);
		
	}

}
