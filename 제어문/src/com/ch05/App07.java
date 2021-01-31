package com.ch05;

public class App07 {

	public static void main(String[] args) {
		int score = 0; // 초기화
		// 중첩 if 문
		if(score >=50) {
			// code A..
			if(score <= 90) {
				System.out.println("50 <= x <=90");	
				// code B..
			}
		}
		
		// 논리연산을 적용 하면  code B는 처리할수 있으나 
		// 아래의 경우  code A는 처리할수 없다. else 구문으로
		// 표현 못함
		if( score >=50 && score <= 90) {
			System.out.println("50 <= x <=90");
			// code B..
		}

	}

}
