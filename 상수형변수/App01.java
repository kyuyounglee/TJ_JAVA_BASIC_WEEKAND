package com.java.constant;

public class App01 {

	// ��� - ������ ������
	static final int MAXINPUTNUMBER = 10;
	
	public static void main(String[] args) {
		// ����� ���� ( const)
		// ���� ���ϴ¼�..
		int a = 10;		// ����		
		a = 20;				
		// ����� ������  onyl �빮�ڷ� ǥ�� - ���
		
		int[] ary = new int[MAXINPUTNUMBER];
		
		
		App02 b = new App02();
		b.greeting();
		b.greeting("�̱Կ�");

	}

}
