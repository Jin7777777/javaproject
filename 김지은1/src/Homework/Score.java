package Homework;

public class Score {
	public static void main(String[] args) {
		Movie movie = new Movie("추격자", 7, 5, "12");
		perfomance performance = new perfomance("지킬앤하이드", 9, 10, "46");
		
		movie.getInformation();
		System.out.println("==========================");
		performance.getInformation();
	}
}
