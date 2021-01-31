package com.ch04;
/**
 * 비교연산자
 * 논리연산자
 * @author 이규영
 *
 */
public class App02 {

	public static void main(String[] args) {
		// 비교교연산자
		 int a = 10, b = 20;
		 System.out.println(a > b);  // false
		 System.out.println(a < b);  // true
		 System.out.println(a == b); // false
		 System.out.println(a != b); // true
		 
		 //논리연산자
		 System.out.println(a > b || a == 10);
	}

}
