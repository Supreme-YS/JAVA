package com.edu.vo;

//상품을 구매하는 고객에 관련된 정보를 저장하는 클래스
public class Customer {
	
	//필드 선언 후 생성자 주입
	private int ssn;
	private String name;
	private String address;
	
	//필드 선언 후 Setter 주입
	private Product[] products;

	//생성자 주입
	public Customer(int ssn, String name, String address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

	public Product[] getProducts() {
		return products;
	}
	
	//Setter 주입 -- 상품 구매를 안할수도 있으니까!
	// set -- buy로 직관적으로 이름을 바꿈
	public void buyProducts(Product[] products) {
		this.products = products;
	}

	public int getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	// set --> change 로 의미 분명화
	public void changeAddress(String address) {
		this.address = address;
	}
	
	public String customerInfo() {
		return name + " , " + address;
	}

}
