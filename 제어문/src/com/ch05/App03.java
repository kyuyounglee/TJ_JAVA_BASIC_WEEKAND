package com.ch05;

import java.util.Scanner;

public class App03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score =  sc.nextInt(); // 화면에서 점수입력
		if(score >=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("시험종료");
		

	}

}
