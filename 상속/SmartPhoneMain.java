package com.java.inheritance;

public class SmartPhoneMain {

	public static void main(String[] args) {
		Phone p = new Phone("전화기","화이트","현대");
		p.showData();
		
		System.out.println(p.toString());
		System.out.println(p); // 객체 자체를 출력하면 기본적으로 toString() 메소드를 호출한다.

	}

}
