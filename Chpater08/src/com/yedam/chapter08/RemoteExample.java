package com.yedam.chapter08;

public class RemoteExample {
	public static void main(String[] args) {
		RemoteControl rc = new Television(); // 인터페이스는 만들어져 있으니까 새로운 기능을 계속 끼워넣을 수 있음
		
		//rc= new Audio(); //객체가 새롭게 변경 이미 만들어 져있으니까 
		
		rc.turnOn();
		rc.setVolume(11);
		rc.turnOff();
		
		Search search = new Television();//search에서 오버라이딩 된 메소드만 사용
		//각각의 인터페이스를 불러와서 기능을 사용할 수 있음.
		search.search("google.com");

		
		System.out.println("=====================");
		
		//Television tv = new Television(); //얘는 힙영역에 객체가 또 생겨버림
		//rc = new Television();
	    // rc.turnOn();
		//rc.setVolume(11);
		//rc.turnOff();
		
		//게시판 쓰기, 일기, 리스트 조회 같은 기능!!에 좋은 인터페이스
		
		/*
		 public void temp(RemoteControl re){
		 이 메소드 하나로 5가지 가능
		 }
		 
		  public void temp(Televiseon tv){ 자기 자신만 활용
		  tv클래스만 가질수 있는 기능 5가지 기능을 하고싶으면 객체 5개 만들어 줘야함
		  }
		   public void temp(audio tv){
		  
		  }
		  .....
		 */
		
		//추상클래스 Vs 인터페이스
		//추상클래스 (extends) -> 필드 , 생성자, 메소드
		//인터페이스 (implements) -> 상수, 추상 메소드
		//부모의 것 상속받으면서 오버라이딩하고 싶으면 추상클래스
		//인터페이스는 그냥 기능 구현쓰 ->생성자 없음 구현클래스를 바로 객체가 만들어씀 부모클래스 필요없뗘!!
		//그냥 차이를 알고 쓰고 싶은거 골라서 사용하면 된당........
		//이번 시간은 다중 인터페이스 하기!!
		
		
	}
}
