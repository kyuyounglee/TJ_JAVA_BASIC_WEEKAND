package com.java.array;

import java.util.Random;
import java.util.Scanner;

/**
 * �迭 : ���ӵ� �������� ����
 * @author �̱Կ�
 *
 */
public class App01 {

	public static void main(String[] args) {
		// ����
		int a;  // ������ ���� ����
		a = 3;	// �ʱ�ȭ
		System.out.println(a);
		
		int[] array = new int[3]; // �迭���� ����
		array[0] = 1;	// �ʱ�ȭ
		array[1] = 2;	// �ʱ�ȭ
		array[2] = 3;	// �ʱ�ȭ
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		
		int kor = 80, eng = 90, math = 100;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
		
	}

}
