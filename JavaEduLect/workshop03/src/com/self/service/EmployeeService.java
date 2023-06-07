package com.self.service;

import com.self.vo.Employee;
import com.self.vo.Engineer;
import com.self.vo.Employee;
import com.self.vo.Employee;

public class EmployeeService {
	
	//하나의 객체를 생성
	private static EmployeeService service = new EmployeeService();
	
	// 다른 곳에서 생성금지
	private EmployeeService() {};
	
	// 다른 곳에서 인스턴스로 참조하기 위한 경로 열기
	public static EmployeeService getInstance() {
		return service;
	}
	
	public void addEmployee(Employee e) {
		
	}

	public void deleteEmployeeByName(Employee[] emps, String name) {
		for (Employee e : emps) {
			if (e.getName().equals(name)) {
				//삭제;
			}
		}
		
	}

	public void updateEmployee(Employee e, String tech, double bonus) {	
		
	}
	
	public void updateEmployee(Employee e, String dept, int deptno) {	
	}
	public void updateEmployee(double salary, Employee e, String dept, int deptno) {	
	}
	public void updateEmployee(double salary, String dept, int deptno, String name) {	
		
	}

	public Employee[] findEmployeesByName(Employee[] emps, String name) {
		Employee[] emp = new Employee[emps.length];
		return emp;
	}
	public Employee[] findEmployeesByDeptno(Employee[] emps, int deptno) {
		Employee[ ] emp = new Employee[emps.length];
		return emp;
	}
	
	public Employee findEmployeeByName(Employee[] emps, String name) {
		//초기화
		Employee emp = null;
		
		for (Employee e : emps) 
			if(e.getName().equals(name))
				emp = e;
		return emp;
	}

	//추가
	public void printEmployees(Employee[] emps) {
		for(Employee e : emps) {
			if(e!=null)
			System.out.println(e.getDetails());
		}
	}
	
}

