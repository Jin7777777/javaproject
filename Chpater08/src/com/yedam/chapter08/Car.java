package com.yedam.chapter08;

public class Car {
	//필드의 다형성
	//필드
	Tire frontLeftTire = new NexonTire();
	Tire frontRightTire = new NexonTire();
	Tire backLeftTire = new NexonTire();
	Tire backRightTire = new NexonTire();
	
	void run() {
		frontLeftTire.roll(); //roll은 넥센타이어를 가르킴
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
	}
}
