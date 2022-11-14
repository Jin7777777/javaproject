package com.yedam.chapter08;

public class MyClassExample {
	
	public static void main(String[] args) {
	
		System.out.println("1)-----");
		MyClass mc = new MyClass();
		//RemoteControl rc = new Television();의 rc임
		mc.rc.turnOn(); //mc도 객체 mc안에 리모트 컨트롤의 rc 객체 또 그 밑에 메소드 호출
		mc.rc.turnOff();
		mc.rc.setVolume(3);
		
		System.out.println("2)-----");
		//RemoteControl rc = new Audio();
		MyClass mc2 = new MyClass(new Audio());
		//rc.turnOn();
		//rc.turnOff();
		
		System.out.println("3)-----");
		MyClass mc3 = new MyClass();
		mc3.methodA();
		//rc.turnOn();
		//rc.turnOff();
		
		System.out.println("4)-----"); //매개변수의 다형성의 예 Driver!!
		//RemoteControl rc = new Televison();
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
		//rc.turnOn();
		//rc.turnOff();
	}
}
