package com.ch05;

import java.util.Scanner;
// 4�γ����������� 100���� ������������ ������ ���� 
// 400���� ������������ ����
// ���� ����
// �Է��� ������ �Է��ϰ�
// ����� �ش�⵵�� �������� �ƴ��� ����
// (�⵵�� 4�γ����� �������� 0 && 100���� �������� �ʴ� ��) || 
// �Ǵ� 400���� ���� �������� �����̴�.
// year % 4 == 0
// year %100 != 0
// year % 400 == 0
// 2000 : 
// 1992 : 
public class App8 {

	public static void main(String[] args) {
		// ���� ����
		int year = 0;
		String str = "";
		// �Է�
		System.out.print("�⵵�� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		// ����(���) -> ����
		if( (year % 4 ==0 && year % 100 != 0) 
				|| year % 400 ==0 
				) {
			str = year + "= ���� �Դϴ�.";
		}else {
			str = year + "= ��� �Դϴ�.";
		}
		// ���
		System.out.println(str);
		
	}

}
