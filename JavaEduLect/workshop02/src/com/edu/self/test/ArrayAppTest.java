package com.edu.self.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayAppTest {
	static int[]  list = { 34, 23, 64, 25, 12, 75, 22, 88, 53, 37 };
	
	public static void main(String[] args) {	
		print(list);
		total(list);
		average(list);
		minimum(list);
	}
	
	static void print(int[] arr) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);
		}
		System.out.println(result);
	}

	static void total(int[] arr) {
		int total = 0;
		for(int i = 0 ; i < arr.length; i++) {
			total = total + arr[i];
		}
		System.out.println("배열의 합 : " + total);
	}
		
	static void average(int[] arr) {
		int total = 0;
		double average = 0d;
		for(int i = 0 ; i < arr.length; i++) {
			total = total + arr[i];
		}
		average = total / arr.length;
		System.out.println("배열의 평균 : " + average);
	}
	
	static void minimum(int[]arr) {
		int min = 0;
		for (int i = 0; i < arr.length-1; i++) { //34, 23, 64, 25, 12, 75, 22, 88, 53, 37 };
			if (arr[i] > arr[i+1]) {
				min = arr[i+1];
			} else {
				arr[i+1] = arr[i];
			}
		}
		
		System.out.println("최소값 : " + min);
	}
}
