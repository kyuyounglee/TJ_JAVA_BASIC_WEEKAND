package com.java.inheritance;

public class SmartPhoneMain {

	public static void main(String[] args) {
		Phone p = new Phone("��ȭ��","ȭ��Ʈ","����");
		p.showData();
		
		System.out.println(p.toString());
		System.out.println(p); // ��ü ��ü�� ����ϸ� �⺻������ toString() �޼ҵ带 ȣ���Ѵ�.

	}

}
