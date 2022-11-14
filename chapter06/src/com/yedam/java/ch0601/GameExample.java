package com.yedam.java.ch0601;

public class GameExample {

	public static void main(String[] args) {
		
		Game user1 = new Game(); //gameName이랑 server는 필드에 정보가 있으니까 나머지는 정보를 직접 넣어줌
		user1.id = "예담이";
		user1.passWd = "1234";
		
		Game user2 = new Game("예담이2");
		user2.passWd = "4321";
		
		Game user3 = new Game("예담이3", "4567");
		
		user1.getInfo();
		System.out.println("====================");
		user2.getInfo();		
		System.out.println("====================");
		user3.getInfo();
		
		//System.out.println("====================");
		//static 필드 사용 
		System.out.println(Game.gameName);
		
	}

}
