package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) { 
		boolean run = true;
		Scanner sc = new Scanner(System.in); //scanner추가는 ctrl+ shift + o
		
		int[] scores = null; //while문 내부에 선언하면 안됨 내부에 있으면 끝에 도달하면 그냥 사라짐 그리고 다시 돌아가면 scores가 다시 널이 됨 그래서 오류가 끔
		//while문이 끝나더라도 계속해서 값을 가져야한다면 while문 밖에 선언해야함 
		int studentNum = 0;
		
		while(run) {//처음부터 끝까지 그냥 계속 실행 얘는 그냥 단기기억상실
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | .3점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNO = Integer.parseInt(sc.nextLine()); //재실행이 되니까 
			//반복문안에서 switch는 안쓰는게 좋음
			//while문 안에서 switch문을 쓰면 break가 흐름을 멈춤 switch문을 사용하고 싶으면 boolean 타입을 선언해 줘야함
			switch(selectNO) {
			case 1 :
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2 :
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]> ");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3 :
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n",i , scores[i] );
				}
				break;
			case 4 :
				int sum =0;
				int max = scores[0];
				for(int i=0; i<scores.length; i++) {
					//최고점수
					if(max < scores[i]) {
						max = scores[i]; //기존의 값을 덮어씀
					}
					//총합
					sum += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 : "+ ((double)sum/ scores.length));
				break;
			case 5:
				run = false;
				break;
			default : 
				System.out.println("정해진 메뉴를 입력하지 않았습니다.");
				System.out.println("다시 입력해주세요.");
				
			
			}
			
		}
		
		
		
		
	}
}
