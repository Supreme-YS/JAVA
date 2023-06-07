package com.edu.test;

import java.util.regex.Pattern;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.service.EmployeeService;
import com.edu.util.MyDate;

public class StaticExamTest5 {

	public static void main(String[] args) {
		Employee[] emps = {
				new Manager("정우성", new MyDate(1979, 2, 1), 33000000.0, "여의도", "기획부"),
				new Engineer("문동은", new MyDate(1990, 3, 1), 43000000.0,"가산동",  "Java", 1000),
				new Manager("정우성2", new MyDate(1993, 1, 1), 43000000.0, "여의도","개발부" ),
				new Manager("정우성2", new MyDate(1993, 1, 1), 43000000.0, "서울역","영업부" ),
				new Secretary("James", new MyDate(1993, 1, 1), 43000000.0, "서울역","문동은" )
		};
		
		//Singleton Pattern
		EmployeeService service = EmployeeService.getInstance();
		
		Employee[] employees = service.findEmployeeByAddr(emps, "여의도");
		for (Employee e : employees) {
			if (e == null) continue;
			System.out.println(e.getDetails());
		}
	}
}
