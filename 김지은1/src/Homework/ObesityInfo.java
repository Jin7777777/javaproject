package Homework;

public class ObesityInfo extends StandardWeightInfo {
	public double obesity;
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	public void getInformation() {
		if(obesity >25) {
		System.out.println(name +"님의 "+ "신장"+height+ "," + "몸무게"+weight + getObesity() );
		}else {
			System.out.println(name +"님의 "+ "신장"+height+ ", " + "몸무게"+weight +", " +"비만입니다." );
		}
	}
	
	public double getObesity() {
		obesity = (weight - getStandardWeight() )/getStandardWeight()*100;
		return obesity;
	}
}
