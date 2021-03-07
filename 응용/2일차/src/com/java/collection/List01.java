package com.java.collection;

import java.util.ArrayList;

public class List01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);list.add(11);list.add(12);
		list.add(50);
		System.out.println(list);
//		for (Integer data : list) {
//			System.out.println(data);
//		}
		list.remove(1);
		System.out.println(list);
		list.add(1,11);
		System.out.println(list);
		if(list.contains(50)) {
			System.out.println("50이 있습니다.");
		}
		System.out.println(list.indexOf(50));

	}

}
