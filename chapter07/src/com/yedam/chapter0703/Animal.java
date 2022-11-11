package com.yedam.chapter0703;

public abstract class Animal {
	
	
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다~");
	}
	//❗❗❗public abstract void sound();❗❗❗중요!!!
	public abstract void sound(); //미완성 설계도 //무조건 override를 해줘야한다.
	/*
	public abstract void sound();
	public abstract void sound();
	public abstract void sound();
	public abstract void sound();
	*/ //->게시판만들때 이렇게 많이 씀 다 같은 게시판인데 override해서 다른 기능


}
