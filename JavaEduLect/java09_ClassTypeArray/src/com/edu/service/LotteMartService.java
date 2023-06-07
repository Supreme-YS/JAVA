package com.edu.service;

import com.edu.vo.Customer;
import com.edu.vo.Product;

/*
 * LotteMart에서 상품을 구매하는 고객들을 관리하는 기능을 담고있는 서비스 클래스
 */
public class LotteMartService {
	
	// 메소드 구현 X---- 선언부만 작성(리턴타입, 이름, 인자값)
	
	//1. 특정 고객이 구입한 상품을 리턴
	public Product[] productsByCustomer(Customer cust) { //
		return cust.getProducts();
	}
	
	//2. 특정 고객이 구입한 상품의 maker들만 반환하는 기능
	
	public String[] getAllProductMaker(Customer cust) { //
		String[] temp = new String[productsByCustomer(cust).length];
								  //cust.getProducts().length;
		int idx = 0;
		for (Product p : cust.getProducts()) {
			temp[idx++] = p.getMaker();
		}
		return temp;
	}
	
	//3. 모든 고객 중에서 특정한 고객을 검색하는 기능
	
	public Customer findCustomer(Customer[] custs, int ssn) {
		//반환형 초기화
		Customer customer = null;
		
		for (Customer c : custs) {
			if(c.getSsn() == ssn) {
				customer = c;
			} else
				continue;
		}
		return customer;
	}
	
	//4. 같은 동네에 사는 고객들은 리턴
	
	public Customer[] findCustomer(Customer[] custs, String address) {
		Customer[] temp = new Customer[custs.length];
		
		int idx = 0;
		for (Customer c : custs) {
			if (c.getAddress().equals(address)) {
				temp[idx++] = c;
			}
		}
		
		return temp;
	}
	
	//5. 모든 고객 중에서 구입한 물건 중 최고가에 해당하는 물건의 가격을 리턴
	public int getMaxPrice(Customer[] custs) {
		int maxPrice = 0;

		for (Customer c : custs) {
			for (Product p : c.getProducts()) {
				if (maxPrice < p.getPrice()) {
					maxPrice = p.getPrice();
				}
			}
		}
		return maxPrice;	
	}
	
	//6. 특정 고객이 구입한 물건 중 특정 가격 이상의 제품들만 리턴
	public Product[] getMorePriceProducts(Customer[] custs, int price) {
		int len = 0;
		for (Customer c : custs) {
			len += c.getProducts().length;
		}
		
		Product[] products = new Product[len];
		int idx = 0;
		for (Customer c : custs) {
			for (Product p : products) {
				if (p.getPrice() > price) {
					products[idx++] = p;
				}
			}
		}
		return products;
	}
}
