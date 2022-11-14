package com.yedam.chapter08;

public interface RemoteControl { //인터페이스는 기본설계도 
	//인터페이스는 상수랑 추상메소드만 선언가능
	//상수
	//public static final PI = 3.14;
	//추상메소드 
	//public void method1();
	
	//기본설계도
	//대규모 프로젝트 ->번역
	//A : 영어 -> 한글 (메소드 : 번역)
	//B : 영어 -> 일본어 (메소드 : method1())
	//C : 영어 -> 중국어 (메소드 : method2())
	//A, B, C가 번역에 필요한 기본적인 인터페이스를 받아서 거기에 맞춰서 기능 구현하기
	
	//프로젝트 완료
	//똑같은 메소드 이름으로 구현
	//유지보수할때 찾기 쉬움
	
	//상수
	//인터페이스에서는 int만 써도 static final이라는 뜻을 가짐 생략된것
	//public static final int MAX_VOLUME = 10;
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드 //얘들을 무조건 상속받아야함 구현객체..들은 구현클래스..
	//public abstract void turnOn(); 
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
	
	
}	
