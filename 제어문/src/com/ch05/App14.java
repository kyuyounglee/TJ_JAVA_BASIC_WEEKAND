package com.ch05;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * ��ǻ�Ͱ� ������ ����(0 ~2) �� �߻��ϸ�
 * 0 : ����
 * 1 : ����
 * 2 : �� 
 * ������� �� ����
 */
public class App14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����(0) ����(1) ��(2) �Է��ϼ��� : ");
		int human = sc.nextInt();
		// ���� Ŭ������ ��ü�� ������ ���� ���ڸ� �����Ѵ�
		Random rd = new Random();
		int random = rd.nextInt(3); // 0 ~ 2 ������ ���ڸ� ����		
		switch (random) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		default:
			break;
		}
		// ����
		if(
				(human == 0 && random == 2)
				|| (human == 1 && random == 0)
				|| (human == 2 && random == 1)
				)
		{
			System.out.println("����� �̰���");
		}
		else if(
				(human == 0 && random == 1)
				|| (human == 1 && random == 2)
				|| (human == 2 && random == 0)
				)
		{
			System.out.println("����� �����");
		}else {
			System.out.println("�����ϴ�.");
		}
		
//		switch (human) {
//		case 0: // ����
//			if(random == 2) {
//				System.out.println("����� �̰���");
//			}else if(random == 1) {
//				System.out.println("����� �����");
//			}else {
//				System.out.println("�����ϴ�.");
//			}
//			break;
//		case 1: // ����
//			break;
//		case 2: // ��
//			break;
//
//		default:
//			break;
//		}
			

	}

}
