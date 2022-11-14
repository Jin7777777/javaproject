package com.yedam.chapter11;

public class Exam {
	public static void main(String[] args) {
//		1)문자열 뒤집기
//		-입력되는 문자열을 뒤집어서 출력
//		ex) input : abc, output : cba
	//
//		2) 문자열 개수 세기
//		-아스키 코드 이용
//		-입력되는 문자열에서 알파벳과 숫자의 갯수를 구하기
//		ex) input : 1a2v4b, ouput : 숫자 3개, 영어 3개
		
		//1)문자열 뒤집기
		String s = "ABCDEFG";
		String sR = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			sR += s.charAt(i);
		}System.out.println(sR);
		
		
		//2)문자열 개수 세기
		byte[] bytes2 = null; 
		String str = "LOVE486";
		bytes2 = str.getBytes();
		System.out.println(bytes2.length);
		for (int i =0; i <str.length(); i++) {
			if(i<57) {
				System.out.println("영어는 : " + i + "개 입니다.");
			}
		}
	}

	
}
