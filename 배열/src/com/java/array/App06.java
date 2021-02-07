package com.java.array;

import java.util.Random;

/**
 * java에서 랜덤값 추출하는 방법
 * @author 이규영
 *
 */
public class App06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int rdnum = rd.nextInt(21); // 바로 정수로 사용		
		int mr = (int)(Math.random() * 21); // 0 ~ 1이하의 실수를 
		// 0 ~ 0.9999
		// 0 ~ 20.000
		// 20 ~ 40
		int mr2 = (int)((Math.random() * 21) + 20);
		
		// 특정범위로 제한
		// 20 ~ 40 --> 두개의 차이
		// rd.nextInt(20)  0 ~ 19  + 20 == 20 ~ 39
		
		// 정리
		// 특정범위의 임의의 숫자를 얻고 싶으면
		int min = 20, max = 40;
		double a =  Math.random()*(max - min+1);
		double b = Math.ceil(a); // 0 ~ 20.00000
		int c = (int)b; // 0 ~20
		int d = c + min; // 20 ~ 40
		
		// 20 ~ 40
		int rand = (int)(Math.ceil(Math.random()*(max - min+1)))+min;

	}

}
