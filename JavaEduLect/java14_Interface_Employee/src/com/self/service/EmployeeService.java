package com.self.service;

import com.self.vo.Employee;

/*
 * service 기능들의 Template
 * 무조건 모든 기능의 앞에는 자동으로 public abstract가 지정된다.
 */
public interface EmployeeService {
	
	 void addEmployee(Employee e);
	 void deleteEmployee(String name);
	 void updateEmployee(String name, double salary, String dept, int deptno, String tech, double bonus);
	 Employee findEmployee(String name);
	 Employee[] findEmployee(int deptno);
	 void printEmployees();
}
