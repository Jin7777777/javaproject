package com.yedam.chapter08;

public class Driver {

	public void driver(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //True,  False
			Bus bus = (Bus) vehicle; //강제 타입 변환
			bus.checkFare();
		}
		vehicle.run();
		
		
	}
}
