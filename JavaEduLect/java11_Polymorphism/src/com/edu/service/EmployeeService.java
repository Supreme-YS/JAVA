package com.edu.service;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;

/*
 * 다양한 이기종간의 집합체를 관리하는 기능을 모아놓은 클래스
 * 이후 단계 에서는 DAO 클래스로 발전할 것이다.
 * 
 * 이기종간의 집합체를 관리하는 기능의 핵심은 결과적으로 디비와 연결되는 CRUD가 된다.
 * 
 * 1. step 가장 저 차원적인 구조
 * public void addManage(Manager m) {
 * public void insertEngin(Engineer m) {
 * public void addingSercretary(Sercretary m) {
 * 
 * public void delete ~~~
 * 
 * 2. step -- 1단계 보다는 나은 구조..일관적, 가독력이 다소 높아짐
 * public void add Manage
 * public void addEngineer
 * public void addSecretary 
 * 
 * 3. step 상속의 이점을 사용. 부모로 관리.. 메소드 오버로딩
 * public void add Employee(Manager m) 
 * public void add Employee(Engineer m) 
 * public void add Employee(Secretary m) 
 * 
 * 4. step
 * public void add Employee(Employee m) {
 *   if (e instanceof Manager) {
 *   if (e instanceof Engineer) {
 *   
 */

/**
 * 
 * 1. EmployeeService는 Employee, Employee[]을 hasing 
 * 2. 부모타입의 인자값을 hasing 함으로써 다양한 자식 클래스들을 단일하게 관리할 수 있다.
 * 	  Polymorphic Argument 라고 한다.
 *
 */
public class EmployeeService {

	//1. 특정한 Employee의 1년 연봉을 리턴하는 기능을 정의(선언 + 구현)
	public int getAnnualSalary(Employee e) {
		//초기화
		int annualSalary = 0;
		
		annualSalary = (int)(e.getSalary() * 12);
		
		if (e instanceof Engineer) {
			Engineer eg = (Engineer)e;
			annualSalary = (int)(eg.getSalary()*12) + eg.getBonus();
		}
		
		return annualSalary;
	}
	
	//2. 모든 사원의 연간 총 인건비를 리턴
	public int  getTotalCost(Employee[] ea) {
		int totalCost = 0;
		
		for (Employee e : ea) {
			totalCost += getAnnualSalary(e);
		}
		return totalCost;
	}
	
	//3. 특정한 사원을 검색.. Unique한 값으로 일단 Name
	public Employee findEmployeeByName(Employee[] ea, String name) {
		//선언
		Employee emp = null;
		
		for (Employee e : ea) {
			if (e.getName().equals(name)) {
				emp = e;
			}
		}
		
		//리턴 후 소스코드 작성
		return emp;
	}
	//4. 동일한 주소에 거주하는 사원들을 검색
		public Employee[] findEmployeeByAddr(Employee[] ea, String address) {
			//선언
//			Employee[] emp = null; // null pointer exception 터질 수 있으므로..
			Employee[] emp = new Employee[ea.length];
			
			int idx = 0;
			
			for (Employee e : ea) {
				if (e.getName().equals(address)) 
					emp[idx++] = e;
				
			}
			
			//리턴 후 소스코드 작성
			return emp;
		}
	
}
