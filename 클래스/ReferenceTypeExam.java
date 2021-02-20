package com.java.object;

public class ReferenceTypeExam {	

	static void addOne(int value) {
		value++;
	}
	
	static void addOne(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			ary[i]++;
		}
	}
	
	public static void main(String[] args) {
		// �ڱ��ڽ��� ��ü�� ����
		ReferenceTypeExam rte = new ReferenceTypeExam();
		int value = 10;
		int[] ary = {1,2,3};
		
		// 1. �Ϲݺ����� �޼ҵ忡 �����ϰ� �� �޼ҵ忡�� �޾Ƽ� ���� ��ȭ��Ű��?
		// ���� ������ ������ �����Ŀ� ���� ��������?
		System.out.println("�Լ� ȣ���� value = "+value);
		addOne(value);
		System.out.println("�Լ� ȣ���� value = "+value);
		
		System.out.println("�Լ� ȣ���� �迭��");
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		addOne(ary);
		System.out.println("�Լ� ȣ���� �迭��");
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
				
	}

}
