package com.java.array;

import java.util.Iterator;

public class App03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// null�� ������ ��������..
		// �Ϲݺ����� �ʱ�ȭ�� ���ϸ�.. ������ ���� ����
		// ��ü�� �ʱ�ȭ �ȵǸ�... �� ���´� null
		
		// �迭�� �ʱ�ȭ�� ���ϸ� Ÿ�Կ� �´� �⺻ ���� ����		
		int[] ary = new int[5]; // 0���� �ʱ�ȭ	
		
		// �ʱ�ȭ ����
		int[] ary2 = {1,2,3,4}; 
		// 3���ε��� �ش��ϴ� ����� ��
		int[] ary3 = new int[] {1,2,3,4,5};
		// 2�� �ε����� �ش��ϴ� ����� ��
		String[] names = {"ȫ�浿","�̼���","������"};
		// 1�� �ε����� �ش��ϴ� ����� ��
		
		// ���� ������ ������ ��ҵ��� ����ϼ���
		for (int i = 0; i < 4; i++) {
			System.out.println(ary2[i]);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(ary3[i]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(names[i]);
			
		}
		System.out.println("==================");
		System.out.println(ary2);
		System.out.println(ary2[0]);
		
	}

}
