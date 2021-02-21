package com.java.constructor;

public class CarDemo {

	public static void main(String[] args) {		
		
		System.out.println("객체 생성전");
		Car c = new Car("빨강");
		Car c2 = new Car();
		
		System.out.println("satic값 대입");
		Car.staticNumber = 100;
		
//		System.out.println("c 색상="+c.getColor());
//		System.out.println("c2 색상="+c2.getColor());
		Math.abs(-100);		
	}

}
