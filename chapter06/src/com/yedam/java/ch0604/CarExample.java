package com.yedam.java.ch0604;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); //메서드를 호출해서 값을 집어넣음
		/*
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
			
		}*/
		myCar.run();
	}

}
