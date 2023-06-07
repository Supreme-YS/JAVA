package com.edu.access.parent;

public class Parent {
	
	public String publicVar = "Public Var";
	protected String protectedVar = "Protected Var";
	String var = "var";
	private String privateVar = "Private Var";
	
	// 기본 생성자는 클래스 접근지정자를 따라간다
	public Parent() {};
	
	public void access() {
		System.out.println("Acceess Modifer Test...");
	}
}
