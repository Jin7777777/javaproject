package com.yedam.chapter11;

import java.io.UnsupportedEncodingException;

public class StringExample {

	// String에 대하여

	// String a = "1";//100번지 같은 주소 참조
	// String c = "1";//100번지
	// String b = new String("1")l //200번지 ->new 연산자를 통해서 새로 객체를 만듬

	// 바이트 -> 문자열
	public static void main(String[] args) {

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		// 배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//String str2 = new String(바이트 배열, 시작점, 갯수);
		String str2 = new String(bytes, 6,4); //bytes에서 6번째에서부터 4개만 가져왕
		System.out.println(str2);
		
		//String 메소드메에소오드으 뀨유
		//1) chatAt(int index) - 특정 문자 위치를 반환
		
		String ssn = "123456-1876541";
		char sex = ssn.charAt(7); //7번째 자리 가져와!!!!!!!
		switch(sex){
			case '1': //문자열이라서 case 1하면 안되고 case '1'해줘야함
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
				
		}
		
		//문자열 비교
		//equals()
		String strVar1 = new String("자바");
		String strVar2 = "자바";
		String strVar3 = "자바";
		
		//주소를 비교
		if(strVar1 ==  strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		
		//값을 비교
		if(strVar1.equals(strVar3)) {
			System.out.println("같은 문자열 가짐");
		}else {
			System.out.println("다른 문자열 가짐");
		}
		
		//바이트 배열로 변환
		byte[] bytes2 = null; //바이트 타입 배열 만들어 주기
		String str = "안녕하세요";
		bytes2 = str.getBytes(); //->사이즈가 5인 배열 만들어짐
		System.out.println(bytes2.length);//->값이 15인데 한글은 1개 3바이트라서
		
		//byte -> String 디코딩
		//String -> byte 인코딩
		
		String str3 = new String(bytes2);
		System.out.println("bytes2 -> String" + str3);
		
		try {
			byte[] bytes3 = str.getBytes("EUC-KR");
			
			System.out.println("bytes3.length : " + bytes3.length);
			
			String str4 = new String(bytes3, "EUC-KR");
			
			System.out.println("bytes3 -> String: " + str4);
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace(); 
		} //try안에 내용이 오류가나면 catch를 실행해라
		
		
		//문자열 찾기
		String subject = "자바 프로그래밍";
		
		int index = subject.indexOf("프로그래밍");
		
		System.out.println(index);
		
		//내가 원하는 문자열이 있는지 없는지 알 수 있다
		index = subject.indexOf("a");
		
		System.out.println(index);
		
		//문자열의 문자 개수 얻기
		
		System.out.println(subject.length());
		
		//문자열 위치 변경
		
		String oldStr = "자바 프로그래밍"; // 얘가 지워진게 아니라
		String newStr = oldStr.replace("자바", "Java");
		
		//Java 프로그래밍 //얘가 새로 만들어져서 //참조하는 데이터만 달라진거
		System.out.println(newStr);
		
		//Stringbuilder 또는 buffer
		//oldStr = "자바";  //100번지
		//oldStr += "프로그래밍"; //200번지
		//oldStr += "재밌다"; //300번지
		
		
		StringBuilder sb = new StringBuilder(); //하나의 메모리만 사용해서 buffer(임시메모리) 메모리 낭비가 없음
		StringBuffer sb2 = new StringBuffer();
		
		sb2.append("외로운 날들이여 ");
		sb2.append("모두 다 ");
		sb2.append("안녕");
		
		sb.append("자바");
		sb.append("프로그래밍");
		sb.append("123");
		System.out.println(sb);
		System.out.println(sb2);
		
		//대소문자 바꾸기
		String strVal = "adkfjdjfkdjfkrtbrbgajbnad";
		String strVal2 = "FKFGNKJBEQKBRJALDOFAJ";
		
		System.out.println(strVal.toUpperCase());
		System.out.println(strVal2.toLowerCase());
		
		//trim() //문자열 앞뒤 공백삭제
		String strTrim = "      자바         ";
		System.out.println(strTrim);
		System.out.println(strTrim.trim());
		
		//substring()
		//substring(index, end)
		//index부터 end까지 자르세요.
		//substring(index)
		//index부터 끝까지 자르세요.
		
		String ssn2 = "880815-1234567";
		
		String firstNum = ssn2.substring(0,6);
		String secondNum = ssn2.substring(7);
		System.out.println(firstNum);
		System.out.println(secondNum);
				
		//Split()
		String strSplit = "1-1-1-1-1-2-3-4-5-6-9";
		
		String[] strAry = strSplit.split("-");
		
		for(String temp : strAry) { //향상된 for문 strAry의 첫번째 인덱스를 temp에 대입해서 값보여줌 배열이 끝나면 값도 끝
			System.out.println(temp);
		}
		
		//문자열 변환
		// valueOf
		//숫자나, 소수, 불리언 -> String으로 변환
		String strChng = String.valueOf(false);
		String strChng2 = String.valueOf(10);
		String strChng3 = String.valueOf(10.7);
		
		System.out.println(strChng);
		System.out.println(strChng2);
		System.out.println(strChng3);
		
		
		
		
		
	}
}
