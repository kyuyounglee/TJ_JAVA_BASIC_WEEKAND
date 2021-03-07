package com.java.lang;

public class App01 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		if(str1 == str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = new String("abc");
		str2 = new String("abc");
		//if(str1 == str2) {
		if(str1.equals(str2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		System.out.println(str1);
		System.out.println(str2);
		
		int a = 10;
		int b = 10;
		if(a == b ) {
			System.out.println("두 정수는 같다");
		}else {
			System.out.println("두 정수는 다르다");
		}
		
		// 기본변수가 아닌 객체로 이루어진 참조형은
		// 그럼참조형은 뭐지?  객체는 다 참조형의 값의 비교는
		// 객체 자체가아니라. 객체가 표현하고자 하는 대상을 비교해야한다.
		
		
		

	}

}
