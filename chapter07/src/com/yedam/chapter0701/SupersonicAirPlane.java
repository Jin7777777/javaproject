package com.yedam.chapter0701;

public class SupersonicAirPlane extends AirPlane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행 모드입니다.");
		}else {
			super.fly(); //자식클래스 내부에서 메소드가 재정의 됐지만 부모 클래스 메소드를 다시 호출해야 하는 경우 super.~~~
		}
	}

	public void test() {
		super.fly();
	}


}

