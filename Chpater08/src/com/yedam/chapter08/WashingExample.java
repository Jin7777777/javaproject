package com.yedam.chapter08;

public class WashingExample {
	public static void main(String[] args) {
		WashingMachine wm = new LGWashingMachine();
		
		//매개변수 다형성 쓰기
		//washing 이라는 메소드에 매개변수 넣어주기
		//이게 개발코드를 수정하지 않으면서 객체 교환이 가능하다 그 말임 중요!!!!!!!!!
		wasing(new LGWashingMachine()); //여기 매개변수가 밑에 매개변수로 전달 됨. 
		//wasing(new SamsungWashingMachine()); //이라고 하면 밑에 내용은 삼성으로 바뀜 이게 다형성....
	}
	
	
	public static void wasing(WashingMachine wm) { //wasing이라는 메소드 만들기 //매개변수넣기
		//내가 이 기능을 계속 쓰고 싶음 
		wm.startBtn();
		System.out.println("세탁기 속도는 " + wm.cahngeSpeed(3));
		wm.stopBtn();
	}
	
	
	
	
	
}
