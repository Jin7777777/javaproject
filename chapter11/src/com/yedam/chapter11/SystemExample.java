package com.yedam.chapter11;

public class SystemExample {
	public static void main(String[] args) {
//		//System.exit() 강제종료
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//			if(i ==5) {
//				System.exit(0); //얘를 만나면 바로 프로그램 종료 왠만하믄 쓰지마셈여 비추비추
//			}
//		}
//		System.out.println("프로그램 종료");
		
		//현재 시각 읽기
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i =1; i<=100000; i++) {
			sum += i; 
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("sum : " + sum);
		System.out.println("계산 시간 : " + (time2-time1) + "나노초가 소요됨.");
		
		long time3 = System.currentTimeMillis(); //중복되지 않는 데이터를 가지고 오고 싶을때 쓰면 된다
		System.out.println(time3);
	}

}
