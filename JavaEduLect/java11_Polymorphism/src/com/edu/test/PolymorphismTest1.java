package com.edu.test;

/*
 * Polymorphism
 * ::
 * 부모타입으로 자식객체를 생성하는 것
 * ::
 * 1. m.getDetails(); -----> 자식의 메서드가 동작해서 결과가 출력이된다!?
 * Virtual Method Invocation원리가 동작했기 때문이다.
 * - compile 시점의 메서드 -- Employee의 getDetails()를 호출
 * - runtime 시점의 메서드 -- Manager,Engineer,Secretary의 getDetails()를 호출
 */
import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class PolymorphismTest1 {

	public static void main(String[] args) {
//		
//		Employee m = new Manager("정우성", new MyDate(1979, 2, 1), 33000000, "기획부", "");
//		Employee eg = new Engineer("문동은", new MyDate(1990, 3, 1), 43000000, "Java", 1000);
//		Employee s = new Secretary("James", new MyDate(1993, 1, 1), 43000000, "문동은" );
		

		
//		((Manager) m).changeDept("개발부"); //얜 왜 안될까? --> 자식에서 자신만의 멤버로 찾아야한다. --> 따라서 직접적으로 캐스팅을 해줘야 한다. (Object Casting)		
//		Manager manager = (Manager) m;
//		manager.changeDept("개발부");
		
		//1. Engineer의 연봉을 구하는 기능을 호출
//		int aSalary = ((Engineer) eg).getAnnualSalary();
//		System.out.println("Engineer의 연봉 ::  " + aSalary);
//		
//		//2. Secretary의 changeBoss() 호출 
//		((Secretary) s).changeBoss("테스트");
//		
//		System.out.println(m.getDetails());
//		System.out.println(eg.getDetails());
//		System.out.println(s.getDetails());
	}
}
