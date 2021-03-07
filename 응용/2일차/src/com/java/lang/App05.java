package com.java.lang;

import java.util.Arrays;

/**
 * �Ű������� ������ �̷�������� �׻� ���簡 �̷������.(copy) 
 * ������ ������ �Ű������� ���޽� ������ ����ɼ� ������,
 * clone �� �ƴ϶� �ܼ��� = (���Կ����ڸ� �̿��ϸ� ) ���� ����Ǵ°� �ƴ϶�
 * ������ �����Ͱ� �ȴ�
 */
public class App05 {

	public static void main(String[] args) {
		int data = 10;
		System.out.println("�޼ҵ� ȣ���� data = " + data);
		change(data);
		System.out.println("�޼ҵ� ȣ���� data = " + data);
		
		System.out.println("###########################");
		
		int[] ary = {1,2,3};
		System.out.println("�޼ҵ� ȣ���� data = " + show(ary));
		change(ary);
		System.out.println("�޼ҵ� ȣ���� data = " + show(ary));
		
		System.out.println("###########################");
		
		Student st = new Student("abc", 50);
		System.out.println(st);
		change(st);
		System.out.println(st);
		
		
	}
	
	static void change(int data) {
		data = 100;
		System.out.println("�޼ҵ�ȿ��� data = " + data);
	}
	// overload
	static void change(int[] ary) {
		ary[0] = 1500;
	}
	
	static String show(int[] ary) {
		String str = "";
		for (int i : ary) {
			str += i+", ";
		}
		return str;
	}
	// overload
	static void change(Student s) {
		s.name = "";
		s.age = 0;
	}

}
