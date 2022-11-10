package com.yedam.java.ch0601;

public class Customer {
	//필드
	String name;
	String bankName;
	int id;
	static int save;
	
	//생성자
	
	
	//메소드
	public void getInfo() {
		System.out.println("=== 입력 하신 회원 정보 ===");
		System.out.println("이름 : " + name );
		System.out.println("은행명 : " + bankName);
		System.out.println("계좌 : " + id);
		System.out.println("잔액 : " + save);
	}
	
	public void withDraw() {
		double result = save + (save * (Bank.rate*0.01));
		System.out.println("=== 출금 ===");
		System.out.println("출금하실 경우 아래의 금액으로 출금이 가능합니다.");
		System.out.println("원금  : " + save);
		System.out.println("금리 : " +Bank.rate+ " %");
		System.out.println("예상 금액 : " + result+"원 입니다.");
	}
}
