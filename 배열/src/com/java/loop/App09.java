package com.java.loop;
/**
 * 1. 0 부터 10사이의 짝수만 출력하세요
 * 2. 0부터 10까지 차례로 더할때 그 합이 20보다 큰 숫자는? 
 * @author tj2
 *
 */
public class App09 {

	public static void main(String[] args) {
		// 1
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);			
		}
		
		for (int i = 0; i <=10; i++) {
			if(i % 2 != 0) { // 홀수
				continue;
			}
			System.out.println(i);
		}
		
		

	}

}
