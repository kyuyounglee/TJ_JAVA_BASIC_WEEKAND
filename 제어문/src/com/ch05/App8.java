package com.ch05;

import java.util.Scanner;
// 4로나눠떨어지고 100으로 나눠떨어지지 않으면 윤년 
// 400으로 나눠떨어지면 윤년
// 윤년 계산기
// 입력은 정수로 입력하고
// 결과는 해당년도가 윤년인지 아닌지 판정
// (년도를 4로나눠서 나머지가 0 && 100으로 나눠지지 않는 해) || 
// 또는 400으로 나눠 떨어지면 유년이다.
// year % 4 == 0
// year %100 != 0
// year % 400 == 0
// 2000 : 
// 1992 : 
public class App8 {

	public static void main(String[] args) {
		// 변수 선언
		int year = 0;
		String str = "";
		// 입력
		System.out.print("년도를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		// 로직(계산) -> 판정
		if( (year % 4 ==0 && year % 100 != 0) 
				|| year % 400 ==0 
				) {
			str = year + "= 윤년 입니다.";
		}else {
			str = year + "= 평년 입니다.";
		}
		// 출력
		System.out.println(str);
		
	}

}
