package com.java.array;

import java.util.Iterator;

public class App07 {

	public static void main(String[] args) {
		// 1 �ڷ����� double�̰� ��Ҽ��� 6�� �迭�� �����ϰ�
		// �� �迭�� ��� ��Ҹ� ����ϼ���
		double[] ary = new double[6];
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		
		// 2. ����� ������ 5���� ������ �迭���� �������
		// 5, 4, 3, 2, 1�� �����ϴ� ���α׷�
		int[] intary = {5,4,3,2,1};
		int[] intary2 = new int[5];
		for (int i = intary2.length,index=0; i > 0; i--,index++) {
			intary2[index] = i;
		}
		
		// ����� ������ 5�� double�� �迭�� ����� �տ�������
		// 1.1, 2.2, 3.3, 4.4, 5.5
		double[] darray = new double[5];
		for (int i = 0; i < darray.length; i++) {
			darray[i] = (i+1)*1.1;			
			String str =  String.format("%.1f", darray[i]);
			System.out.println(str);
		}
	}

}
