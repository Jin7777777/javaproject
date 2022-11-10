package com.yedam.java.ch0601;

public class Person {

	final String nation ="korea"; //모든 nation은 korea .고. .정.
	final String ssn; //생성자를 통해서 넣은 최초에 넣은 데이터가 고정값이 됨
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn; //final로 고정 되었기 때문에 수정불가능
		this.name = name; //수정가능 
	}
}
