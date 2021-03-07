package com.java.lang;

public class App02 {

	public static void main(String[] args) {
		Student st1 = new Student("홍길동",100);
		Student st2 = new Student("홍길동",100);
		if(st1 == st2) {
			System.out.println("같다");
		}
		
		if(st1.equals(st2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
