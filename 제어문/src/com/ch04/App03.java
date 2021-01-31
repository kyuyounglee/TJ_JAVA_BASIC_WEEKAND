package com.ch04;
// 논리연산자 응용
public class App03 {

	public static void main(String[] args) {
		int a = 0, b = 20;
		System.out.println(a = 10 );
		System.out.println(a);
		System.out.println((a = 20) > 0 );
		System.out.println(a);
		System.out.println("-----------------------");
		System.out.println(a > b && (a = 30) < 0 );
		System.out.println(a);
		// &&  로 묶인 조건문들의 집합중에   false 조건이 나오면 나머지 조건은
		// 수행 안한다...
		
		// || 로 묶인 조건문들의 집합중에   true 조건이 나오면 나머지 조건은
		// 수행 안한다...
		
		
		String name = "홍길동";
		name.charAt(0);
		
		name = null;
		if(name !=null && name.length() > 0)
			name.charAt(0);
		

	}

}
