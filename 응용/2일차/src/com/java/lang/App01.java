package com.java.lang;

public class App01 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		if(str1 == str2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = new String("abc");
		str2 = new String("abc");
		//if(str1 == str2) {
		if(str1.equals(str2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		System.out.println(str1);
		System.out.println(str2);
		
		int a = 10;
		int b = 10;
		if(a == b ) {
			System.out.println("�� ������ ����");
		}else {
			System.out.println("�� ������ �ٸ���");
		}
		
		// �⺻������ �ƴ� ��ü�� �̷���� ��������
		// �׷��������� ����?  ��ü�� �� �������� ���� �񱳴�
		// ��ü ��ü���ƴ϶�. ��ü�� ǥ���ϰ��� �ϴ� ����� ���ؾ��Ѵ�.
		
		
		

	}

}
