package com.java.constant;

public class App01 {

	// 상수 - 변하지 않은수
	static final int MAXINPUTNUMBER = 10;
	
	public static void main(String[] args) {
		// 상수형 변수 ( const)
		// 변수 변하는수..
		int a = 10;		// 변수		
		a = 20;				
		// 상수형 변수는  onyl 대문자로 표기 - 약속
		
		int[] ary = new int[MAXINPUTNUMBER];
		
		
		App02 b = new App02();
		b.greeting();
		b.greeting("이규영");

	}

}
