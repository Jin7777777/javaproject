package com.yedam.java.ch0604;

public class Car {
	//필드
	int gas;
	//생성자
	
	//메소드
	void setGas(int gas) { //외부에서 가스를 입력받음
		this.gas = gas;
	}
	boolean isLeftGas() {//현재 남은 가스의 잔량을 확인하는 것
		if(this.gas == 0){
			System.out.println("gas가 없습니다");
			return false; //return을 만나면 그냥 끝 어디서든 return을 만나면 거기서 끝 그래서 if문이 return을 만나서 끝나기 때문에 ifelse로 묶을 필요가 없음
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(this.isLeftGas()) { //this.gas>0 대신 isLeftGas()사용 인스턴스 생성없이 내부의 메서드를 불러올수 있음.  //isLeftGas는 while문 계속해서 gas를 체크함 기존의 this.gas랑 결론적으로 같음.
				System.out.println("달립니다. (gas 잔량 : "+ this.gas+")");
				this.gas--;
			}else {
				System.out.println("멈춥니다. (gas 잔량 : " +this.gas+")");
				return;  //return을 사용했지만 돌려주는 값없음 그냥 중지시키는 역할
				//System.out.println("종료합니다."); //Unreachable code return구문 뒤에는 실행되지 않기 때문에 뜨는 오류임
			}
		}
	}
}
