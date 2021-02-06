package com.java.loop;

import java.util.Random;
import java.util.Scanner;

public class App07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int rdnumber = rd.nextInt(10);
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("10이하의  숫자를 입력하세요");
			int hnumber = sc.nextInt();
			if(hnumber  == rdnumber) {
				System.out.println("정답");
				break;
			}else if(hnumber > rdnumber) {
				System.out.println("크다");
			}else {
				System.out.println("작다");
			}
			System.out.println("계속하시겠습니까?(y/n");
			String str = sc.next();
			if("n".equalsIgnoreCase(str)) {
				break;
			}
				
		}
	}

}
