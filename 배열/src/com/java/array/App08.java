package com.java.array;

import java.util.Iterator;
import java.util.Random;

/*
// 0 �� 5������ ������ ������ ������ 4���� �迭�� �ʱ�ȭ�ϰ�
�� �迭�� ������ �Ʒ��� ���� ����׷��� ���·� ���
int[] ary = new int[4]
// ���� ���Ƿ� ����
ary[0]  : 3    ary[1] : 2  ary[2] : 5  ary[3]  : 4  

    
    * 
    * *
*   * *
* * * *
* * * *
-------------------
0 1 2 3 
 */
public class App08 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		Random rd = new Random();
		int min = 0, max = 10;
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = rd.nextInt(max+1);
			System.out.println(ary[i]);
		}
		// �ִ��� ���̴� 5
		for (int i = max; i > 0; i--) {  // ����׷����� �� row
			// �迭��ȯ
			for (int j = 0; j < ary.length; j++) {
				if(ary[j] >= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < ary.length; i++) {
			System.out.print("-");	
		}
		System.out.println();
		for (int i = 0; i < ary.length; i++) {
			System.out.print(i);
		}
		

	}

}
