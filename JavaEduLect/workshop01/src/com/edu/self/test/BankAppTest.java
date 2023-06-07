package com.edu.self.test;

import java.util.Scanner;

import com.edu.self.Account;
import com.edu.self.Customer;

public class BankAppTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//생성자 주입으로 생성
		Customer c1 = new Customer("문동은", "가산동");
		Customer c2 = new Customer("박연진", "여의도");
		
		//각각의 고객이 통장을 개설 ( 고객이 통장을 has-ing )
		// 20, 21 번째 줄처럼 개설하는것 보다 22번 째 줄 처럼 하는게 좋다.
//		Account acc = new Account(123, "국민은행", 30000.0);
////		c1.setAccount(acc);
//		c1.setAccount(new Account(123, "국민은행", 30000.0)); // 코드라인 수 절약, acc 라는 참조변수를 계속적으로 사용할게 아니라면! 객체 생성과 동시에 주입
//		c2.setAccount(new Account(321, "신한은행", 10000.0));
//		
//		//3. 각자가 개설한 통장을 기반으로 출금 혹은 입금 한다
////		Account dongAcc = c1.getAccount(); // Customer가 갖고있는 Account 객체를 갖고와서 참조변수에 할당
//		dongAcc.deposit(23000.0);
//		dongAcc.withdraw(3000.0);
//		System.out.println("=====================Balance==================");
//		System.out.println("잔액확인 : " + dongAcc.getBalance() + "원");
//				
		
	}

}
