package com.ch05;

import java.util.Scanner;

/**
 * 학점 판정
 * A, B, C ,D ,F
 * @author 이규영
 *
 */
public class App05 {

	public static void main(String[] args) {
		// 입력 로직
		Scanner sc = new Scanner(System.in);		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("점수를 입력하세요 : ");
		int score =  sc.nextInt();
		// 판정로직
		char grade = ' ';
		if(score >=90) {
			grade = 'A';
		}else if(score >=80) {
			grade = 'B';
		}else if(score >= 70){
			grade = 'C';
		}else if(score >= 60){
			grade = 'D';
		}else {
			grade = 'F';
		}		
		// 출력로직
		// ooo 님의 점수는 oo 이고 학점은 o 입니다.		
		// 1. 문자열을 합치는 방법 ( + 연산)
		String result = name+"님의 점수는 " + score + " 이고 학점은 " + grade + " 입니다";
		System.out.println(result);		
		// 2. 문자열 포멧을 이용하는 방법
		result =  String.format(
				"%s 님의 점수는 %d 이고 학점은 %c 입니다."
				, name	,score	,grade	);
		System.out.println(result);
	}

}









