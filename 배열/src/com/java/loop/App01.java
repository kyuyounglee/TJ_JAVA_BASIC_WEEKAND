package com.java.loop;

public class App01 {

	public static void main(String[] args) {
		// 1 ~ 10까지 의 합
		int sum = 0 ;
		for (int i = 1 ; i <= 10 ; i++ ) {  // 1 ~ 10
			String str = String.format("sum = %d + %d ", sum,i);
			System.out.println(str);
			//sum += i;
			sum = sum + i;
		}
		System.out.println("1 부터 10까지의 합 = " + sum);		
	}

}
