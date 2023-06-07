package com.edu.reference.test;

/**
 * 
 * 배열을 사용해서 여러명의 고객을 하나의 배열 객체에 저장해 보도록 한다.
 * 데이터 타입이 기본형이 아닌, Reference DataType의 배열을 선언, 생성, 초기화
 *
 */

// Customer의 정보를 저장하는 클래스. VO 클래스 
// 필드 선언 --> 주입되는 통로 --> 주입된 값을 받는 기능 --> :: Encapsulation기법으로 작성
class Customer {
	private int ssn;
	private String custName; // 컬럼명 주의! DB 작업 時 
	private String address;
	
	//생성자 주입
	public Customer(int ssn, String custName, String address) {
		super();
		this.ssn = ssn;
		this.custName = custName;
		this.address = address;
	}
	
	//기본 생성자 - 쓰는 습관을 들이자
	public Customer() {}

	//Getter 생성
	public int getSsn() {
		return ssn;
	}

	public String getCustName() {
		return custName;
	}

	public String getAddress() {
		return address;
	}	
	
	public String getDetails( ) {
		return ssn + " , " + custName + " , " + address;
	}
}

// public 키워드는 실행(main) 메서드가 있는 부분에만 써야한다.
public class CustomArrayTest1 {

	public static void main(String[] args) {
		//1. 배열 선언과 생성을 동시에
		Customer[] customers = new Customer[3];
		
		for(Customer c : customers) 
			System.out.println(c); //null, null, null <- Class 타입의 기본 값은 Null
		
		System.out.println(customers); // 스택에 올라간 주소값 출력
		
		//2. 초기화
		customers[0] = new Customer(111, "James", "NY");
		customers[1] = new Customer(222, "Juliet", "LA");
		customers[2] = new Customer(333, "Jane", "Brandon");
		
		for(Customer c : customers) 
			System.out.println(c); //null 값을 주소값이 덮어씌운다. 재참조! 힙메모리에서의 Memory Allocation
		
		
	}
}
