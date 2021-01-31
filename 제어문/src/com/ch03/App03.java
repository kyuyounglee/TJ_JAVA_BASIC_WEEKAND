package com.ch03;

/**
 * 형변환 예제
 * @author 이규영
 *
 */
public class App03 {

	// 시작프로그램
	public static void main(String[] args) {
		// 자동형변환(auto casting)
		// 동일한 데이터타입 또는 작은타입에서 큰타입으로
		int number = 10;
		long number2 = number;
		
		// 형변환을 해 줘야 하는경우
		// 큰타입에서 -> 작은타입으로...
		double pi = 3.14;
		int pi2 = (int)pi;
		System.out.println(pi);
		System.out.println(pi2);
		//  퀴즈....
		//  pi 의 값을 정수부분과 소수부분으로 나눠서(연산을 통해)
		// 각각 타입에 맞는 변수에 저장하고 출력하세요
		// 3.14 - 3 = 0.14 
		
		double pi3 = pi - pi2; // 3.14 - 3
		System.out.println(pi3);
		
		 String str =  String.format("반갑습니다 %s 님", "이규영");
		 System.out.println(str);
		 str = String.format("%.3f", pi3);
		 System.out.println(str);
		 str = String.format("%5.3f", pi3);
		 System.out.println(str);
		 str = String.format("%-5.3f", pi3);
		 System.out.println(str);
				
		
	}

}
