package com.yedam.chapter11;

public class Member {
	
	public String id;
	public String id2;
	public String id3;
	public String id4;
	public String id5;
	public String id6;
	public String id7;
	
	public Member(String id) {
		this.id = id; 
	}

	@Override //객체비교하는 equals를 오버라이딩 
	public boolean equals(Object obj) {//object밑에 존재하는 모든 것을 매개변수로 사용 가능0
		//Object obj = new Member("blue");
		//자식타입에 있는 필드를 쓰기 위해서 강제타입변환해줌 (Member가 가진것을 쓰기 위해서)
		Member member = (Member) obj;//강제타입변환가능 //멤버클래스 내부의 obj만 사용가능..
		//Member member = new Member("blue");
		if(id.equals(member.id)) { //id랑 member.id 비교 동등한 객체!!
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	} 

	@Override
	public String toString() {
		return "Member [id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5 + ", id6=" + id6
				+ ", id7=" + id7 + "]";
	}

	
}

	
	
	 

