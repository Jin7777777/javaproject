package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; // mathScores의 배열 크기 뒤에는 그 mathScores의 배열인 mathScore의 크기
		// 첫번째 : 변수 사용한 것
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			int[] mathScore = mathScores[i]; // 임시로 주는 이름

			for (int j = 0; j < mathScore.length; j++) {
				System.out.println("\t mathScore[" + j + "] : " + mathScore[j]);
			}
		}
		System.out.println("----------------------------------------------------");
		// 두번째 : 변수 사용 안하는 것
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");

			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("\t mathScores[" + i + "][" + j + "] : " + mathScores[i][j]);

			}

		}
		System.out.println("----------------------------------------------------");
		int[][] scoreList = { { 86, 65 }, // 배열임
				{ 58, 95, 73 } };

		for (int i = 0; i < scoreList.length; i++) {
			System.out.println(i + "번째 학생 성적 =====");
			for (int j = 0; j < scoreList[i].length; j++) { // 항상 길이는 동적으로 움직일 수 있게 지정!! 각 배열의 길이를 가져올수 있도록
				System.out.println(scoreList[i][j] + "");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------------");

		int[][] englishScore = new int[2][]; // 앞의 값은 필수값 내부의 크기는 일단 모르겠고 내 크기만 정해주면 됨
		englishScore[0] = new int[3];
		englishScore[1] = new int[2];
		for (int i = 0; i < englishScore.length; i++) {
			for (int j = 0; j < englishScore[i].length; j++) {
				System.out.println("englishScore[" + i + "][" + j + "] : " + englishScore[i][j]);
			}
		}

		System.out.println("----------------------------------------------------");

		String[] strArray = new String[3]; // 책에 그림그려서 설명!!
		strArray[0] = "Java"; // 힙영역에 값을 줌
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[1] == strArray[2]);
		System.out.println(strArray[1].equals(strArray[2]));

		System.out.println();
		System.out.println("----------------------------------------------------");
		// for문으로 배열 복사
		int[] oldIntAry = { 1, 2, 3 };
		int[] newIntAry = new int[5];
		for (int i = 0; i < oldIntAry.length; i++) { // old -3 new-5인데 oldIntAry가 5라는 값을 처리 못함 0,1,2,3,4의 3,4를 인식못함 그래서
														// 배열을 복사할때는 크기가 작은 값을 기준으로 들고와야함
			newIntAry[i] = oldIntAry[i];
		}
		for (int i = 0; i < newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}
		System.out.println("----------------------------------------------------");
		
		//System.arraycopy()
		String[] oldStrAry = {"java", "array", "copy"};
		String[] newStrAry = new String[5];
		System.arraycopy(oldStrAry, 0, newStrAry, 2, 3); //다차원배열에도 할수있지만 방법이 약간 다름 class에 대해서 더 배워야함
		
		for(int i=0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}
		
		System.out.println("----------------------------------------------------");
		//향상된 for문
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0 ;
		//int index = -1;
		for(int score : scores) { //값을 담을 임시변수 : 가져올 배열 for문이 알아서 첫번째 인덱스부터 순차적으로 가져와서 score에 담아줌 95담았다가 71담았다가...함 인덱스에 대한 정보를 써야할때는 이거 쓰면 안됨 쓸려면 인덱스변수를 만들어주고 사용해야함.
			sum += score;
			//System.out.println("인덱스 : " + ++index);
		}
		System.out.println("점수 총합 : " + sum);
		double avg = (double) sum/scores.length;
		System.out.println("평균 : " + avg);
	} 
}
