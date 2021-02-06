package com.java.loop;

import java.util.Iterator;
import java.util.Random;

//  1. 1부터 100까지의 정수중에 5의 배수의 합 *
//  2.1부터 100까지의 정수중에 짝수와 홀수 각각의 합
//  3.두개의 주사위가 있는데.. 두개 던졌을때 합이 6이되는 경우의 수
//   1,5  2,4
//  4. 이중for
//  *
//  **
//  ***
//  ****
//  *****
//  5.이중 for
//  *****
//  ****
//  ***
//  **
//  *
//  6. 
public class Exc01 {

	public static void main(String[] args) {
		int fiveSum = 0, even = 0, odd = 0;
		for (int i = 1; i <= 100; i++) 
		{
			// 5의 배수의 합
			if(i % 5 == 0) {
//				fiveSum = fiveSum + i;
				fiveSum += i;
			}
			// 짝수 및 홀수의 합
			if(i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
			
		}
		String str =  String.format("5의 배수의 합 = %d 짝수의 합 = %d 홀수의 합  %d"
				,fiveSum,even, odd);
		System.out.println(str);
		
		for (int a = 1; a < 6; a++) {
			for (int b = 1; b <= 6; b++) {
				if(a+b == 6) {
					System.out.println(a + ", " + b);
				}
			}			
		}
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");				
			}	
			System.out.println();
			
		}
		
		System.out.println();
		
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");				
			}	
			System.out.println();
		}

//    *				4칸 공백
//   ***			3칸 공백		
//  *****			2칸 공백		
// *******			1칸 공백
//*********			0칸 공백
//		System.out.print(" ");System.out.print(" ");System.out.print(" ");System.out.print(" ");  //4
//		System.out.print("*");
//		System.out.println();
//		
//		System.out.print(" ");System.out.print(" ");System.out.print(" "); // 3
//		System.out.print("*");System.out.print("*");System.out.print("*");
//		System.out.println();
//		
//		System.out.print(" ");System.out.print(" "); // 2
//		System.out.print("*");System.out.print("*");System.out.print("*");System.out.print("*");System.out.print("*");
//		System.out.println();
		
		// 1
		
		 
		// i = 1  4
		// i = 3  3
		// i = 5  2
		// i = 7  1
		// i = 9  0
		
		// i = 1, 3, 5, 7, 9    for(int end = 1 ; end < 10; end += 2)
		for (int end = 1, blank = 4 ; end < 10
				; end += 2, blank--) 
		{
			for (int i = 0; i < blank; i++) {
				System.out.print(" ");
			}
			
			for (int i = 0; i < end; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 주사위의 눈이 6이 나올때 까지(특정 조건을 만족할때까지 반복) 
		// 랜덤값이 1 ~ 6까지 나올수 있도록
		// 1 ~ 6
		int count = 0;
		while (true) {
			count++;
			Random rd = new Random();
			int randNumber =  rd.nextInt(6)+1; // 1 ~ 6
			System.out.println(randNumber);
			if(randNumber == 6) {
				break;
			}
		}
		System.out.println("주사위 횟수 : " + count);
		
		
	}

}





