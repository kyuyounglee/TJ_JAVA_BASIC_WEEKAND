package com.java.loop;

import java.util.Iterator;

/*
 * 2�ܺ��� 9�ܱ��� ���� ����ϱ�
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
		
		// �ݺ�Ƚ�� ��ŭ �����Ѵ�
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				String str = String.format("%d x %d = %d", dan, i, dan*i);
				System.out.println(str);
			}
			System.out.println();
		}
	}

}
