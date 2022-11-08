package com.yedam.java;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int[] dice = null;
		int diceSize =0;
		int count = 0;
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택 > ");
			int selectNO = Integer.parseInt(sc.nextLine());
			
			if (selectNO == 1) {
				System.out.print("주사위 크기> \n");
				diceSize = Integer.parseInt(sc.nextLine());
				count =0;
				
			}else if(selectNO == 2) {
				count =0;
				while(true) {
					int dice1 = (int) (Math.random() * 6) + 1;
					count++;
					if(dice1==5)break;
				}System.out.println("5가 나올때까지 주사위를"+count+"번 굴렸습니다.");
			}else if(selectNO == 3) {
				int[] list = new int[6];
				for(int i=0; i<count; i++) {
					int index = dice[i] -1;//
					list[index]++;
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n", (i+1), list[i]);}
				
			}else if(selectNO == 4) {
				
				
			}else if(selectNO == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}
}
