package com.edu.collection.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTest4 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		//1. Collection과 다른 계보임 Java 8 api documents 읽어보기
		//a-90, b-95, c-81, d-70
		
		map.put("a", 90);
		map.put("b", 95);
		map.put("c", 81);
		map.put("d", 70);
		
		//2. 맵에 담겨있는 모든 키값 출력
		System.out.println(map.keySet());
		Set<String> nameSet = map.keySet();
		//3. 매핑된 점수를 받아서 모든 점수의 총점을 출력
		
		System.out.println(map.values());
		
		int total = 0;
		for (String name : nameSet) {
			int score = map.get(name);
			total += score;
		}
		System.out.println(total);
		
		//4. 저장된 모든 사람들의 평균점수를 출력
		System.out.println(total / map.size());
	}

}
