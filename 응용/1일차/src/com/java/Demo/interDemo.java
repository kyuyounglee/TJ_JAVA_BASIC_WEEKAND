package com.java.Demo;

import com.java.imp.Complexer;
import com.java.imp.Printer;
import com.java.imp.Test;

public class interDemo {

	public static void main(String[] args) {
		Complexer cpx = new Complexer();
		cpx.print();
		cpx.scan();
		cpx.send("02-123-1234");
		cpx.receive("031-123-1234");
		// �������̽��� �����Ϸ���...
		// �������̽��� ����� Ŭ������ ����� 
		// �� Ŭ������ ��ü�� ���� �ش� �޼ҵ带 ����Ѵ�
		Test t = new Test();
		t.print();
		
		new Printer() {			
			@Override
			public void print() {
				System.out.println("�����Ͱ� �ߵǳ׿�");
			}
		}.print();
		
	}

}
