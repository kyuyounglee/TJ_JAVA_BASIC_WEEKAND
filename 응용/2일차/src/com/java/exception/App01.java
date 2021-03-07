package com.java.exception;

public class App01 {

	public static void main(String[] args) {
		
		try {
			int[] arr = {1,2,3};
			System.out.println("배열의 갯수는 : " + arr.length);
			//int data = arr[3];
			System.out.println(3/0);
			System.out.println("try문의 마지막 입니다.");
		}catch (Exception e) {}
		
		
		System.out.println("프로그램 종료");

	}

}
