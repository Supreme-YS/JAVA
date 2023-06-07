package com.edu.self.test;

import com.edu.self.Account;
import com.edu.self.Customer;

public class BankAppTest2 {
	
	public static void main(String[] args) {
		//Homogeneous 
		Account[] accounts = {
				new Account(111, "신한", 10000.0),
				new Account(222, "국민", 20000.0)
		};
		
		Customer c1 = new Customer("테스트", "가산동");
		
		for (Account a : accounts) {
			System.out.println(a.getBankName());
		}
		
		// 고객이 위에서 생성된 여러개의 통장들을 가지기 위한 코드..
		c1.setAccounts(accounts);
		
		// 고객이 개설한 통장을 반환받을 수도 있다.
		Account[] custAcc =  c1.getAccounts();
		
		// 내가 가진 통장중에서 국민은행 통장에 20만원을 입금하고 잔액을 확인
		// == 는 Primitive 값 비교 할때 사용한다.
		for (Account a : accounts) {
			if (a.getBankName().equals("국민")) {
				a.deposit(200000.0);
				System.out.println(a.getBalance());
			}
			else {
				continue;
			}
		} 
	}
}
