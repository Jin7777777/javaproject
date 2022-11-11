package com.yedam.chapter0702;

public class Application {
	public static void main(String[] args) {
		
		Car car = new Car(); // 타이어가 다 달려있음
		
		for(int i=1; i<5; i++) {
			int problemTire = car.run();//자동차를 굴림 수명이 다하면 위치 알수 있음
			
			switch(problemTire) {
			case 0:
				System.out.println("4짝이 다 멀쩡합니다.");
				break;
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽",15);
				//frontLeftTire -> Tire타입의 필드 를 한국타이어로 바꿔줌 
				//한국타이어는 타이어를 상속받고 있음  자동타입변환으로 상속받고있는 자식!! 한국타이어로 바꿔끼워줌
				//frontLeftTire가 펑크가 나면 ->타이어 교체
				//자식클래스인 한국타이어로 교체하고싶댱..
				//부모 클래스에서 오버라이딩한 내용을 바꿔 끼우게 되는 것
				//자동 타입변환으로 인해서 가능한 일.
				//Hankook tire = new HankookTire("앞왼쪽",15);
				//car.frontLeftTire = tire
				//위 에 두줄이 car.frontLeftTire = new HankookTire("앞왼쪽",15); 이렇게 표현됨
				break;	
			case 2:
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽",17);
				break;
			}
		}
	}
}
