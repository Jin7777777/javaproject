package com.yedam.java.example;

import java.util.Scanner;

public class ExeApp {
	Scanner sc = new Scanner(System.in);
	Bank[] Bary = null;
	int menuNo;
	public ExeApp(){
		
	while (true) {
			
			
			showMenu();
			System.out.println("메뉴선택 > ");
			menuNo = Integer.parseInt(sc.nextLine());
			
			switch(menuNo) {
			case 1:
				setSize();
				break;
			case 2:
				setInfo();
				break;
			case 3:
				
				break;
			case 4:
				showInfo();
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			
			}
			
			// 회원 수를 입력받아서 배열의 크기 지정
			 // 수를 int count에 받아서
			// Bary = new Bank[count]; // 배열의 크기를 지정
			/*
			 * //123123123 엔터 sc.next();//엔터를 빼고 데이터를 다 가져감
			 * 
			 * //123123123 엔터 sc.nextLine(); //엔터를 포함해서 엔터를 기준으로 앞에 있는 데이터를 다 가져감
			 */

			// Bank[] Bary = new Bank[2]; //배열을 만듬 아직 기본값은 null

			// 배열의 크기만큼 반복문을 실행
			// 회원 정보를 객체에 담아서 배열에 저장

			
		
		}
		
		
	}

	// 메뉴 출력
	public void showMenu() {
		System.out.println("================================================================");
		System.out.println("| 1. 회원 수 입력 2. 정보 입력 3. 단건 조회 4. 모두 조회 5. 삭제 6. 종료 |");
		System.out.println("================================================================");
	}
	//4. 모두 조회
	public void showInfo() {
		for (int i = 0; i < Bary.length; i++) {
			Bary[i].getInfo();
		}
	}
	
	//1. 회원 수 입력 기능 구현
	public void setSize() {
		System.out.println("회원의 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		Bary = new Bank[count];
	}

	// 회원 정보 입력 //2. 정보입력 기능 구현 
	public void setInfo() {
		for (int i = 0; i < Bary.length; i++) { // 반복문을 돌림

			Bank bank = new Bank(); // Bank class를 들어가보면 내용물(필드) 4개가 보임
			// 지금은 빈깡통상태 //반복문 돌때 또 빈깡통이 생겨야 하므로 젤 위에 있어야 함 //bank가 for문 밖에 있으면 덮어쓰기해서 젤
			// 마지막값만 들어가게 됨

			// 1. 계좌 번호 입력
			System.out.println("계좌번호 >");
			int account = Integer.parseInt(sc.nextLine()); // int account에 정보저장
			bank.setAccount(account); // 만들어놓은 메소드를 불러와서 account 정보 넣어주기

			// 2. 은행 입력
			System.out.println("은행입력 > ");
			String bName = sc.nextLine();
			bank.setBank(bName);

			// 3. 예금
			System.out.println("금액설정 > ");
			int money = Integer.parseInt(sc.nextLine()); // 금액을 int money에 받고
			bank.setMoney(money); // setMoney를 통해서 저장

			// 4. 고객 이름 입력
			System.out.println("고객이름 > ");
			String name = sc.nextLine();
			bank.setName(name);

			// bank객체(계좌번호, 은행이름, 예금, 고객이름)는 꽉찬 깡통
			Bary[i] = bank; // 해당하는 인덱스에 저장 0 ->1->.... 반복문 돌기!!
		}

	}
}
