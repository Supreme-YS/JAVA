package com.self.test;

import com.self.service.EmployeeService;
import com.self.util.MyDate;
import com.self.vo.Engineer;
import com.self.vo.Manager;
import com.self.vo.Employee;

public class EmployeeServiceTest {
	public static void main(String[] args) {
		//1. Service 객체를 생성
//		EmployeeService service = new EmployeeService(5);
		EmployeeService service = EmployeeService.getInstance();
		
		//2. method를 각각 호출..
		System.out.println("============ 1. addEmployee ============ ");
		service.addEmployee(new Manager("AAA", new MyDate(1978, 1, 1), 20000.0, "개발부", 10));
		service.addEmployee(new Manager("BBB", new MyDate(1975, 2, 1), 34000.0, "기획부", 20));
		service.addEmployee(new Manager("CCC", new MyDate(1980, 3, 3), 20000.0, "교육부", 30));
		service.addEmployee(new Manager("DDD", new MyDate(1995, 8, 1), 37000.0, "개발부", 10));
		
		System.out.println("============ Employee 정보확인 ============ ");
		service.printEmployees(new Employee[4]);
		
		System.out.println("\n============ 1. addEngineer ============ ");
		service.addEmployee(new Engineer("EEE", new MyDate(1995,3,4), 350000.0, "Java", 200.0));
		service.addEmployee(new Engineer("FFF", new MyDate(1995,7,2), 350000.0, "Java", 200.0));
		service.addEmployee(new Engineer("GGG", new MyDate(1994,11,2), 450000.0, "Python", 300.0));
		
		System.out.println("============ Engineer 정보확인 ============ ");
		service.printEmployees(new Employee[4]);
		
		System.out.println("\n============ 2. deleteEmployee(AAA 삭제) ============ ");
		service.deleteEmployeeByName(new Employee[4], "AAA");
		System.out.println("============ Employee 정보확인 ============ ");
		service.printEmployees(new Employee[4]);
		
		System.out.println("\n============ 3. updateEmployee(CCC 연봉 수정 200->350) ============ ");
		service.updateEmployee(35000.0, "교육부", 30,  "CCC");//?
		System.out.println("============ Employee 정보확인 ============ ");
		service.printEmployees(new Employee[4]);

	}
}







