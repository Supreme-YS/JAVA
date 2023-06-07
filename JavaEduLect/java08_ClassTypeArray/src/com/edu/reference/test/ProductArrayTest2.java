package com.edu.reference.test;



class Product {
	
	//필드 선언
	private int productNo;
	private String brand;
	private int price;
	
	//주입의 통로
	public Product(int productNo, String brand, int price) {
		super();
		this.productNo = productNo;
		this.brand = brand;
		this.price = price;
	}
	
	// 기본 생성자
	public Product() {}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String productInfo() {
		return productNo + " , " + brand + " , " + price;
	}
	
}

public class ProductArrayTest2 {

	public static void main(String[] args) {
		// 1. Product 타입의 배열을 선언, 생성, 초기화
		Product[] products = {
				new Product(11, "초코파이", 2000),
				new Product(12, "샴푸", 24000),
				new Product(13, "테라", 3400),
				new Product(556, "삼성TV", 5000000)
				};
		
		// 2. Products 배열안에 들어있는 모든 상품의 브랜드를 출력
		System.out.println("\n==========상품의 브랜드==========");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getBrand());
		}
	
		// 3. Products 배열안에 들어있는 모든 상품중에서 100만원 이상의 고가 제품의 상품 정보를 출력
		System.out.println("\n==========100만원 이상의 고가 제품의 상품정보==========");
		for (int i = 0; i < products.length; i++) {
			if (products[i].getPrice() > 1000000) {
				System.out.println(products[i].productInfo());
			} else {
				continue;
			}
		}
		
		// 4. Products 배열안에 들어있는 모든 상품의 총 가격을 출력
		System.out.println("\n==========상품의 총가격==========");
		int total = 0;
		
		for (Product p : products) {
			total = total + p.getPrice();
		}
		System.out.println(total);
	}

}
