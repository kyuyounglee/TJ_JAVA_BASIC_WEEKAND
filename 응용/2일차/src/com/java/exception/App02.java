package com.java.exception;


public class App02 {

	public static void main(String[] args) {
		System.out.println("���θ޼ҵ� ����");
		try {
			A();
		} catch (Exception e) {
			System.out.println("���ο��� ����ó��");
			e.printStackTrace();
		}
		System.out.println("���θ޼ҵ� ����");
	}
	
	static void A() throws Exception {
		System.out.println("A�޼ҵ� ����");
		try {
			B();
		} catch (Exception e) {
			System.out.println("A���� ����ó��");
			e.printStackTrace();
			throw new Exception("�ϴ�ó������");
		}
		System.out.println("A�޼ҵ� ����");
	}
	
	static void B() throws Exception{
		System.out.println("B�޼ҵ� ����");		
		System.out.println(3/0);		
		C();
		System.out.println("B�޼ҵ� ����");
	}
	static void C() {
		System.out.println("C�޼ҵ� ����");
		System.out.println("C�޼ҵ� ����");
	}

}
