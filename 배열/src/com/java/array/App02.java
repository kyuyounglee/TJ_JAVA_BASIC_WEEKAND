package com.java.array;

public class App02 {

	public static void main(String[] args) {		
		// 정수형 배열선언
//		int[] intArray;
//		int intArray2[];
//		
//		intArray = new int[5];
//		intArray2 = new int[3];
		
		int[] intArray = new int[5];
		int intArray2[] = new int[3];
		
		// intArray를 0으로 초기화 해 보세요..(초기화->최초로 셋팅)
		intArray[0] = 0;
		intArray[1] = 0;
		intArray[2] = 0;
		intArray[3] = 0;
		intArray[4] = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = 0;
		}

	}

}
