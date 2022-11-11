package Homework;

public class Human {
	public String name;
	public int height;
	public int weight;
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void getInformation() {
		System.out.println(name + height + weight);
	}
}
