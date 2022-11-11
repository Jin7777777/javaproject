package com.yedam.chapter0701;

public class DmbCellPhone extends CellPhone {

	// 필드
	public int channel;

	// 생성자 //부모의 필드를 넣어줌(model, color)
	public DmbCellPhone(String model, String color, int channel) {
		//super(); 가 생략된거임 부모클래스에서 생성자가 없기때문에 여기서 객체생성하고 바로 쓰는거고 member는 people에 부모 생성자가 있기 때문에 super로 불러와서 써줌
		// 부모 클래스 필드
		this.model = model;
		this.color = color;
		// 자식 클래스 필드
		this.channel = channel;
	}

	// 메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
}
