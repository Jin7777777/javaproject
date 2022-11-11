package com.yedam.chapter0701;

public class Member extends People {
	//오류가 처음 생기는 이유는 부모클래스의 생성자를 만들어라
	
	public int stdNo;
	
	public Member(String name, String ssn, int stdNo) {
		super(name, ssn); //super 부모를 부름
		this.stdNo = stdNo;
	}
}
