package com.yedam.java.ch0601;
//import 강제 등록

import com.yedam.java.ch0604.Computer;

public class Application {
	
	//생성자 만든 후  ctrl + shift + o
	Computer com = new Computer();
	//필드
	int staticTest = 0;
	
	public static void main(String[] args) {
		Application app = new Application(); //내 자신을 인스턴스로 만들어서 필드 사용
		app.staticTest =2;
		
		
		Shoes shoes = new Shoes();
		
		shoes.makeRunning();
		shoes.makeSlipper();
		shoes.makeMule();
		shoes.getCount();
		
		System.out.println(shoes.totalCount); //static을 가져와서 씀 
		
		ConstantNo csno = new ConstantNo();//인스턴스를 만들어서 꺼내와서 써야함
		System.out.println(csno.word);
		System.out.println(csno.words);
		
		System.out.println(ConstantNo.EARTH_ROUND);
		
		//은행 고객 정보를 관리하는 클래스
		//1) main 2)Customer 3) Bank
		//1) main -> 생성자를 통한 고객의 정보를 저장, 출력
		//2) Bank -> 해당은행의 금리를 저장
		//	 (현재 잔액 + (현재잔액 * 금리))
		//3) Customer -> 고객의 정보를 저장
		//이름, 은행명, 계좌, 잔액 ->필드
		//getInfo() : 입력한 정보를 출력
		//withDraw() : 출금 할 때 정보를 출력
		
		//heap영역에 저장
		Access access = new Access();
		
		//1) public
		access.free = "public";
		access.free();
		
		//2)private
		//access.privacy = "privacy";
		//access.privacy();	
		
		//3)protected
		access.parent = "parent";
		
		//4)default
		access.basic = "basic";
					   //singleton == new Singleton();

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//singleton s1 == new Singleton();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//singleton = new Singleton(); 
		//getInstance() == singleton == new Singleton()
		//getInstance() == new Singleton()
		
		Member mem = new Member();
		
		//1) mem의 인스턴스 필드에 접근 가능한지 확인
		//2)setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-1234-1234");
		mem.setAge(10);
		
		System.out.println("ID : " + mem.getId());
		System.out.println("Tel : "+mem.getTel());
		System.out.println("Age : " + mem.getAge());
		
		//
	}

}
