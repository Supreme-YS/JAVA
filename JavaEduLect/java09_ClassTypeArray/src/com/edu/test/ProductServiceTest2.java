package com.edu.test;

import java.security.Provider.Service;

import com.edu.service.ProductService;
import com.edu.vo.Product;

public class ProductServiceTest2 {

	public static void main(String[] args) {
		Product[] pros = {
				new Product("라면", 2000, 5, "농심"),
				new Product("음료수", 1500, 2, "롯데"),
				new Product("과자", 4000, 1, "롯데"),
				new Product("가전", 4000000, 1, "삼성")
		};
		
		//Service Class 객체를 생성 == Service Class의 기능들을 메모리에 올림
		ProductService productService = new ProductService();
		
		String[] makers = productService.getAllMaker(pros);
		System.out.println("======1. 모든 상품들의 메이커를 출력 ======");
		for (String s : makers) {
			System.out.println(s);
		}
		
		System.out.println("======2. 모든 상품들의 가격의 총합을 출력 ======");
		int totalPrice = productService.getTotalPrice(pros);
		System.out.println(totalPrice + "원");
		
		
		System.out.println("======3. 특정 가격 이상의 제품을 출력 ======");
		Product[] productByPrice = productService.searchProductByPrice(pros, 3000);
		for (Product p : productByPrice) {
			if (p == null) break;
			System.out.println(p.getMaker() + p.getPrice());
		}
		
		System.out.println("======4. 브랜드명 호출 ======");
		Product[] companies = productService.getCompany(pros, "롯데");
		for (Product p : companies) {
			if (p == null) break;
			System.out.println(p.getCompany());
		}
	}
}