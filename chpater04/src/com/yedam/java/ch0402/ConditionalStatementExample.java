package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// for문

		// 1부터 10까지 출력 변수선언 따로 필요없음 그냥 for문 안에서
		// 한번 실행후 조건식으로 가는게 아니고 증감식에 갔다가 증감하고 나서 조건식으로
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		int x = 1;
		for (; x <= 100; x += 15) {
			System.out.println("출력");
		}
		System.out.println("x : " + x);

		for (int i = 0, j = 100; i <= 50 && j >= 50; i++, j--) {
		}

		// 1~100까지 출력, 동시에 1~100까지 합을 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum = sum + i; // sum += i;

		}
		System.out.println("1~100까지의 합계 : " + sum);

		// float 타입 카운터 변수
		for (float f = 0.1f; f <= 1.0f; f += 0.1f) {
			System.out.println(f);
		}

		// 구구단을 2~9단까지 출력
		for (int i = 2; i <= 9; i++) {
			// i = 0;
			System.out.println("*** " + i + " 단 ***");
			for (int j = 1; j <= 9; j++) {
				// i =0, j=0;
				// , j=1;...
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}

		// while문

		// 1 ~ 10 까지 출력
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		count = 0;
		while (count <= 9) {
			count++;
			System.out.println(count);
			// count <=10을하면 11까지 출력됨 경계값을 잘 생각해야함
		}

		// 1부터 100까지 출력, 1부터 100까지 합을 출력
		sum = 0;
		count = 1;
		while (count <= 100) {
			System.out.println(count);
			sum += count;
			count++;
		}
		System.out.println("1~" + (count - 1) + "까지 합 : " + sum);
		// 101이 들어가야 100보다 큰값이라서 끝이나기 때문에 101!!

		// 주사위 두개를 굴립니다. 합이 3이 되는 경우까지 계속 굴리는 경우

		int index = 1;

		while (index != 1) {
			System.out.println("while 반복문이" + index + "번 실행됩니다.");
		}

		do {
			System.out.println("while 반복문이" + index + "번 실행됩니다.");
		} while (index != 1);

		// break로 while문 종료
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6)
				break;
		}

		// 이중 for문에서 break문 사용 //for문사용시 어디서 break할건지 잘 생각 만약 필요하다면 바깥쪽 for문에 이름을 붙여서
		// 사용도 가능
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break;
				}
			}
			System.out.println("1) 안쪽 for문 종료");

		}
		System.out.println("2) 바깥쪽 for문 종료");

		System.out.println("============================");

		// continue를 사용한 for문
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) continue; //continue는 건너뛴다 i%2 !=0이랑 같은거임
			System.out.println(i);
	
		}

	}

}
