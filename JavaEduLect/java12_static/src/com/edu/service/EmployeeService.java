package com.edu.service;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.parent.Employee;

/*
 * EmployeeService의 기능들은 
 * 클라이언트가 요청하는 각각의 서비스를 수행하는 것들이다.
 * 
 * 요청 당 서비스 클래스가 매핑되는 것이 아니라
 * 클라이언트에 요청 당 서비스 클래스의 기능(메서드)하나가 완벽하게 매핑되는 구조이다.
 * 
 * 결론은 서비스 클래스는 아무리 요청이 많이 들어와도 무조건 하나만 서버상에서 생성되어지고
 * 그 하나의 객체안의 기능들이 요청을 처리하는 완벽한 단위가 된다.
 */
public class EmployeeService {
	//1
	private static EmployeeService service = new EmployeeService();
	//2
	private EmployeeService() {
		System.out.println("Service Creating.. Using Singleton Pattern");
	}
	//3
	public static EmployeeService getInstance() {
		return service;
	}

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
