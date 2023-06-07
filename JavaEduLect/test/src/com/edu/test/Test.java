package com.edu.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력 ");
		
		//숫자 입력
		int cnt = sc.nextInt();
		//숫자 갯수만큼 배열 생성 및 입력
		int arr[] = new int[cnt];
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = sc.nextInt();
		}
		// 빈도수 체크를 위한 입력 갯수만큼 배열생성
		int[] target = new int[cnt];
		for(int i = 0; i < target.length; i++) {
			//target 배열에서 arr[i]에 넣었던 value를 index로 활용해서 배열의 값을 1씩 증가
			target[arr[i]]++;
		}
		
		int answer = 0;
		int hitCnt = 0;
		
		for (int i = 0; i < cnt; i++) {
			// target 배열을 돌면서 값 체크, 최고로 많이 친 값을 최빈값으로 설정
			if (hitCnt < target[i]) {
				hitCnt = target[i];
				answer = i;
			}
		}
		
		System.out.println("가장 많은 타입의 유형은 " + answer + " 타입입니다!");
		
	}

}
