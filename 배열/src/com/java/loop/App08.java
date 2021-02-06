package com.java.loop;
/*
 * do ~ while 문
 * while문은 for문처럼 처음부터 조건을 보고 수행하는 반면에
 * do~while은 최초 한번은 조건과 관계없이 무조건 실행하고
 * 2번째부터 조건을 본다
 */
public class App08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2;
		
		while(number > 2) {
			System.out.println("while 1");
			number ++;
		}
		
		do {
			System.out.println("do ~ while");
		} while (number > 2);
		
	}

}
