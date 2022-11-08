package com.yedam.java.example;

public class Check01 {

	public static void main(String[] args) {
		// 문제 1) 주어진 배열의 총합과 평균을 구하세요.
		int[] array = { 10, 53, 26, 85, 75 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) { // 배열은 인덱스를 기반 시작값이 0 그래서 i도 0부터 실제로 i의 값은 array length -1 (0부터 시작하기
													// 때문)
			sum += array[i]; // sum에 array가 가진 값을 계속 누적 더해주기
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / array.length; // 평균은 for문안에 쓰면 안됨 실제로 총합이 결정되는 for문 밖에서 구해야함
		System.out.printf("평균 : %.2f\n", avg);

		// 문제 2 ) 배열의 최대값과 최소값을 구하세요 //int는 음수값도 가질 수 있으므로 min = 0; 안됨 최대값 최소값을 임의로 정하면
		// 안됨.
		int max = array[array.length - 1]; // 일단 array가 가지는 값의 아무 값이나 넣어줌
		int min = array[array.length - 1];
		for (int i = 0; i < array.length; i++) {
			// 최대값
			if (max < array[i]) {
				max = array[i]; // 기존의 max값을 버리고 더 큰 값을 덮어씀
			}
			// 최소값
			if (min > array[i]) {
				min = array[i];
			}

		}

		// 문제3) 문제2에서 구한 최대값과 최소값이 각각 몇번째 값인지 구하세요.
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < array.length; i++) {
			// 최대값
			if (max == array[i]) {
				maxIndex = i;
				}
			// 최소값
			if (min == array[i]) {
				minIndex = i;
			}
		}
		System.out.println("최대값 : " + max + "는 " + (maxIndex +1) +"번째입니다.");
		System.out.println("최소값 : " + min + "는 " + (minIndex +1) +"번째입니다.");

	}

}
