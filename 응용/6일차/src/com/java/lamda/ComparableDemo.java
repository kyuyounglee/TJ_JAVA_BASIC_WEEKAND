package com.java.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		// Rectangle 배열을 만들어서 객체 3개를 저장
		Rectangle[] rec = {
				new Rectangle(5, 5),new Rectangle(3, 5)	
				,new Rectangle(2, 10)
		};				
		System.out.println(Arrays.asList(rec));
		
		// 정렬		
		Arrays.sort(rec);		
		System.out.println(Arrays.asList(rec));
		Arrays.sort(rec
				, (Comparator<? super Rectangle>) (Rectangle x, Rectangle y)->
			x.findSize() - y.findSize()			
		);		
		System.out.println(Arrays.asList(rec));
		
		
		
		
		// 2번째 예제
		String[] strs = {
				"로마에 가면 로마법을 따르라"
				,"시간은 금이다","펜은 칼보다 강하다"
		};
		// 익명 익명방식
		Arrays.sort(strs, new Comparator<String>() {

			@Override
			public int compare(String x, String y) {				
				return x.length() - y.length();
			}
		} );
		
		// 람다 방식
		Arrays.sort(strs, (x,y)-> x.length() - y.length());
		
		
		for (String s : strs) {
			System.out.println(s);
		}
		

	}
}

// 외부클래스 outer class
class Rectangle implements Comparable<Rectangle>{
	private int width,height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int findArea() {		
		return width * height;
	}
	
	public int findSize() {
		return width + height; 
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public int compareTo(Rectangle o) {		
		return findArea() - o.findArea();
	}	
	
}
