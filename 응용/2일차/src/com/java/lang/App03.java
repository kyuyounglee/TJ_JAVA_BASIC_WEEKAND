package com.java.lang;

public class App03 {

	public static void main(String[] args) {
		Student st1 = new Student("ȫ�浿",100);
		Student st2 = new Student("�̼���", 150);
		
		System.out.println(st1); // toString()
		System.out.println(st2);
		
		try {
			// ���� �ǵ��� ���� ����
			st1 = (Student) st2.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}  		
		System.out.println(st1); // toString()
		System.out.println(st2);
		
		st1.name = "������";
		System.out.println(st1);
		System.out.println(st2);
	}

}
