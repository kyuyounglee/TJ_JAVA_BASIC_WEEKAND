package com.java.loop;
/**
 * 특정 횟수만큼 반복 == for
 * (예 구구단,  회원(10)이 또는 데이터가 100개 있는데.
 *  그중에 뭘 찾을때)
 *  
 * 특정 조건을 만족할때까지 == while
 * 
 * @author tj2
 *
 */
public class App06 {

	public static void main(String[] args) {
		
		// for VS while 문법 형태 비교
		for (int i = 0; i < 5; i++) {
			System.out.println("for");
		}
		
		int w = 0;
		while (w < 5) {
			System.out.println("while");
			w++;
		}

	}

}
