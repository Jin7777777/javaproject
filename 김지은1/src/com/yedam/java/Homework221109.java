package com.yedam.java;

import java.util.Scanner;

public class Homework221109 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		// 문제1.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println("i : " + i);
			}
		}

		// 문제2.
		for (int i = 0; i < arr1.length; i++) {
			if (i != 3) {
				System.out.println("index" + i + " : " + arr1[i]);
			}
		}
		//문제3.
		System.out.print("변경하고 싶은 값 입력 > ");
		int num = sc.nextInt();
		int change;
		for(int i=0; i<arr1.length; i++) {
			if (i == num) {
				change = arr1[i];
				arr1[i]=1000;
			}
			System.out.println(arr1[i]);
		}
		//문제4.
			int max = arr1[0];
			int min = arr1[0];
			for (int i=0; i<arr1.length; i++) {
				if(max < arr1[i]) {
					max = arr1[i];
				}
				if(min > arr1[i]){
					min = arr1[i];
				}
			}
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);
				
			//문제5
			System.out.print("새로운 값 10개 입력 > ");
			int[]arr = new int[10];
				
			for(int i=1; i<arr.length; i++) {
				arr[i]=sc.nextInt();
				if(i%3 == 0) {
					System.out.println(i);
				}
			}
		
	}

}
