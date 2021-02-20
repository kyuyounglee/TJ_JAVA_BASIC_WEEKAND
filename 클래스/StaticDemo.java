package com.java.object;

public class StaticDemo {

	public static void main(String[] args) {
		// °´Ã¼ »ý¼º
		StaticTest1 st1 = new StaticTest1();
		StaticTest1 st2 = new StaticTest1();
		st1.nonstatic_data = 100;
		StaticTest1.static_data = 100;
		//st1.static_data = 100;
		
		st2.nonstatic_data = 200;
		StaticTest1.static_data = 200;
		//st2.static_data = 200;
		
		System.out.println(st1);
		System.out.println(st2);

	}

}
