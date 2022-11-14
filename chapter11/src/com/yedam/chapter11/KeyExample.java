package com.yedam.chapter11;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//HashMap -> Key, Value 형태로 데이터를 저장 
		//      내가 줘야하는 열쇠(클래스 타입), 뒤에 있는 value를 나에게 줌
		HashMap<Key, String> hashmap = new HashMap<>();
		//넣는다 HashMap이라는 객체에 열쇠, 데이터 열쇠를 주면 "홍길동"이라는 데이터를 줘야함
		//new Key(1) -> 1
		hashmap.put(new Key(1), "홍길동");
		
		
		//new Key(1) -> 2
		//내가 위에 만든 열쇠로 물건 꺼내오기 
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		//null로 나옴 지금 new Key(1) 두개는 다르다는 이야기임 
		
		Key key = new Key(1);
		
		System.out.println(key.toString());
	} 
}
