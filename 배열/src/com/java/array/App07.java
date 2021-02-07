package com.java.array;

import java.util.Iterator;

public class App07 {

	public static void main(String[] args) {
		// 1 자료형은 double이고 요소수가 6인 배열을 생성하고
		// 이 배열의 모든 요소를 출력하세요
		double[] ary = new double[6];
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		
		// 2. 요소의 개수가 5개인 정수형 배열에서 순서대로
		// 5, 4, 3, 2, 1을 대입하는 프로그램
		int[] intary = {5,4,3,2,1};
		int[] intary2 = new int[5];
		for (int i = intary2.length,index=0; i > 0; i--,index++) {
			intary2[index] = i;
		}
		
		// 요소의 개수가 5인 double형 배열을 만들고 앞에서부터
		// 1.1, 2.2, 3.3, 4.4, 5.5
		double[] darray = new double[5];
		for (int i = 0; i < darray.length; i++) {
			darray[i] = (i+1)*1.1;			
			String str =  String.format("%.1f", darray[i]);
			System.out.println(str);
		}
	}

}
