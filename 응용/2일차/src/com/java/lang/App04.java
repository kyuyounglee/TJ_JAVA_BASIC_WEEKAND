package com.java.lang;

public class App04 {

	public static void main(String[] args) {
		// �⺻������ Ÿ���� �����ϰ�� ���� ������
		// �迭,  ��ü
		int[] ary1 = {1,2,3};
		int[] ary2 = {10,20,30};		
		int[] ary3 = ary1.clone();
		
		// ���ڿ������� hash�ڵ�� ��ü�� �������� �ƴ϶�. ���ڿ��� ������
		// ���� ���� �����Ѵ�.
		System.out.println(System.identityHashCode(ary1) );
		System.out.println(ary1);
		System.out.println(ary2);
		System.out.println(ary3);
		// �迭 ary1�� ���� ���� ����� ����
		// �迭 ary3�� ���� ���� ����� ����.
		
		ary3[0] = 100;
		System.out.println("ary1 : ");
		for (int i : ary1) {
			System.out.println(i);
		}		
		
		System.out.println("ary3 : ");
		for (int i : ary3) {
			System.out.println(i);
		}
		
		// �⺻���� ������ �������� �����͸� �����Ҷ���
		// ���Ǹ� ���Ѵ�(������ �ٲ�� �����Ƿ�)
		// clone�� �̿�
		
		

	}

}
