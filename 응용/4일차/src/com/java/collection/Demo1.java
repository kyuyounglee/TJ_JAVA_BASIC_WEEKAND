package com.java.collection;

import java.util.Arrays;
import java.util.Collection;

public class Demo1 {

	public static void main(String[] args) {
		Collection<String> list 
		= Arrays.asList("다람쥐","개구리","나비");
		
		System.out.println(list); // 객체 자체를 print하면 내부적으로 그 객체의
		//  toString() 메소드를 호출한다
		
		// foreach - 향상된 for문
		for (String s : list) {
			System.out.print(s+"-");
		}
		System.out.println();
		for (String s : list) {
			System.out.print(s+"+");
		}
		System.out.println();
		for (String s : list) {
			System.out.print(s+"=");
		}
	}

}
