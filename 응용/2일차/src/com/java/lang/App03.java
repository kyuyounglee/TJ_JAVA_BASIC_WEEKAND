package com.java.lang;

public class App03 {

	public static void main(String[] args) {
		Student st1 = new Student("홍길동",100);
		Student st2 = new Student("이순신", 150);
		
		System.out.println(st1); // toString()
		System.out.println(st2);
		
		try {
			// 원래 의도는 값을 복사
			st1 = (Student) st2.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}  		
		System.out.println(st1); // toString()
		System.out.println(st2);
		
		st1.name = "강감찬";
		System.out.println(st1);
		System.out.println(st2);
	}

}
