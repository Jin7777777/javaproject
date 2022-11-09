package com.yedam.java.ch0604;

public class MainExample {

	public static void main(String[] args) {
		//클래스는 바로 사용 노노 인스턴스를 거쳐야함 나중에 그냥 클래스 바로 사용하는것도 배우긴 함 system.out.println  math.random
		Calculator myCalc = new Calculator(); //클래스 변수이름 = 새로선언 클래스 를 myCalc에 담아줘야함
		myCalc.powerOn();
		
		int sumRes = myCalc.plus(5, 7);
		System.out.println(sumRes);
		
		byte x = 10;
		byte y = 4;
		double diviRes = myCalc.divide(x, y);
		System.out.println(diviRes);
		
		//
		Computer myCom = new Computer();
		int[] values1 = { 1, 2, 3 };
		int intResult1 = myCom.sum1(values1); 
		System.out.println("intResult1 : " + intResult1);
		
		int intResult2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 }); //변수선언할때 값을 바로 줌
		System.out.println("intResult2 : " + intResult2);
		
		int intResult3 = myCom.sum2(1, 2, 3 ); //값을 그냥 나열해서 주면 알아서 해결함
		System.out.println("intResult3 : " + intResult3);

		int intResult4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("intResult4 : " + intResult4);
		
		myCalc.powerOff();
		
		myCalc.execute();
		
		//사각형
		//같은 이름의 메서드를 호출하지만 넘겨주는 값에 따라 결과가 달라짐 
		double result1 = myCalc.areaRectangle(10);
		
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
		
		//모든 클래스는 내부의 코드를 외부에 노출시키지 않음 
		//동일한 기능인데 매개변수에 따라 값이 달라짐!!
		
		
	}

}
