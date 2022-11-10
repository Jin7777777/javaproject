package com.yedam.java.ch0601;

public class Singleton {

	// 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩 기법
	//private static Singleton singleton = new Singleton(); // static은 누구나 접근가능인데 private는 아무나 접근불가능
	// 단하나의 객체만 만드는것 //singleton = new Singleton();
	// 객체의 타입이 singleton
	/*
	 * private Singleton() { //객체 생성을 막음
	 * 
	 * }
	 * return singleton;
	 * public static Singleton getInstance() { // return singleton; //반환이 된다..
	 * //singleton = new Singleton(); 얘가 반환되는 것 //getInstance()를 호출하면 == singleton
	 * == new Singleton() //getInstance() == new Singleton() }
	 */

	private static Singleton singleton = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			return singleton = new Singleton();
		} else {
			return singleton;
		}
	}
		public void run() {
			System.out.println("싱글톤이 작동중입니다.");
		}
		public void connectDB() {
			System.out.println("데이터베이스를 연결시킵니다.");
		}
		//자주쓰는 기능을 한곳에 모아놓고 쓴다. 
		//이게 뭘까 난 모르겠어!!
		
		
		
	}


