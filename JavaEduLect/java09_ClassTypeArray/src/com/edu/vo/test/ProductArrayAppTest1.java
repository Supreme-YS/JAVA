package com.edu.vo.test;

import com.edu.vo.Product;

// 여러개의 상품 객체들을 핸들링
public class ProductArrayAppTest1 {

	public static void main(String[] args) {
		
		Product[] pros = {
				new Product("라면", 2000, 5, "농심"),
				new Product("음료수", 1500, 2, "롯데"),
				new Product("과자", 4000, 1, "롯데"),
				new Product("가전", 4000000, 1, "삼성"),
		};
		
		System.out.println("=======1. 상품 정보를 출력합니다.=======");
		for (Product p : pros) System.out.println(p.getDetails());
		System.out.println("=======2. 상품 메이커를 출력합니다.=======");
		for (Product p : pros) System.out.println(p.getMaker());
		System.out.println("=======3. 10만원이상 고개제품을 출력합니다.=======");
		for (Product p : pros) {
			if (p.getPrice() > 100000) {
				System.out.println(p.getDetails());
			}
		}
		System.out.println("=======4. 지금까지 구매한 상품의 총 가격을 출력합니다.=======");
		int total = 0;
		for (Product p : pros) {
			
			total += p.getQuantity() * p.getPrice();
		}
		System.out.println(total);
	}

}
