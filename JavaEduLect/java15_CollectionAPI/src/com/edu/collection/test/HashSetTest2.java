package com.edu.collection.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		HashSet<String> set1 = new HashSet<>();
		
		set.add("F");
		set.add("B");
		set.add("A");
		set.add("C");
		set.add("D");
		
		System.out.println(set.size());
		System.out.println(set.toString()); // Collection은 자체적으로 toString() 오버라이딩
		 
		boolean flag = set.remove("B"); //boolean 이거나, Object
		System.out.println("B의 탈퇴처리리 유무 : " + flag);
		
		System.out.println(set);
		
		set.clear(); // 모든 데이터를 삭제합니다.
		System.out.println("set 전체 데이터 삭제 유무 : " + set.isEmpty());
	}

}
