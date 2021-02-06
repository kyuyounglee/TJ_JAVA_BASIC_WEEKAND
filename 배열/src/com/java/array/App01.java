package com.java.array;

import java.util.Random;
import java.util.Scanner;

/**
 * 배열 : 연속된 데이터의 집합
 * @author 이규영
 *
 */
public class App01 {

	public static void main(String[] args) {
		// 변수
		int a;  // 정수형 변수 선언
		a = 3;	// 초기화
		System.out.println(a);
		
		int[] array = new int[3]; // 배열변수 선언
		array[0] = 1;	// 초기화
		array[1] = 2;	// 초기화
		array[2] = 3;	// 초기화
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		
		int kor = 80, eng = 90, math = 100;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
		
	}

}
