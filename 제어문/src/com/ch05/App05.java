package com.ch05;

import java.util.Scanner;

/**
 * ���� ����
 * A, B, C ,D ,F
 * @author �̱Կ�
 *
 */
public class App05 {

	public static void main(String[] args) {
		// �Է� ����
		Scanner sc = new Scanner(System.in);		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		int score =  sc.nextInt();
		// ��������
		char grade = ' ';
		if(score >=90) {
			grade = 'A';
		}else if(score >=80) {
			grade = 'B';
		}else if(score >= 70){
			grade = 'C';
		}else if(score >= 60){
			grade = 'D';
		}else {
			grade = 'F';
		}		
		// ��·���
		// ooo ���� ������ oo �̰� ������ o �Դϴ�.		
		// 1. ���ڿ��� ��ġ�� ��� ( + ����)
		String result = name+"���� ������ " + score + " �̰� ������ " + grade + " �Դϴ�";
		System.out.println(result);		
		// 2. ���ڿ� ������ �̿��ϴ� ���
		result =  String.format(
				"%s ���� ������ %d �̰� ������ %c �Դϴ�."
				, name	,score	,grade	);
		System.out.println(result);
	}

}









