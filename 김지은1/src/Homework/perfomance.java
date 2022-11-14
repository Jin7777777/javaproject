package Homework;

public class perfomance extends Culture{
	

		// 필드
		public String genre;
		
		//생성자
		public perfomance(String name, int diNum, int acNum, String genre) {
			super(name, diNum, acNum);
			this.name = name;
			this.diNum = diNum;
			this.acNum = acNum;
			this.genre = genre;
		}
		// 메소드
		@Override
		public void getInformation() {
			System.out.println("영화제목 : " + name);
			System.out.println("참여 감독 수 : " + diNum);
			System.out.println("참여 배우 수 : " + acNum);
			System.out.println("관객수 : " + attenNum);
			System.out.println("평점 : " + score);
			System.out.println("총점 : " + getTotalScore());
		}
}
