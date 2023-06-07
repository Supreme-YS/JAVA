package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class Engineer extends Employee{
	
	//자식 객체의 멤버
	private String tech;
	private int bonus;
	
	public Engineer(String name, MyDate birthdate, double salary,String address, String tech, int bonus) {
		super(name, birthdate, salary, address);
		this.tech = tech;
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return this.bonus;
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails() + " , " + tech;
	}
}
