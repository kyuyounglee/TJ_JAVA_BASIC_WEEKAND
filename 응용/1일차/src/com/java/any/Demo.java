package com.java.any;

public class Demo {

	public static void main(String[] args) {
		Animal an = new Cat();
		an = new Dog();
		an = new Snake();
		// pet만 다형성으로 표현
		Pet pt = new Dog();
		pt = new Cat();	
		

	}

}
