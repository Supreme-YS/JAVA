package com.edu.service;

import com.edu.vo.Product;

//상품들을 관리하는 기능들로만 작성된 서비스 클래스
//이후 기술에서는 DB 연동되기 때문에 DAO 클래스로 발전될 것이다.
// 값입력, 결과값출력 X 
public class ProductService {
	
	public String[] getAllMaker(Product[] pros) {
		//리턴 타입이 있으면 선언부터 하는게 맞다.
		String[] temp = new String[pros.length];
		
		int idx = 0;
		for (Product p : pros) {
			temp[idx++] = p.getMaker();
			//idx++; 좋은 코드 작성을 위해 위 코드와 같이 작성함
		}
		return temp;
	}

	public int getTotalPrice(Product[] pros) {
		//리턴 타입이 있으면 선언부터 하는게 맞다.
		int total = 0;
		for (Product p : pros) {
			total += p.getPrice();
		}
		return total;
	}
	/**
	 * 
	 * 검색하는 기능 
	 * 
	 * search~~/find~~()
	 * 
	 * level 1
	 * public Product[] getFindMaker()
	 * public Product[] certainCompanyProduct()
	 * public Product[] priceScope()
	 * public Product aProduct()
	 * 
	 * -----------------------------------------------
	 * Method Overloading
	 * "하는 일은 같지만 데이터를 달리할 때 사용하는 기법"
	 * Rule1.
	 * 1) 메소드 이름은 같아야 한다.
	 * 2) 메소드 인자값은 반드시 달라야 한다.(순서, 데이타 타입, 갯수)
	 *   a(int x, int y)
	 *   a(int y, int x) -- 오버로딩 규칙에 위배됨.
	 * 3) 메소드의 리턴타입은 상관없다.
	 * -----------------------------------------------
	 * 
	 * level 2
	 * public Product[] searchProduct(String maker)
	 * public Product[] searchProduct(String maker, String company)
	 * public Product[] searchProduct(String maker, int min, int max)
	 * public Product searchProduct(String company)
	 * 
	 *  -----------------------------------------------
	 *  
	 * level 3
	 * public Product[] searchProductByMaker (String maker)
	 * public Product[] searchProductByCompany(String maker, String company)
	 * public Product[] searchProductByPrice(String maker, int min, int max)
	 * public Product searchProductBy(String company)
	 */
	
	  //  특정 가격 이상의 제품들을 가져옵니다.
	public Product[] searchProductByPrice(Product[] pros, int price) {
	    Product[] temp = new Product[pros.length];
	    int idx = 0;
	    for (Product p : pros) {
	    	if (p.getPrice() >= price) {
	    		temp[idx++] = p;
	    	} 
	    }
	    return temp;
	}
	
	//  동일한 회사의 제품을 가져옵니다.
	public Product[ ] getCompany(Product[] pros, String company) {
	    Product[ ] temp = new Product[pros.length];
	    
	    int idx = 0;
	    for (Product p : pros) {
	    	if (p.getCompany().equals(company)) {
	    		temp[idx++] = p;
	    	}
	    }
	    return temp;
	}
	
	// 구매한 제품들의 평균가를 받아옵니다.
	public int getAvgPrice(Product[ ] pros) {
	    return getTotalPrice(pros)/pros.length;
	}
}
