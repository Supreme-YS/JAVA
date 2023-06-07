package com.edu.test;
// Service는 Heterogeneous Collection을 Has-ing 해야한다.
//Heterogeneous Collection - 이기종간의 집합체
import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class PolymorphismTest2 {

	public static void main(String[] args) {
		
		Employee[] emps = {
//				new Manager("정우성", new MyDate(1979, 2, 1), 33000000.0, "기획부"),
//				new Engineer("문동은", new MyDate(1990, 3, 1), 43000000.0, "Java", 1000),
//				new Manager("정우성2", new MyDate(1993, 1, 1), 43000000.0, "개발부" ),
//				new Manager("정우성2", new MyDate(1993, 1, 1), 43000000.0, "영업부" ),
//				new Secretary("James", new MyDate(1993, 1, 1), 43000000.0, "문동은" )
		};
		
		//정보출력
		//Manager는 홍보부, Engineer는 연봉을 출력, Secretary는 상사 James Gosling
		for (Employee e : emps) {
			//만약에 e가 Manager 객체라면
			if(e instanceof Manager) {
				((Manager) e).changeDept("홍보부");
				System.out.println("Information Manager : " + e.getDetails());
				
			}			
			//만약에 e가 Engineer 객체라면
			if(e instanceof Engineer) {
				System.out.println("Information Engineer : " + e.getDetails());
//				int annual = ((Engineer) e).getAnnualSalary();
//				System.out.println("Annual Salary : " + annual + "만원");	
			}
			//만약에 e가 Secretary 객체라면
			if(e instanceof Secretary) {
				((Secretary) e).changeBoss("James Gosling");
				System.out.println("Information Secretary : " + e.getDetails());
			}
		}
		
//		//1. 정보출력
//		for (Employee e : emps) {
//			System.out.println(e.getDetails());//오버라이딩 된 Virtual Method Invocation
//		}
	}
}
