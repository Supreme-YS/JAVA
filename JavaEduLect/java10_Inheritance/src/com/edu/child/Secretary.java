package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class Secretary extends Employee{
	
	//자식 객체의 멤버
	private String bossOfName;
	
	public Secretary(String name, MyDate birthdate, double salary, String bossOfName) {
		super(name, birthdate, salary);
		this.bossOfName = bossOfName;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + " , " + bossOfName;
	}
}
