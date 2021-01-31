package com.ch05;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 컴퓨터가 랜덤한 숫자(0 ~2) 를 발생하면
 * 0 : 가위
 * 1 : 바위
 * 2 : 보 
 * 라고판정 해 보자
 */
public class App14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0) 바위(1) 보(2) 입력하세요 : ");
		int human = sc.nextInt();
		// 랜덤 클래스의 객체를 가지고 랜덤 숫자를 생성한다
		Random rd = new Random();
		int random = rd.nextInt(3); // 0 ~ 2 사이의 숫자를 생성		
		switch (random) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		default:
			break;
		}
		// 판정
		if(
				(human == 0 && random == 2)
				|| (human == 1 && random == 0)
				|| (human == 2 && random == 1)
				)
		{
			System.out.println("당신이 이겼어요");
		}
		else if(
				(human == 0 && random == 1)
				|| (human == 1 && random == 2)
				|| (human == 2 && random == 0)
				)
		{
			System.out.println("당신이 졌어요");
		}else {
			System.out.println("비겼습니다.");
		}
		
//		switch (human) {
//		case 0: // 가위
//			if(random == 2) {
//				System.out.println("당신이 이겼어요");
//			}else if(random == 1) {
//				System.out.println("당신이 졌어요");
//			}else {
//				System.out.println("비겼습니다.");
//			}
//			break;
//		case 1: // 바위
//			break;
//		case 2: // 보
//			break;
//
//		default:
//			break;
//		}
			

	}

}
