package com.java.imp;

public class Complexer implements Fax,Printer,Scanner {

	@Override
	public void scan() {
		System.out.println("스캔실행");
		
	}

	@Override
	public void print() {	
		System.out.println("프린트 실행");		
	}

	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER+"에서 "+tel+"로 FAX 전송");		
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel+"에서 "+FAX_NUMBER+"로 FAX 수신");		
	}

}
