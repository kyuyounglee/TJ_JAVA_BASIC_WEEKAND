package com.java.exception;

import java.util.Iterator;
import java.util.Random;

/**
 *	임의의 정수형 배열을 만들고
 *	임의의 값을 저장하고
 *	출력 : 임의의 index에 해당하는 배열의 값
 *  예외가 발생시 어떤 종류이고 어떻게 처리해야 하는지 *   
 */
public class App03 {

	public static void main(String[] args) {
		try {
			int[] arr = {1,2,3,4,5}; // 0 ~ 4			
			Random rd = new Random();
			int index = rd.nextInt(7); // 0~ 6 임의의 숫자를 index
			System.out.println("index = " + index);
			System.out.println(arr[index]);
			System.out.println("try 종료");
		}catch (Exception e) {
			System.out.println("예외처리");
			e.printStackTrace();
		}
		System.out.println("시스템종료1");
		System.out.println("시스템종료2");
		System.out.println("시스템종료3");
	}

}
