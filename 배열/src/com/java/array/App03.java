package com.java.array;

import java.util.Iterator;

public class App03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// null의 개념을 이해하자..
		// 일반변수는 초기화를 안하면.. 쓰레기 값이 있음
		// 객체는 초기화 안되면... 그 상태는 null
		
		// 배열은 초기화를 안하면 타입에 맞는 기본 값이 있음		
		int[] ary = new int[5]; // 0으로 초기화	
		
		// 초기화 지정
		int[] ary2 = {1,2,3,4}; 
		// 3번인덱스 해당하는 요소의 값
		int[] ary3 = new int[] {1,2,3,4,5};
		// 2번 인덱스의 해당하느 요소의 값
		String[] names = {"홍길동","이순신","김유신"};
		// 1번 인덱스의 해당하느 요소의 값
		
		// 위의 각각의 벼열의 요소들을 출력하세요
		for (int i = 0; i < 4; i++) {
			System.out.println(ary2[i]);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(ary3[i]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(names[i]);
			
		}
		System.out.println("==================");
		System.out.println(ary2);
		System.out.println(ary2[0]);
		
	}

}
