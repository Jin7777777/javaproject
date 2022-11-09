package com.yedam.java.ch0604;

public class Calculator {//메소드 만들기
	void powerOn() { // return되는 값이 없으니까 void
	System.out.println("전원을 켭니다.");
	}
	//return되는 값이 int니까 int
	int plus(int x, int y){ //반환되는 값이 void가 아닐때는 return을 꼭 적어줘야함 
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y){ // 매개변수로 들어온 값과 반환되는 값이 다를 수 있음 int값이 들어왔지만 return되는 값은 double값
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	///
	double avg(int x , int y){
		int sum = this.plus(x, y);
		double result = sum /2.0;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	//사각형의 넓이 구하기
	double areaRectangle(double width) {
		return width * width; //연산하고 리턴시킴
	} 
	double areaRectangle(double width, double heigth) {
		return width * heigth;  
	}
	
	
}
