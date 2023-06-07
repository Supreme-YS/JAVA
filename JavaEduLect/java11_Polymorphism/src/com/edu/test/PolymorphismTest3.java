package com.edu.test;
// Service는 Heterogeneous Collection을 Has-ing 해야한다.
//Heterogeneous Collection - 이기종간의 집합체
import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.service.EmployeeService;
import com.edu.util.MyDate;

public class PolymorphismTest3 {

	public static void main(String[] args) {
		
		Employee[] emps = {
				new Manager("정우성", new MyDate(1979, 2, 1), 33000000.0, "여의도", "기획부"),
				new Engineer("문동은", new MyDate(1990, 3, 1), 43000000.0,"가산동",  "Java", 1000),
				new Manager("정우성2", new MyDate(1993, 1, 1), 43000000.0, "여의도","개발부" ),
				new Manager("정우성2", new MyDate(1993, 1, 1), 43000000.0, "서울역","영업부" ),
				new Secretary("James", new MyDate(1993, 1, 1), 43000000.0, "서울역","문동은" )
		};
		
		//이렇게 써도되는데.
//		EmployeeService service = new EmployeeService(emps);
		// 클라이언트가 요청하는게 프로그램이 아니라, 하나의 서비스를 요청한다.
		EmployeeService service = new EmployeeService();
		Employee[] employees = service.findEmployeeByAddr(emps, "여의도");
		for (Employee e : employees) {
			if (e == null) continue;
			System.out.println(e.getDetails());
		}
	}
}
