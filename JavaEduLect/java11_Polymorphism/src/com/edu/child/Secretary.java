package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class Secretary extends Employee{
	
	//자식 객체의 멤버
	private String bossOfName;
	
	public Secretary(String name, MyDate birthdate, double salary,String address, String bossOfName) {
		super(name, birthdate, salary, address);
		this.bossOfName = bossOfName;
	}
	
	public void changeBoss(String bossOfName) {
		this.bossOfName = bossOfName;
	}
	

	//기능추가
	public int getAnnualSalary() {
		return (int)(getSalary() * 12);
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " , " + bossOfName;
	}
}
