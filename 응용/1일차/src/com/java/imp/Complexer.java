package com.java.imp;

public class Complexer implements Fax,Printer,Scanner {

	@Override
	public void scan() {
		System.out.println("��ĵ����");
		
	}

	@Override
	public void print() {	
		System.out.println("����Ʈ ����");		
	}

	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER+"���� "+tel+"�� FAX ����");		
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel+"���� "+FAX_NUMBER+"�� FAX ����");		
	}

}
