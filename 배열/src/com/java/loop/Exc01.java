package com.java.loop;

import java.util.Iterator;
import java.util.Random;

//  1. 1���� 100������ �����߿� 5�� ����� �� *
//  2.1���� 100������ �����߿� ¦���� Ȧ�� ������ ��
//  3.�ΰ��� �ֻ����� �ִµ�.. �ΰ� �������� ���� 6�̵Ǵ� ����� ��
//   1,5  2,4
//  4. ����for
//  *
//  **
//  ***
//  ****
//  *****
//  5.���� for
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
			// 5�� ����� ��
			if(i % 5 == 0) {
//				fiveSum = fiveSum + i;
				fiveSum += i;
			}
			// ¦�� �� Ȧ���� ��
			if(i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
			
		}
		String str =  String.format("5�� ����� �� = %d ¦���� �� = %d Ȧ���� ��  %d"
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

//    *				4ĭ ����
//   ***			3ĭ ����		
//  *****			2ĭ ����		
// *******			1ĭ ����
//*********			0ĭ ����
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
		
		// �ֻ����� ���� 6�� ���ö� ����(Ư�� ������ �����Ҷ����� �ݺ�) 
		// �������� 1 ~ 6���� ���ü� �ֵ���
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
		System.out.println("�ֻ��� Ƚ�� : " + count);
		
		
	}

}





