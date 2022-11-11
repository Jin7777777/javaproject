package com.yedam.chapter0702;

public class Application2 {
	public static void main(String[] args) {
		
		HankookTire hTire = new HankookTire("right", 10);
		KumhoTire KTire = new KumhoTire("left", 20);
		
		//❗❕❕다형성❗❕❕
		//금호타이어객체의 자식 객체인 hTire
		//tire -> 한국 타이어를 사용하고 있다.
		Tire tire = hTire; //자식에서 재 정의 해놓은 메소드를 가져와서 씀
		System.out.println(tire.roll());
		
		//부모에 KTire로 갈아끼움 KTire에서 재정의 된거 쓰고 나머지는 부모꺼 씀 
		tire = KTire;
		System.out.println(tire.roll());
		
		tire = hTire;
		System.out.println(tire.roll());
	}
}
