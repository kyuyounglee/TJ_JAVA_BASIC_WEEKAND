package com.ch05;

/**
 * 이름과 점수를 입력받아서 학점을 계산한다. 
 * A : 100 ~ 90 B : 89 ~ 80 C : 79 ~ 70 D : 69 ~ 60 F :
 * 59 ~ 0
 * 
 * @author 이규영
 *
 */
public class App04 {

	public static void main(String[] args) {
		int score = 80;
		if (score >= 90) {
			System.out.println("A");
		} else {
			// B : 89 ~ 80
			if (score >= 80) {
				System.out.println("B");
			}else {
				// 79 ~~~~ 0
				// C : 79 ~ 70
				if(score >= 70) {
					System.out.println("C");
				}else {
					if(score >= 60) {
						System.out.println("D");
					}else {
						System.out.println("F");
					}
				}
				
			}
		}
	}
}







