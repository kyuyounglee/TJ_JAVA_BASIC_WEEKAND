package com.java.exception;

import java.util.Iterator;
import java.util.Random;

/**
 *	������ ������ �迭�� �����
 *	������ ���� �����ϰ�
 *	��� : ������ index�� �ش��ϴ� �迭�� ��
 *  ���ܰ� �߻��� � �����̰� ��� ó���ؾ� �ϴ��� *   
 */
public class App03 {

	public static void main(String[] args) {
		try {
			int[] arr = {1,2,3,4,5}; // 0 ~ 4			
			Random rd = new Random();
			int index = rd.nextInt(7); // 0~ 6 ������ ���ڸ� index
			System.out.println("index = " + index);
			System.out.println(arr[index]);
			System.out.println("try ����");
		}catch (Exception e) {
			System.out.println("����ó��");
			e.printStackTrace();
		}
		System.out.println("�ý�������1");
		System.out.println("�ý�������2");
		System.out.println("�ý�������3");
	}

}
