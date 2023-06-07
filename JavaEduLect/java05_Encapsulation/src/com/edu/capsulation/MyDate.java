package com.edu.capsulation;

/**
 * Encapsulation
 * ::
 * 클래스의 필드(Field)가 중요하다는 사실을 그림을 통해 살펴보았음.
 * Client Side (Form)  ------ Server Side (VO) ------ DB (Record)
 * ::
 * 데이터를 보호하기 위해서 소스코드 작성 패턴을 지킨다.
 * 1. field 앞 --> Private(-)로 지정한다.
 * 2. field에 값을 넣고 받고 --> Public(+)로 지정한다.
 * 		해당 클래스의 멤버
 * 		void setXxxx(o,o,o)
 * 		Xxx getXxx()
 * 3. setXxx() 함수 안에서 필드 초기화 하기 직전에
 * 	  제어문을 사용해서 타당한 값만 필드에 할당되도록 로직을 제어한다.
 * 	  ::
 * 	  
 *    << 코드 작성 >>
 *    month에 해당하는 값이 1~12일 때만 필드에 할당
 *    그 외의 값은 "해당하는 월이 아닙니다.." 메세지 출력
 *    day에 해당하는 값은 1,3,5,7,8,10,12월은 1~31
 *    2월은 1~28, 4,6,9,11 1~30 값만 필드에 할당되도록 로직을 작성
 */
public class MyDate {

//  직접적으로 필드에 값 접근이 되는 경우--> 이러면 안됨	
//	public int month;
//	public int day;
	
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	// setter로 주입
	public void setMonth(int month) {
		//★필드 초기화★하기 직전에 Valid 한 값만 입력되도록 제어문을 만든다.
		if (month <= 12 && month >= 1) {
			this.month = month;
		}
		else System.out.println("해당하는 월이 아닙니다.");
		System.exit(0);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		//★필드 초기화★하기 직전에 Valid 한 값만 입력되도록 제어문을 만든다.
		// switch 구문에 getMonth() X --> 호출은 Main 내 에서만
		switch (month) {
			case 2:
				if(day>=1 && day <= 28) {
					this.day = day;
				} else { System.out.println("해당하는 일이 아닙니다."); }
				System.exit(0);
				break;
			case 4:
				if(day>=1 && day <= 30) {
					this.day = day;
				} else { System.out.println("해당하는 일이 아닙니다."); }
				System.exit(0);
				break;
			case 6:
				if(day>=1 && day <= 30) {
					this.day = day;
				} else { System.out.println("해당하는 일이 아닙니다."); }
				System.exit(0);
				break;
			case 9:
				if(day>=1 && day <= 30) {
					this.day = day;
				} else { System.out.println("해당하는 일이 아닙니다."); }
				System.exit(0);
				break;
			case 11:
				if(day>=1 && day <= 30) {
					this.day = day;
				} else { System.out.println("해당하는 일이 아닙니다."); }
				System.exit(0);
				break;
			default :
				if(day>=1 && day <= 21) {
					this.day = day;
				} else { System.out.println("해당하는 일이 아닙니다."); }
				System.exit(0);
				break;
		}
	}
	
}
