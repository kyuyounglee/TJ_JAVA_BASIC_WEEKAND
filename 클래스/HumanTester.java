package com.java.object;

import java.util.Random;
import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		// ��ü ����
		// Ŭ������ ��ü�� = new Ŭ������()
		// Member m1;   Member Ŭ������ ��ü�� ���� ���´� null
		// Member m1 = new Member();  ��ü������ �Ҵ�, ��밡��
		int a1 = 10;
		int b1 = 10;
		if(a1 == b1) {
			System.out.println("a1 �� a2�� ����");
		}
		
		Member m1 = new Member();
		Member m2 = new Member();
		m1.data = 10;
		m2.data = 10;
		
		m1 = m2; // key point
		
		if(m1 == m2) {
			System.out.println("m1 m2 ����");
		}else {
			System.out.println("m1 m2 �ٸ���");
		}
		
	}

}
