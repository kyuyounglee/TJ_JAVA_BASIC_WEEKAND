package com.ch04;
/**
 * 3�� ������
 * @author �̱Կ�
 *
 */
public class App04 {

	public static void main(String[] args) {
		int age = 5;
		String name = (age > 18)? "����" : "�̼�����";
		String str 
		= String.format("�Է��Ͻ� ���� %d �� %s �Դϴ�", age, name);
		System.out.println(str);

	}

}
