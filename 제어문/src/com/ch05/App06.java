package com.ch05;

import javax.xml.ws.handler.MessageContext.Scope;

/**
 * 중첩 if statement
 * @author 이규영
 *
 */
public class App06 {
	//  50 <= x <=90
	public static void main(String[] args) {
		int score = 0; // 초기화
		// 중첩 if 문
		if(score >=50) {
			if(score <= 90) {
				System.out.println("50 <= x <=90");	
				// code here
			}
		}
		
		// 논리연산을 적용
		if( score >=50 && score <= 90) {
			System.out.println("50 <= x <=90");
		}
	}

}
