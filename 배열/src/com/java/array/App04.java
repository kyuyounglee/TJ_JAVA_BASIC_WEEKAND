package com.java.array;

import java.util.Scanner;

/**
 * ���
 * @author �̱Կ�
 * 5���� ������ �����Ͱ� �ְ�.
 * ��հ� ����ū�� �׸��� ���� �������� ���Ѵ�.
 */

public class App04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. ������ ������ 5���� ������ �� �ִ� ������ �迭 �� �����
		// 2. �����͸� �Է¹޴´�(Scan)
		// 3. ��հ� �ִ밪 �ּҰ��� ���Ѵ�
		
		// ������ �迭 ���� ���� : 5��¥��
		int[] data = new int[5];
		double avg=0.0;
		int max = 0, min = 0,sum=0;
		
		Scanner sc = new Scanner(System.in);
		// �Է�
		for (int i = 0; i < 5; i++) {
			data[i] =  sc.nextInt();
		}
		// �����Ͻ�����
		max = data[0]; 
		min = data[0];
		for (int i = 0; i < 5; i++) {
			sum += data[i];
			if(max < data[i]) {
				max = data[i];
			}
			if(min > data[i]) {
				min = data[i];
			}
		}
		// ���
		avg = (double)sum / 5;
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
		

	}

}
