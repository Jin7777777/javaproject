package com.yedam.chapter0702;

	
public class Application4 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		//c -> b 상속관계
		//b -> c 상속관계
		//c -> b -> a 상속관계
		
		A a1 = b;
		A a2 = c;
	}
}
