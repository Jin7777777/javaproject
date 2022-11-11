package com.yedam.chapter0702;

public class Application3 {
//실행코드
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method - child 변환 성공");
		}else {
			System.out.println("변환 실패");
		}
	} 
	
	public static void  method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method2(parentB);
	
	
		
		
		
		//매개변수를 통한 자동 타입 변환
		Driver driver = new Driver(); //드라이브 메소드 사용하기 위해서 정의함
		
		//bus, taxi는 vehicle이 부모클래스
		Bus bus = new Bus(); 
		Taxi taxi = new Taxi();
		
		//driver.drive(Vehicle vehicle = new Bus()); 
		//bus라는 매개변수가 Driver클래스의 vehicle매개변수를 가르킴 부모클래스에 자식을 넣음  //부모꺼에 매개변수로 들어감 
		//vehicle.run();을 실행하면 bus에 있는 run을 실행하게 됨. 자동타입변환!! 부모타입객체 자식생성자. 자식클래스에서 오버라이딩된게 실행됨
		driver.drive(bus); 
		
		
		driver.drive(taxi);
		
		
		
		//Animal
		
		Animal animal = null;//객체가 안만들어진 상태 //부모
		
		animal = new Cat(); //자동타입변환
		
		animal.speak();
		
		animal = new Dog();//자동타입변환 
		
		animal.speak(); //강아지 speak 메소드를 사용하게 되는것!
		
		
		//parent
		Parent parent =  new Child();
		
		parent.field = "parent";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "child";
		//parent.method3();
		
		//Casting->강제 타입 변환
		Child child =(Child)parent;
		child.filed2 = "parent";
		child.method3();
		
		child.field = "parent";
				
		
	}
}
