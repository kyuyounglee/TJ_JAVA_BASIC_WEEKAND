package com.java.array;

import java.util.Random;

/**
 * java���� ������ �����ϴ� ���
 * @author �̱Կ�
 *
 */
public class App06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int rdnum = rd.nextInt(21); // �ٷ� ������ ���		
		int mr = (int)(Math.random() * 21); // 0 ~ 1������ �Ǽ��� 
		// 0 ~ 0.9999
		// 0 ~ 20.000
		// 20 ~ 40
		int mr2 = (int)((Math.random() * 21) + 20);
		
		// Ư�������� ����
		// 20 ~ 40 --> �ΰ��� ����
		// rd.nextInt(20)  0 ~ 19  + 20 == 20 ~ 39
		
		// ����
		// Ư�������� ������ ���ڸ� ��� ������
		int min = 20, max = 40;
		double a =  Math.random()*(max - min+1);
		double b = Math.ceil(a); // 0 ~ 20.00000
		int c = (int)b; // 0 ~20
		int d = c + min; // 20 ~ 40
		
		// 20 ~ 40
		int rand = (int)(Math.ceil(Math.random()*(max - min+1)))+min;

	}

}
