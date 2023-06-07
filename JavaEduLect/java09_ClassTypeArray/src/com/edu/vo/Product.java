package com.edu.vo;

/*
 * VO = Domain이라고도 부른다
 * 상품에 대한 정보를 저장하는 클래스 
 */
public class Product {
	
	private String maker;
	private int price;
	private int quantity;
	private String company;
	
	//기본생성자
	public Product() {}

	//생성자 주입
	public Product(String maker, int price, int quantity, String company) {
		super();
		this.maker = maker;
		this.price = price;
		this.quantity = quantity;
		this.company = company;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	};
	
	public String getDetails() {
		return maker+"\t"+price+"\t"+quantity+"\t"+company;
	}
	
}
