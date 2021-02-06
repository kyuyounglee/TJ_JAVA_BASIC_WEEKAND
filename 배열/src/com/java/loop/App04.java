package com.java.loop;

import java.util.Iterator;

/*
 * 2단부터 9단까지 전부 출력하기
 * 
 */
public class App04 {

	public static void main(String[] args) {
//		int dan = 2;
//		for (int i = 1; i <= 9; i++) {
//			String str = String.format("%d x %d = %d", dan, i, dan*i);
//			System.out.println(str);
//		}
//		System.out.println();
//		dan = 3;
//		for (int i = 1; i <= 9; i++) {
//			String str = String.format("%d x %d = %d", dan, i, dan*i);
//			System.out.println(str);
//		}
//		System.out.println();
//		dan = 4;
//		for (int i = 1; i <= 9; i++) {
//			String str = String.format("%d x %d = %d", dan, i, dan*i);
//			System.out.println(str);
//		}
		
		// 반복횟수 만큼 설계한다
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				String str = String.format("%d x %d = %d", dan, i, dan*i);
				System.out.println(str);
			}
			System.out.println();
		}
	}

}
