package com.yedam.java.ch0601;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone iphone14Pro = new SmartPhone("iphone14Pro"); //변수이름해주고 //new 클래스를 이용해서 객체를 만들때 사용하는 연산자 뒤에것은 생성자 new+생성자를 해야 객체를 만들수 있음.
		
		//이제 정보를 넣어줘야함
		iphone14Pro.maker = "Apple"; //.접근 연산자 .쓰면 내부에 있는 필드에 접근
		iphone14Pro.name = "iphone14Pro";
		iphone14Pro.price = 1000000;
		
		//정보가 잘 들어갔나 확인
		System.out.println("나의 핸드폰은 " + iphone14Pro.maker + "입니다.");
		System.out.println("나의 핸드폰 기종은 "+iphone14Pro.name+"입니다.");
		
		//기능 실행
		iphone14Pro.call();
		iphone14Pro.hangup();
		
		System.out.println("=====================");
		
		//클래스타입
		SmartPhone zflip4 = new SmartPhone("zflip4"); //-> 얘는 다른것 //중요!! 어렵!! 생성자 데이터를 넣을수도 있고 안넣을수도 있음  class에 생성자를 안만들어줘도 되는 이유는 자바가 알아서 만듬
		
		
		System.out.println("객체 생성시 생성자에 초기값을 안 넣어준 경우"); //null이라고 뜸
		System.out.println(zflip4.name);
		
		zflip4.name = "zflip4";
		zflip4.maker = "samsung";
		zflip4.price = 900000;
		
		System.out.println("나의 핸드폰은 " + zflip4.maker + "입니다.");
		System.out.println("나의 핸드폰 기종은 "+zflip4.name+"입니다.");
		
		zflip4.call();
		zflip4.hangup();
		
		System.out.println(iphone14Pro);
		System.out.println(zflip4);
				
	}

}
