package com.java.loop;

import java.util.Random;
import java.util.Scanner;
/**
 * ���� ���߱� ����
 * ��Ģ
 * 1. 10������ ������ ���ڸ� ���ߴ� ����
 * �� �õ� Ƚ���� 5���� �õ��Ѵ�.
 * ���� ���߸� ��������
 * 
 * @author tj2
 *
 */
public class App05 {

	public static void main(String[] args) {
		// ���� ����
		boolean isFail = true;
		// ��������
		Random rd = new Random();
		int number =  rd.nextInt(10);
		
		// ����ڴ� ���⶧���� 5���� �Է¹޴´�
		// �Է�
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("10 ������ ���ڸ� �Է��ϼ���");
			int human = sc.nextInt();
			if(human == number) {
				System.out.println("����");
				isFail = false;
				break;
			}
			else if(human > number) {
				System.out.println("ũ��");
			}
			else
			{
				System.out.println("�۴�");
			}
		}
		if(isFail) {
			System.out.println("�����豺��...");
			System.out.println("������ " + number);
		}
		
		

	}

}








