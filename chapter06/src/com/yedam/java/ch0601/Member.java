package com.yedam.java.ch0601;

public class Member {

	// Getter Setter

	// 필드
	private String id;
	private String tel; //우클릭 source->generate getter setter들어가면 자동으로 만들수 있땅..
	private int age;

	// 생성자

	// 메소드

	// private String id;
	// 기본 setter getter
	public String getId() { //데이터를 가공해서 외부에 전달할때 , 그냥 반환해도 됨.
		// 원본 데이터 (yedam)
		//yedam님 입니다. 
		id += "님 입니다.";
		return id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) { //
		if (age <= 0) { //데이터의 무결성때문에 값을 저장시키지 않고 return 시킴.
			System.out.println("0보다 작은 나이가 저장되었습니다. 다시 확인하세요");
			return;
		} else {
			this.age = age;
		}
	}
}
