package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		// "사슴", "호랑이", "바다표범", "곰" 
		// 적당한 형식으로 담아서 표현해 보자
		List<String> list = new ArrayList<>();
		list.add("사슴");
		list.add("호랑이");
		list.add("바다표범");
		list.add("곰");		
		System.out.println(list);
		for (String s : list) {
			System.out.println(s);
		}
		list.add(1,"앵무새");
		System.out.println(list);
		
		String[] strs = {"사슴", "호랑이", "바다표범", "곰" };
		//List<String> list2 = Arrays.asList("사슴", "호랑이", "바다표범", "곰" );
		List<String> list2 = Arrays.asList(strs);
		
		list2.set(1,"앵무새");		
		System.out.println(list2);
		
		

	}

}
