package com.yedam.chapter08;

public class LGWashingMachine implements WashingMachine {

	@Override
	public void startBtn() {
		System.out.println("세탁기가 빨래를 시작.");
		
	}

	@Override
	public void pauseBtn() {
		System.out.println("세탁기가 빨래를 일시중지.");
		
	}

	@Override
	public void stopBtn() {
		System.out.println("세탁기가 빨래를 중지.");
		
	}

	@Override
	public int cahngeSpeed(int speed) {
		switch(speed) {
		case 1 :  //1번 모드는 속도 20을 반환 
			return 20;
		case 2: 
			return 50;
		case 3 : 
			return 100;
		}
		return 0;
	}

}
