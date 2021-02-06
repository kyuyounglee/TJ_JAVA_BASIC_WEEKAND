package com.java.loop;

import java.util.Random;
import java.util.Scanner;
/**
 * 숫자 맞추기 게임
 * 규칙
 * 1. 10이하의 임의의 숫자를 맞추는 게임
 * 총 시도 횟수는 5번을 시도한다.
 * 만약 맞추면 게임종료
 * 
 * @author tj2
 *
 */
public class App05 {

	public static void main(String[] args) {
		// 변수 선언
		boolean isFail = true;
		// 랜덤생성
		Random rd = new Random();
		int number =  rd.nextInt(10);
		
		// 사용자는 맞출때까지 5번을 입력받는다
		// 입력
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("10 이하의 숫자를 입력하세요");
			int human = sc.nextInt();
			if(human == number) {
				System.out.println("정답");
				isFail = false;
				break;
			}
			else if(human > number) {
				System.out.println("크다");
			}
			else
			{
				System.out.println("작다");
			}
		}
		if(isFail) {
			System.out.println("못맞췄군요...");
			System.out.println("정답은 " + number);
		}
		
		

	}

}








