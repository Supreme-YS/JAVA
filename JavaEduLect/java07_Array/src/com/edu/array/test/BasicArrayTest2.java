package com.edu.array.test;

import java.util.ArrayList;

/**
 * 배열은 선언 + 생성 + 초기화 --> 보통 한 번에 한다
 */
public class BasicArrayTest2 {

	public static void main(String[] args) {
		
		int[] arr1 = {11, 22, 33};
		int[] arr2 = {100, 200, 300};
		
		// 각각 배열 안에있는 요소를 꺼내서 출력
		// 향상된 For문
		// 뭐가 어디서 돌아가는가?
		
		for (int i : arr1) System.out.println(i);
		for (int i : arr2) System.out.println(i);
		System.out.println("=============================");
		
		System.out.println("참조 전 arr1 주소값 : " + arr1);
		System.out.println("참조 전 arr2 주소값 : " + arr2);
		arr1 = arr2;
		System.out.println("참조 후 arr1 주소값 : " + arr1);
		System.out.println("참조 전 arr2 주소값 : " + arr2);
		// 참조가 끊어지면 효용가치가 없어진다.(Garbage) ★힙메모리★를 관리해주는 G.C
		// 즉각적으로 지우지 않는다. 쓰레드이고 우선순위를 기반으로 하는데 G.C는 우선순위가 가장낮은 1이다

		for (int i : arr1) System.out.println(i);
		for (int i : arr2) System.out.println(i);
		
	}
}
