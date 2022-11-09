package com.yedam.java.ch0601;

public class CarExample {

	public static void main(String[] args) {
		//클래스는 타입 타입처럼 사용
		Car car1 = new Car(); //new는 생성자 호출 car1이 인스턴스 참조
		System.out.println("최대 스피드 : " + car1.maxSpeed);//car1.찍고 안에 있는 필드 생성자 메소드를 고르게 한다.
		System.out.println("색깔 : " + car1.color);
		car1.run();
		
		System.out.println();
		
		Car car2 = new Car(); //새로운 인스턴스 생성 참조
		System.out.println("최대 스피드 : " + car2.maxSpeed);//car1.찍고 안에 있는 필드 생성자 메소드를 고르게 한다.
		System.out.println("색깔 : " + car2.color);
		car2.run();
		
		System.out.println();
		
		if(car1 == car2) {
			System.out.println("car1과 car2는 동일한 객체를 참조합니다.");
		}else {
			System.out.println("car1과 car2는 서로 다른 객체를 참조합니다.");
		}
		//같은 클래스를 참조한건 맞는데 다른 존재임 new는 새로운걸 만들어 내는것 new는 무조건 새로운 인스턴스 생성!!
	}//실제 사용유무와 상관없이 프로젝트는 다 메소드에 올라감 설계도 방임

}
