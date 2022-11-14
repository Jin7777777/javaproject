package com.yedam.chapter08;

public class MyClass {
	//필드
	//1)
	//public int a =1; 기본타입만 필드에 넣어 줬었는데
	RemoteControl rc = new Television(); //참조타입도 필드에 넣을수 있음 //오디오나 텔레비전이 리모트컨트롤을 인터페이스를 구현했기때문에 인터페이스 이름만 가져와도 그 기능을 쓸 수 있음...?
	
	//생성자
	public  MyClass() {
		
	}
	public MyClass(RemoteControl rc) { //생성자 매개변수를 이용한 오버라이드
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드
	void methodA() { //함수 메소드를 호출해서 구현해 놓은 클래스를 통해서 실현
		RemoteControl rc = new Audio(); 
		rc.turnOn();
		rc.turnOff();
	}
	
	void methodB(RemoteControl rc) { //매개변수를 통해서 넣은 자식을 객체화해서 ????? 기능 구현
		rc.turnOn();
		rc.turnOff();
	}
}
