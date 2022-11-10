package com.yedam.java.ch0601;

public class Student {
  	/*
	//필드 //학생의 이름 / 학교 이름/ 학번 /학년 / 국어,영어,수학성적
	String sSchool;
	String sname;
	int sNo;
	int sYear;
	int kor;
	int eng;
	int mat;
	
	//생성자 //생성자를 통해서 모든 데이터를 입력
	public Student(String sSchool,String sname,int sNo,
			int sYear,int kor,int eng, int mat ) {
		this.sSchool =sSchool; //내가 매개변수(생성자를 통해서 들어온 데이터)를 위에 내가 정의해 놓은 필드값을 불러와서 넣어주기 위해서 this사용
		getInfo();//이런식으로 메소드를 불러와서 쓸 수도 있음.
		
	}
	
	//메소드 //getInfo() 학생의 내용을 출력할 수 있는 기능
	public void getInfo() {
		System.out.println("내가 다니는 학교  : " + sSchool);
	}
*/
	//getter setter 필드가 다 private으로 바껴야 함 
	//필드
	private String sSchool;
	private String sname;
	private int sNo;
	private int sYear;
	private int kor;
	private int eng;
	private int mat;
	
	//생성자
	public String getsSchool() {
		return sSchool;
	}
	public String getSname() {
		return sname;
	}
	public int getsNo() {
		return sNo;
	}
	public int getsYear() {
		return sYear;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMat() {
		return mat;
	}
	
	public void setsSchool(String sSchool) {
		this.sSchool = sSchool;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public void setsYear(int sYear) {
		this.sYear = sYear;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

}
