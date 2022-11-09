package com.yedam.java.ch0602;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("제작회사  : " + myCar.company);
		System.out.println("모델명  : " + myCar.model);
		System.out.println("색깔  : " + myCar.color);
		System.out.println("최고속도  : " + myCar.maxSpeed);
		System.out.println("현재속도  : " + myCar.speed);
		//변수는 그냥 쓰지만 필드는 어디에 속해있기 때문에 속한곳.필드이름 입력!!
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		
	}

}
