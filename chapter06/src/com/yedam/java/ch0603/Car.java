package com.yedam.java.ch0603;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "파랑";
	int maxSpeed = 350;
	int spped;
	
	// 생성자 this는 생성자나 메소드에서만 사용가능  this 는 힙 인스턴스 !!
	public Car() {
		
				}
	public Car(String model) {
		//this.model = model; //기본의 모델값에 외부의 모델값
		this(model, "은색"); //더 포괄적인 this에서 불러올수 있음!! 호출 얘는 반드시 첫번째에 있어야함 이전에 어떤 명령어도 허용하지 않음. 
		//this가 있으면 인스턴스라고 생각하면 됨
	}
	
	public Car(String model, String color) { // 괄호안에 매개변수로 }
		//this.model = model; //해당 인스턴스가 가진 필드입니다 하고 알려줌 
		//this.color = color; //인스턴스를 만들고 그 값을 대체 필드를 건드는게 아님.this 는 힙 인스턴스 !!
		//System.out.println("인스턴스를 생성했습니다.");
		this(model, color, 250); 
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
