package com.yedam.chapter0701;

public class Application {
	public static void main(String[] args) {
		/*
		 * Child child = new Child(); //인스턴스 만들어주기
		 * 
		 * //자식 클래스 고유 필드 child.lastName = "paul"; child.age = 20;
		 * 
		 * //부모 클래스 필드 System.out.println(child.firstName + child.lastName);
		 * 
		 * //System.out.println(child.job);
		 * 
		 * //부모 -> 여러명의 자식 //가능 //자식 -> 여러명의 부모 //불가능
		 * 
		 * DmbCellPhone dmb = new DmbCellPhone("고아라폰", "화이트", 10);
		 * 
		 * //부모 클래스 필드 System.out.println("모델 : " + dmb.model);
		 * System.out.println("색상 : " + dmb.color);
		 * 
		 * //자식 클래스 필드 System.out.println("채널 : " + dmb.channel);
		 * 
		 * //부모 클래스 메소드 사용 dmb.powerOn(); dmb.sendVoice("안녕하세요");
		 * dmb.receiveVoice("안녕하세요 전 김둘리입니다."); dmb.powerOff();
		 * 
		 * //자식 클래스 메소드 사용 dmb.turnOnDmb();
		 * 
		 * // Member member = new Member("고길동", "123123-456456", 1);
		 * 
		 * //부모 객체의 필드 사용 System.out.println("name : " + member.name);
		 * System.out.println("ssn : " + member.ssn); //자식 객체의 필드 사용
		 * System.out.println("memberNo : " + member.stdNo);
		 * 
		 * //Override
		 * 
		 * 
		 * Child cd = new Child(); cd.method1(); cd.method2(); cd.method3();
		 * 
		 * //Override Compute com = new Compute();
		 * 
		 * double result = com.areaCircle(10); System.out.println("result : " + result);
		 * 
		 * //AirPlane override super
		 * 
		 * SupersonicAirPlane sa = new SupersonicAirPlane();
		 * 
		 * sa.takeOff();
		 * 
		 * sa.fly();
		 * 
		 * sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		 * 
		 * sa.fly(); //override 된 fly
		 * 
		 * sa.flyMode = SupersonicAirPlane.NORMAL;
		 * 
		 * sa.fly(); //부모 메소드의 fly
		 * 
		 * sa.land(); }
		 */
		Child chd = new Child();
		// Parent parent = new Child();
		//자동타입변환
		// 부모 클래스에 있ㄴ느 필드, 메소드를 사용을 하되 만약 자식 클래스에 오버라이딩이 되어 있는
		// 메소드가 존재한다면 부모클래스에 정의된 메소드를 사용하지 않고 자식 클래스에 잇는 메소드를 사용
		//부모가 자식클래스에서 가져와서 씀 override된 애들만.
		Parent parent = chd;

		parent.method1();
		parent.method2();
		//parent.method3();
		
	

	}

}
