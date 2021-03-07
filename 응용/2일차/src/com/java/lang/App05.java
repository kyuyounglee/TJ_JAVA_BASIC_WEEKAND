package com.java.lang;

import java.util.Arrays;

/**
 * 매개변수로 전달이 이루어질때는 항상 복사가 이루어진다.(copy) 
 * 참조형 변수는 매개변수로 전달시 원본이 변경될수 있으며,
 * clone 이 아니라 단순히 = (대입연산자를 이용하면 ) 값이 복사되는게 아니라
 * 동일한 데이터가 된다
 */
public class App05 {

	public static void main(String[] args) {
		int data = 10;
		System.out.println("메소드 호출전 data = " + data);
		change(data);
		System.out.println("메소드 호출후 data = " + data);
		
		System.out.println("###########################");
		
		int[] ary = {1,2,3};
		System.out.println("메소드 호출전 data = " + show(ary));
		change(ary);
		System.out.println("메소드 호출후 data = " + show(ary));
		
		System.out.println("###########################");
		
		Student st = new Student("abc", 50);
		System.out.println(st);
		change(st);
		System.out.println(st);
		
		
	}
	
	static void change(int data) {
		data = 100;
		System.out.println("메소드안에서 data = " + data);
	}
	// overload
	static void change(int[] ary) {
		ary[0] = 1500;
	}
	
	static String show(int[] ary) {
		String str = "";
		for (int i : ary) {
			str += i+", ";
		}
		return str;
	}
	// overload
	static void change(Student s) {
		s.name = "";
		s.age = 0;
	}

}
