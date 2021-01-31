package com.ch05;

import java.util.Scanner;

/**
 * 국어 영어 수학 각 과목당 점수는 50점 이상
 * 평균이 60 이상이면 합격처리 해주세요 *
 */
public class App09 {
	public static void main(String[] args) {
		/**
		 * 국어 영어 수학을 표현할 변수
		 * 평균은 어떻게?(나눗셈 연산-->실수형태?반올림 버리냐)
		 * 1.각 과목당 50점 이상을 만족하는 조건?
		 * 2.평균이 60이상을 표현하는 조건?
		 * 1번과 2번조건을 어떻게 결합 할 것인가?
		 * 
		 */
		// 변수
		int kor=0, eng=0, math=0;
		double evg = 0.0;
		String result = "불합격";		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수를 공백을 기준으로"
				+ " 연속해서 입력하세요");
		System.out.println("입력예시 : 100 80 100");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		evg = (kor + eng + math) / 3.0;		
		//  판정				
		if(	 (kor >=50 && eng >=50 && math >=50)
				&& evg >=60 ) 
		{ 
			result = "합격";			
		}		
		// 출력
		System.out.println(result);
	}

}





