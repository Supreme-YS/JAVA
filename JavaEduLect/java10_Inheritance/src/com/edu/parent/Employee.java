package com.edu.parent;

import com.edu.util.MyDate;

public class Employee {

	private String name;
	private MyDate birthdate;
	private double salary;
	
	//기본값 지정..하나 정해놓을 값 ..상수값
	//public 인 이유 
	//static 인 이유
	//final 인 이유
	//무조건 대문자 변수명
	public static final double BASIC_SALARY = 300;
	public static final String BASIC_NAME = "홍길동";
	
	// 자식이 생성되기 위해서 필수임..
	public Employee() {};
	
	public Employee(String name, MyDate birthdate, double salary) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.salary = salary;
	}
	
	/*
	 * this 키워드 
	 * - 객체 자신의 주소값을 가지고 있는 키워드
	 * - 해당 클래스 자기 자신을 가리킨다.
	 * 1) 변수앞에서 사용 : local V, field 이름이 동일할 때 field 앞에 붙여서 구분한다.
	 * 2) 생성자앞에서 사용 : 하나의 클래스에서 또 다른 생성자를 호출하는 기능.
	 */
	//생성자 오버로딩 - 1
	public Employee(String name, MyDate birthdate) {
		this(name, birthdate, BASIC_SALARY);
	}
	//생성자 오버로딩 - 2
	public Employee(MyDate birthdate, double salary) {
		this(BASIC_NAME, birthdate, salary);
	}
	
	public String getDetails() {
		return name + " , " + birthdate + " , " + salary;
		//birthdate 뒤에 .toString()이 생략되어 있다.
	}
	
}
