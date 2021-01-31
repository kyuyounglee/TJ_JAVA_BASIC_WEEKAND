package com.ch05;
/**
 * swap  문제
 * 두개의 수를 입력받아서.
 * 큰 순서대로 출력하시오(오름차순)
 * a = 10  b = 20
 * 출력은
 * 변수  a, b를 출력
 * 20 10 
 * 만약 a가 작은 값이면 두 수를  swap  한다* 
 *
 */
public class App11 {

	public static void main(String[] args) {
		int a= 10 , b = 20;
		// 두수를 교환하는 로직
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a);
		System.out.println(b);
				
	}

}
