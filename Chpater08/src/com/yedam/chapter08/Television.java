package com.yedam.chapter08;

public class Television implements RemoteControl, Search{//, WashingMachine {
	// 구현받을 클래스만들어줌 RemoteControl에 있는 애들을 다 오버라이딩해줘야함

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override //TV라는 객체를 만들건데 거기에  volume이라는 값을 넣어주는데 0~10까지만 가능한 그래서 볼륨이 10보다 큰 수가 들어오면 10에 맞춰주고 0보다 작은수가 들어오면 0으로 유지 근데 그 사이의 값이 들어오면 그냥 그대로 사용
	//getter setter  활용
	public void setVolume(int volume) { //매개변수가 있어서 이 클래스에서 쓸 수 있는 필드를 만들어 줘야함.
		if(volume > RemoteControl.MAX_VOLUME) {//상수불러오기 인터페이스명 + .연산자
			this.volume = RemoteControl.MAX_VOLUME; //지금 여기 필드의 볼륨에다가 대입
		}else if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨은 : " +this.volume + "입니다.");
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

}
