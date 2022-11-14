package Homework;

public abstract class Culture {
	public String name;// 제목
	public int diNum;// 참여 감독 수
	public int acNum;// 참여 배우 수
	public int attenNum; // 관객 수
	public int totalScore; //총점
	public String score;//평점
	//생성자
	public Culture(String name,int diNum ,int acNum ) {
		this.name = name;
		this.diNum = diNum;
		this.acNum = acNum;
	}
	
	public int getTotalScore() {
		return totalScore;
	}

	//메소드
	//1-1
	public void setTotalScore(int score) {
		this.attenNum++;
		this.totalScore += score;
		this.score = String.valueOf(this.totalScore / this.attenNum);
	} 
	//1-2
	public String getScore() {
		if (Integer.parseInt(this.score) == 1) {
			return "☆";
		} else if (Integer.parseInt(this.score) == 2) {
			return "☆☆";
		} else if (Integer.parseInt(this.score) == 3) {
			return "☆☆☆";
		} else if (Integer.parseInt(this.score) == 4) {
			return "☆☆☆☆";
		} else if (Integer.parseInt(this.score) == 5) {
			return "☆☆☆☆☆";
		}
		return ""; 
	}
	public void setScore(String score) {
		this.score = score;
	}

	//1-3
	public abstract void getInformation();
		
	}

