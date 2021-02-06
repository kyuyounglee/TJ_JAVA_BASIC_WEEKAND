package com.java.loop;

public class App02 {

	public static void main(String[] args) {		
//		System.out.println(" 2 * 1 = 2");
//		System.out.println(" 2 * 2 = 4");
//		System.out.println(" 2 * 3 = 6");
//		System.out.println(" 2 * 4 = 8");
//		System.out.println(" 2 * 5 = 10");
//		System.out.println(" 2 * 6 = 12");
//		System.out.println(" 2 * 7 = 14");
//		System.out.println(" 2 * 8 = 16");
//		System.out.println(" 2 * 9 = 18");
		int twonum = 2;
//		System.out.println(twonum + " * 1 = " + twonum * 1);
//		System.out.println(twonum + " * 2 = " + twonum * 2);
//		System.out.println(twonum + " * 3 = " + twonum * 3);
//		System.out.println(twonum + " * 4 = " + twonum * 4);
//		System.out.println(twonum + " * 5 = " + twonum * 5);
//		System.out.println(twonum + " * 6 = " + twonum * 6);
//		System.out.println(twonum + " * 7 = " + twonum * 7);
//		System.out.println(twonum + " * 8 = " + twonum * 8);
//		System.out.println(twonum + " * 9 = " + twonum * 9);
		
		for (int i = 1; i < 10; i++) {
//			System.out.println(twonum + " * " + (i+1) +" = " + twonum * (i+1) );
			String str = String.format("2 x %d = %d", i, i);
			System.out.println(str);
		}

	}

}
