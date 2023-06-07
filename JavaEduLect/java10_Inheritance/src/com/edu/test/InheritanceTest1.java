package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class InheritanceTest1 {

	public static void main(String[] args) {
		Employee e = new Employee("이정재", new MyDate(1980, 1, 1), 23000000);
		System.out.println(e);
		System.out.println(e.toString()); //위와 동일한 값 출력
		// ★★★★★★레퍼런스 변수 뒤에는 무조건 toString이 생략되어 있다.★★★★★★ 
		
		Manager m = new Manager("정우성", new MyDate(1979, 2, 1), 33000000, "기획부");
		Engineer eg = new Engineer("문동은", new MyDate(1990, 3, 1), 43000000, "Java", 1000);
		Secretary s = new Secretary("James", new MyDate(1993, 1, 1), 43000000, "문동은" );
		
		Employee[] emps = {
				m, eg, s 
		};
		
		//배열을 만드는 전제조건은 같은 데이터 타입인데, 여기는 이기종간이다. 부모로 묶어서 단일로 관리가 가능하다
		// Heterogeneous Collection
		for (Employee emp : emps)
			System.out.println(emp.getDetails());
		// 1. 주소값 출력 안됨--> / 자식들의 정보가 출력되지 않음(Employee가 갖고있는것을 바꿔줘야함)
	}

}
