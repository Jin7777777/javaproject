package com.yedam.java.ch0601;

public class Car {
	//필드  : 속성
	int maxSpeed  = 100;
	String color = "red";
	
	//생성자 생성자는 클래스와 이름이 같아야함  리턴하는 값이 존재하면 안됨
	public Car() {
		System.out.println("자동차가 출하되었습니다.");
	}
	
	//메소드 : 동작 메소드는 본인의 이름이 존재하고 리턴하는값(void)표시
	public void run() {
		System.out.println("자동차가 동작 중입니다.");
	}

}
