package com.yedam.chapter08;

public class DriverExample {

	public static void main(String[] args) {
		// 매개변수의 다형성 확인!!!
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

//		driver.driver(bus); // 이 매개변수가 Driver의 Vehicle vehicle매개변수로 이동
//		driver.driver(taxi);// 하나의 구현객체를 정해놓고 어떤 구현클래스를 넣냐에 따라 다양한 결과가 나옴 ->매개변수의 다형성 어떤 매개변수가 들어올지에 따라 값이
							// 다양하게 바뀐다.

		Vehicle vhc = new Bus(); //Bus를 가지고 vhc라는 구현객체를 만들었음.

		vhc.run();
		// vhc.checkFare();

		// 강제 타입 변환
		Bus bus2 = (Bus) vhc;

		bus2.run();
		bus2.checkFare();
		
		//객체 타입 확인
		//instanceof
		System.out.println("====================");
		driver.driver(bus);
		driver.driver(taxi);
		
	}
}
