package com.yedam.java.example;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		// 로또 번호를 예측하는 프로그램
		boolean run = true; // while문을 제어할 변수
		Scanner sc = new Scanner(System.in);

		int[] numList = null;
		int count = 0; //index일때는 -1부터 시작하는 경우도 있다 증감연산자를 앞에 붙여야 하는 경우 count = 0 ?
		
		while (run) { 
			System.out.println("---------------------------------------------------------");
			System.out.println("1.새로고침 | 2.번호예측 | 3.번호삭제 | 4.번호출력 | 5.분석 | 6.종료");
			System.out.println("---------------------------------------------------------");
			System.out.println("선택> ");
			int selectNO = Integer.parseInt(sc.nextLine());

			if (selectNO == 1) {// 로또 번호를 담을 수 있는 배열 초기화 ->기존의 넘리스트가 값이있든 없든 새롭게 배열 선언
				numList = new int[6];
				count =0;
			} else if (selectNO == 2) {// 1~45 중에 랜덤한 값을 가져옴
				if(count < numList.length) { 
				int num = (int)(Math.random()*45)+1;
				//count가 무한정 늘어날 수가 없다. 
				numList[count++] = num; //인덱스역할도 하고 현재 몇개가 카운트 됐는지도 알수있음
				System.out.println("현재 가져온 수의 갯수 : " + count );
				}else {
					System.out.println("더 이상 숫자를 가져올 수 없습니다.");
				}
			} else if (selectNO == 3) {// 기존에 값 중 가장 최근 값을 하나 삭제
				//count = 6 -> numList의 0~5까지 
				numList[--count] =0; 
				System.out.println("현재 가져온 수의 갯수 : " + count);
			} else if (selectNO == 4) {// 배열의 값을 전부 출력
				System.out.println("현재 가지고 있는 수의 갯수 : " + count);
				for(int i=0; i <count; i++) {
					System.out.print(numList[i]+ " ");
				}
				System.out.println();
			} else if (selectNO == 5) {// 중복유무와 중복된 값이 몇번 중복되었는지
				int[] list = new int[45];
				//개표
				for(int i=0; i<count; i++) {
					int index = numList[i] -1;//크기는 6갠데 값은 45개로 
					list[index]++;
				}
				//개표상황을 정리해서 보여줌
				boolean isChecked = false;
				for(int i=0; i < list.length; i++) {
					if(list[i] <=1) continue; //0은 투표 1은 자기 자신만 있음 중복이 될려면 2개 이상이니까.
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n", (i+1), list[i]);
					isChecked = true;
				} 
				if(!isChecked) {
					System.out.println("중복값이 존재하지 않습니다.");
				}
			} else if (selectNO == 6) {// 종료
				run = false;
				
			}
			

		}System.out.println("정해진 메뉴를 입력하지 않았습니다.");
		System.out.println("메뉴를 확인하고 다시 입력하세요.");

	}
}
