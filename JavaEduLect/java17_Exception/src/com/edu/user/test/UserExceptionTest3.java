package com.edu.user.test;

/*
 * 사용자 정의 Exception
 * ::
 * 강력한 제어문의 일종이다.
 * ::
 * 1. 내가 예외 클래스를 정의해서 사용
 * 2. 내가 고의로 특정한 조건에서 일부로 예외를 발생시키는 것
 * ---
 * try~catch와 throws의 쓰임새 차이
 * 메소드 안에서 예외를 처리하려면 반드시 던지는 Throws방식으로 처리한다.
 */

class ZeroDivided extends Exception{
	ZeroDivided() {
		this("This is a ZeroDivided");
	}

	public ZeroDivided(String message) {
		super(message);
	}
	
}

class UserExam {
	public void go() throws ArithmeticException {  // go 메서드를 호출한 곳으로 간다.
		System.out.println("2. Go..실행");
		int i = 10;
		int j = 0;
		
		if(j==0) {
//			//여기서 고의적으로 폭탄을 터뜨림
//			//원래 JVM이 객체 생성해서 던지는 건데 '내가' 터트린다면 throw new 붙여서 예외를 터뜨린다.
			System.out.println("폭탄터진다");
			throw new ArithmeticException();
//			try {
//				throw new ArithmeticException();
//			} catch(ArithmeticException e){
//				System.out.println("버그를 잘 잡았습니다.");
//			}
//			
		}
	}
}


public class UserExceptionTest3 {

	public static void main(String[] args) throws ZeroDivided {
		System.out.println("1. UserExam 객체 생성..go() 호출");
		UserExam user = new UserExam();
		user.go();
		
		System.out.println("3. 프로그램을 종료합니다");
	}

}
