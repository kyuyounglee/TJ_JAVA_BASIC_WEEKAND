package com.java.constructor;

public class CarDemo {

	public static void main(String[] args) {		
		
		System.out.println("��ü ������");
		Car c = new Car("����");
		Car c2 = new Car();
		
		System.out.println("satic�� ����");
		Car.staticNumber = 100;
		
//		System.out.println("c ����="+c.getColor());
//		System.out.println("c2 ����="+c2.getColor());
		Math.abs(-100);		
	}

}
