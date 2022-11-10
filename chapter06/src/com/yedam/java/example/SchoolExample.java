package com.yedam.java.example;

import java.util.Scanner;

public class SchoolExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 학생 수 입력받기
		System.out.println("학생 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		Student[] stdAry = new Student[count];

		for (int i = 0; i < stdAry.length; i++) {

			// 인스턴스만들기
			Student student = new Student();

			// 1.학생이름 입력
			System.out.println("학생 이름 >");
			String sName = sc.nextLine();
			student.setsName(sName);

			// 2.학번입력
			System.out.println("학번 > ");
			String sNo = sc.nextLine();
			student.setsNo(sNo);

			// 3.국어성적입력
			System.out.println("국어 성적 > ");
			int kor = Integer.parseInt(sc.nextLine());
			student.setKor(kor);

			// 4.수학성적입력
			System.out.println("수학 성적 > ");
			int math = Integer.parseInt(sc.nextLine());
			student.setMath(math);

			// 5.영어성적입력
			System.out.println("영어 성적 > ");
			int eng = Integer.parseInt(sc.nextLine());
			student.setEng(eng);

			// 배열에 student 저장하기
			stdAry[i] = student;
		}

		for (int i = 0; i < stdAry.length; i++) {
			stdAry[i].getInfo();
			/*
			for (int i = 0; i < stdAry.length; i++) {
				System.out.println("학생 이름 > " + stdAry[i].getsName());
			}*/
		}
	}
}
