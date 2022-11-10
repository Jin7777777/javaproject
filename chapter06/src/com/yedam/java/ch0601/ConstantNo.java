package com.yedam.java.ch0601;

public class ConstantNo {
	
	//필드
	static final double PI = 3.14; //final을 넣으면 관례로 대문자로 써줌
	static final int EARTH_ROUND = 46250; // final을 써주면 earthRound에서 EARTH_ROUND로 이름 바꿔줘야함
	static final int LIGHT_SPEED = 127000;
	static int a = 10;
	
	String words = "This is Java";
	char word = 'Y';
			
	//생성자
	
	//메소드
	//static 필드에 사용 범위 (scope)
	//static간에 필드 사용 //static안에서는 static만 사용가능 
	static void getCircle(int radius) {
		//pi * r * r
		System.out.println("원 넓이 : " + (PI*radius*radius));
	}
	//메소드에 static 필드 호출 //일반에선 static 호출 가능 
	public void allData() {
		double result = PI + EARTH_ROUND + LIGHT_SPEED;
		System.out.println(result);
		getCircle(1);
	}
	
	//static 메소드에 일반 필드, 메소드 사용
	public static void words() {
		//String getWord = words + String.valueOf(word);
	} 
	
	
	
	
	
	
	
	
}
