package com.java.object;

public class StringTest1 {

	public static void main(String[] args) {
		String name1 = "hello";
		String name2 = "hello";
		System.out.println(name1);
		System.out.println(name2);

		// hashCode() 주소값을 정수형태로 반환해서 출력하는 메소드
		System.out.println("hash code = " + name1.hashCode());
		System.out.println("hash code = " + name2.hashCode());
		if (name1 == name2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

		// VS new String()

		System.out.println("==============================");
		String name3 = new String("hello");
		String name4 = new String("hello");
		System.out.println(name3);
		System.out.println(name4);

		// hashCode() 주소값을 정수형태로 반환해서 출력하는 메소드
		System.out.println("hash code = " + name3.hashCode());
		System.out.println("hash code = " + name4.hashCode());
		if (name3 == name4) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}

	}

}
