package com.java.exception;


public class App02 {

	public static void main(String[] args) {
		System.out.println("메인메소드 시작");
		try {
			A();
		} catch (Exception e) {
			System.out.println("메인에서 예외처리");
			e.printStackTrace();
		}
		System.out.println("메인메소드 종료");
	}
	
	static void A() throws Exception {
		System.out.println("A메소드 시작");
		try {
			B();
		} catch (Exception e) {
			System.out.println("A에서 예외처리");
			e.printStackTrace();
			throw new Exception("일단처리했음");
		}
		System.out.println("A메소드 종료");
	}
	
	static void B() throws Exception{
		System.out.println("B메소드 시작");		
		System.out.println(3/0);		
		C();
		System.out.println("B메소드 종료");
	}
	static void C() {
		System.out.println("C메소드 시작");
		System.out.println("C메소드 종료");
	}

}
