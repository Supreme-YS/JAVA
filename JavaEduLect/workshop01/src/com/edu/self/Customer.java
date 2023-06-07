package com.edu.self;

/**
 * 
 * 1) 필드선언
 * 2) 주입의 통로를 결정
 *-- step 2
 * 여러개의 통장을 한 명의 고객이 개설하는 상황
 * 1) 필드에 Account[]을 선언
 * 2) 주입되는 값을 Account가 아니라 Account[]을 주입해야 한다.
 */
public class Customer {
	
	private String custName;
	private String address;
	
	// has-ing 관계
//	private Account account;
	
	private Account[] accounts;
	
	// 2. 주입의 통로를 결정
	public Customer(String custName, String address) {
		super();
		this.custName = custName;
		this.address = address;
	}
	
//	public Account getAccount() {
//		return account;
//	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}

	// step 2.
	//통장 여러개 생성을 위한 인자값을 배열로 한다.
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;	
	}
	

	
	public String getCustomerInfo() {
		return custName + " , " + address;
	}
}