package com.ch05;
/**
 * swap  ����
 * �ΰ��� ���� �Է¹޾Ƽ�.
 * ū ������� ����Ͻÿ�(��������)
 * a = 10  b = 20
 * �����
 * ����  a, b�� ���
 * 20 10 
 * ���� a�� ���� ���̸� �� ����  swap  �Ѵ�* 
 *
 */
public class App11 {

	public static void main(String[] args) {
		int a= 10 , b = 20;
		// �μ��� ��ȯ�ϴ� ����
		if(a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a);
		System.out.println(b);
				
	}

}
