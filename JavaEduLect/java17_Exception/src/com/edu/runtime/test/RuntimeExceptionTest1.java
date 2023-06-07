package com.edu.runtime.test;

/*
 * RuntimeException은 컴파일은 성공, 컴파일러가 인식 못함
 * 실행할때 예외가 발생
 * 
 * RuntimeException은 코드를 수정하면 해결됨.
 * 
 * 직접적으로 처리하도록 한다.
 * 
 * try {
 * 	//예외 발생 가능성 있는 코드
 * }
 * catch(e) {
 *  //예외 잡혔을 때 수행하는 코드
 * }
 */

public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		String[] str = {
				"hello",
				"No, I mean it",	
				"Nice to meet you"
		};
		
		int i = 0;
		while(i <= 3) {
			try {
				System.out.println(str[i]);
			} catch(ArrayIndexOutOfBoundsException e) { // ArrayIndex~~타입의 객체로 에러를 잡는다.
				System.out.println("NICE CATCH");
			}
			//터지는 지점
//			System.out.println(str[i]); //JVM이 객체를 만들어서 예외를 던진다.
			i++;
		}
		// 자바에서 버그(예외)는 객체로 만들어진다.
		System.out.println("while loop....end");
	}

}
