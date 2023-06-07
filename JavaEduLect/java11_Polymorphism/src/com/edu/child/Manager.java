package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class Manager extends Employee{
	
	//자식 객체의 멤버
	private String dept;
	
	public Manager(String name, MyDate birthdate, double salary, String dept, String address) {
		super(name, birthdate, salary, address); //무조건 부모가 먼저 생성이 된다.Employee() {} 기본 생성자 호출이 무조건 먼저 된다.
		// 즉, 부모가 호출될 때 값을 넣고 기본생성자! 
//		this.name = name;
//		this.birthdate = birthdate;
//		this.salary = salary;
		this.dept = dept;
	}
	
	//기능 추가
	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	//기능추가
	public int getAnnualSalary() {
		return (int)(getSalary() * 12);
	}
	
	@Override
	public String getDetails() {
//		return super.getDetails(); //Employee가 갖고있는 것을 물려받는다
		return super.getDetails() + " , " + dept;
	}
}
