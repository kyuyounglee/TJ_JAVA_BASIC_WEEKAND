package com.java.array;

import java.util.Scanner;

/**
 * 통계
 * @author 이규영
 * 5개의 정수형 데이터가 있고.
 * 평균과 가장큰값 그리고 가장 작은값을 구한다.
 */

public class App04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 정수형 데이터 5개를 관리할 수 있는 정수형 배열 을 만든다
		// 2. 데이터를 입력받는다(Scan)
		// 3. 평균과 최대값 최소값을 구한다
		
		// 정수형 배열 변수 선언 : 5개짜리
		int[] data = new int[5];
		double avg=0.0;
		int max = 0, min = 0,sum=0;
		
		Scanner sc = new Scanner(System.in);
		// 입력
		for (int i = 0; i < 5; i++) {
			data[i] =  sc.nextInt();
		}
		// 비지니스로직
		max = data[0]; 
		min = data[0];
		for (int i = 0; i < 5; i++) {
			sum += data[i];
			if(max < data[i]) {
				max = data[i];
			}
			if(min > data[i]) {
				min = data[i];
			}
		}
		// 평균
		avg = (double)sum / 5;
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
		

	}

}
