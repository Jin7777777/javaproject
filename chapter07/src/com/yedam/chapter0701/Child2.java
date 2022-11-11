package com.yedam.chapter0701;

import com.yedam.chapter07.Parent;
//다른 패키지에서 상속받음
public class Child2 extends Parent {
	
	//필드
	
	
	//생성자
	
	
	//메소드
	void getInfo() {
		System.out.println(firstName + lastName + bloodType);// + age); //다른 패키지에 있어도 부모 필드를 가져올 수 있는데 다른 패키지에 있는 default는 안됨
	}
	
}
