package com.ch05;

public class App01 {

	public static void main(String[] args) {
		int score = 50;
		System.out.println("시험시작");
		if(score >=60) {
			System.out.println("합격입니다.");
		}
		
		if(score<60) {
			System.out.println("불합격입니다.");
		}
		System.out.println("시험끝");
	}
}
