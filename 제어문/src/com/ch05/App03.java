package com.ch05;

import java.util.Scanner;

public class App03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int score =  sc.nextInt(); // ȭ�鿡�� �����Է�
		if(score >=60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		System.out.println("��������");
		

	}

}
