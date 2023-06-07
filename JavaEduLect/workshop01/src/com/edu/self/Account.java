package com.edu.self;

public class Account {
	//1. 필드 선언
	//public --> private
	private int accNumber;
	private String bankName;
	private double balance;
	
	//2. 주입의 통로 (생성자 주입)
	// 기본생성자도 생성한다.
	public Account() {}
	public Account(int accNumber, String bankName, double balance) {
		super();
		this.accNumber = accNumber;
		this.bankName = bankName;
		this.balance = balance;
	}
	
	// 계좌번호 조회
	public int getAccNumber() {
		return this.accNumber;
	}

	// 잔액조회
	public double getBalance() {
		return this.balance;
	}
	
	// 은행명
	public String getBankName() {
		return "은행명 : " + bankName;
	}
	
	// 인출
	public void withdraw(double withdraw) {
		if (balance >= withdraw) {
			balance -= withdraw;
		}
		else {
			System.out.println("출금액이 잔액보다 더 많다.");
			return; //withdraw를 호출한 곳으로 리턴
		}
	}
	// 입금
	public void deposit(double deposit) {
		if (deposit < 1000.0) {
			System.out.println("1000원 이상부터 입금이 가능합니다.");
			return; //deposit을 호출한 곳으로 리턴
		}
		else {
			balance += deposit;
		}
	}
	
	// 계좌정보
	public String getAccountInfo() {
		return "계좌변호 : " + accNumber + "// 은행명 : " + bankName + "// 현재 잔액 : " + balance;
	}
	

}
