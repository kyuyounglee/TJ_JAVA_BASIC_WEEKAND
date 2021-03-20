package com.java.collection;

public class Compare {

	public static void main(String[] args) {
		double a = 10;
		double b = 20;		
		
		
		String name1 = "abc";  
		String name2 = "abc";		
		String name3 = new String("abc");
		String name4 = new String("abc");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println("name1과 name2의 비교");
		System.out.println(name1.equals(name2));
		System.out.println("name3과 name4의 비교");
		System.out.println(name3.equals(name4));
	}

}
