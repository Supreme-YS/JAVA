package com.self.vo;

import com.self.util.MyDate;

public class Employee {
	
	private String name;
	private MyDate birthDate;
	private double salary;
	
	//기본생성자
	public Employee() {}

	public Employee(String name, MyDate birthDate, double salary) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	};
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return name + " , " + birthDate + " , " + salary;
	}
}
