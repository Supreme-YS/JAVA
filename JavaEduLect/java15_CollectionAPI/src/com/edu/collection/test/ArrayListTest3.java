package com.edu.collection.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("AA");
		list.add("DD");
		list.add("FF");
		list.add("AA");
		list.add("BB");
		list.add("BB");
		
		System.out.println(list);
		
		//1. AA를 삭제
		System.out.println(list.remove(0) + " 데이터 삭제 성공");
		System.out.println(list);
		list.remove("AA");
		System.out.println(list);
		
		//2. 가장 첫번째에 HH데이터를 저장
		list.add(0, "HH");
		System.out.println(list);
		
		//3. 3번째 저장된 데이터를 받아서 출력
		System.out.println(list.get(2));
	}

}
