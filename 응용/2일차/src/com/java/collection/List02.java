package com.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<>();
		list.add(new Rectangle(10, 5));
		list.add(new Triangle(6));

		// √— ∏È¿˚¿ª ±∏«—¥Ÿ.
		double totlaArea = 0.0;
		for (Shape data : list) {
			totlaArea += data.area();
		}
		// √— ≥–¿Ã∏¶ ±∏«—¥Ÿ.
		double totalLength = 0.0;
		for (Shape data : list) {
			totalLength += data.length();
		}
		System.out.println(totlaArea);
		System.out.println(totalLength);
		String str = String.format("%.1f", totalLength);
		System.out.println(str);
		
		list = new LinkedList<>();
	}

}
