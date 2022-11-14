package com.yedam.chapter08;

public class CarExample {
	
	public static void main(String[] args) {
		//구현클래스를 다른 것을 넣으면 값이 다르게 나옴
		//이게 필드의 다형성 
		//처음에는 넥센 4개 -> 미쉐린 2 넥센 2
		
		Car myCar = new Car();//객체생성
		
		myCar.run(); //넥센타이어에 roll기능이 나옴쓰
		
		System.out.println("=====================");
		
		myCar.frontLeftTire = new MichelinTire(); //미쉐린타이어에서 roll기능을 가져와서 필드에 넣어줌
		myCar.frontRightTire = new MichelinTire();
		
		myCar.run();
		
	}
}
