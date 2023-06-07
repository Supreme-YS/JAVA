package com.edu.access.child;

import com.edu.access.parent.Parent;

public class Child extends Parent {
	
	public void test() {
		System.out.println(publicVar);
		System.out.println(protectedVar); // 서로 다른 클래스, 서로 다른 패키지이지만 상속관계이기 때문에 public으로 동작함.
//		System.out.println(var);  // is not visible == 있는데 접근을 못해..
//		System.out.println(privateVar);
	}
	
	@Override
	public void access() {
		//1. 물려받고
		super.access();
		//2. 바꾸고
		System.out.println("고쳐서 사용하자!");
	}
}
