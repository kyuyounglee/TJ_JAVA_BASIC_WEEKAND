package com.java.constant;
/**
 * final�� ���� method
 * final�� ���Ǹ� ���̻� �ǹ̸� �������� ���Ѵ�
 * overload ����....(��ӿ���..)
 * ���� Ŭ���������� ������
 * 
 * Ŭ������ final�� ������ �� Ŭ������ ���̻� �θ� ���� ����
 *
 */
public class App02 {
	
	// �޼ҵ����
	final void greeting() {
		System.out.println("�ȳ��ϼ���");
	}
	
	// greeting �޼ҵ� overload
	void greeting(String name) {
		System.out.println(name + " �� �ȳ��ϼ���");
	}	

}
