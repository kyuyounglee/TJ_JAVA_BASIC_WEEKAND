package com.ch05;

import java.util.Scanner;

/**
 * ���� ���� ���� �� ����� ������ 50�� �̻�
 * ����� 60 �̻��̸� �հ�ó�� ���ּ��� *
 */
public class App09 {
	public static void main(String[] args) {
		/**
		 * ���� ���� ������ ǥ���� ����
		 * ����� ���?(������ ����-->�Ǽ�����?�ݿø� ������)
		 * 1.�� ����� 50�� �̻��� �����ϴ� ����?
		 * 2.����� 60�̻��� ǥ���ϴ� ����?
		 * 1���� 2�������� ��� ���� �� ���ΰ�?
		 * 
		 */
		// ����
		int kor=0, eng=0, math=0;
		double evg = 0.0;
		String result = "���հ�";		
		// �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ���� ������ ������ ��������"
				+ " �����ؼ� �Է��ϼ���");
		System.out.println("�Է¿��� : 100 80 100");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		evg = (kor + eng + math) / 3.0;		
		//  ����				
		if(	 (kor >=50 && eng >=50 && math >=50)
				&& evg >=60 ) 
		{ 
			result = "�հ�";			
		}		
		// ���
		System.out.println(result);
	}

}





