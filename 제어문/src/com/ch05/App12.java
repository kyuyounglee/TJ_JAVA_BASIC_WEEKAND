package com.ch05;
/**
 * 조건문... 
 * IF 조건으로 판정(true / false)
 * 	--  범위를 가질때(논리연산자를 사용)
 * SWITCH (값으로 판단)
 *  -- CASE BY CASE (딱딱 맞아 떨어질때)
 *  
 *
 */
public class App12 {

	public static void main(String[] args) {
		int number = 2;
		switch (number) {
		case 1:		
			System.out.println("일");
			break;
		case 2:
			System.out.println("이");
			break;
		case 3:
			System.out.println("삼");
			break;
		default:
			System.out.println("일과 이와 삼을 제외한 나머지 정수");
			break;
		}

	}

}
