package com.yedam.java.ch0601;

public class Game {
	
	//필드 //필드에 이렇게 미리 정보를 넣어주면 이 정보를 다 가지고 옴 ex)마인크래프트에 대한 유저의 정보를 만들거니까 마인크래프트를 미리 넣어줘서 main에서 계속 넣어줄 필요가 없음. 
	//객체롤 만든다(인스턴스화로 된다) ->인스턴스 필드 , 인스턴스 메소드로 이름이 바뀌게 됨
	static String gameName = "마인크래프트";
	String server = "한국";
	String id;
	String passWd;
	//생성자 //여러개 선언 가능 //생성자는 내 클래스이름으로 무조건 만들어 줘야함 
	public Game() {
		
	}
	public Game(String id) { //같은 이름의 생성자라도 매개변수가 달라지면(갯수가 달라지던 매개변수가 달라지던 타입이 달라지던) 생성자를 여러개 만들수 있음 만들어서 내가 원하는 데이터를 어떻게 넣을지 정할수 있음
		this.id = id;
	}
	public Game(String id, String passWd) {
		this.id= id;
		this.passWd = passWd;
	}
	//메소드
	//인스턴스 메소드
	void getInfo() {
		System.out.println("GameName : " + gameName);
		System.out.println("server : " + server);
		System.out.println("id : " +id);
		System.out.println("password : " + passWd);
	}
	void getInfo(String temp) {
		
	}
}
