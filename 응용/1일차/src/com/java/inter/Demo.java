package com.java.inter;

public class Demo {

	public static void main(String[] args) {
		ImplMyinter im = new ImplMyinter();
		im.dMethod();		
		//Myinter1.sMethod();		
		// 인터페이스의 default 로 선언된 메소드는
		// 상속을 받은 객체를 통해 사용하고
		// static은 상속과 관계없이 인터페이스 이름으로사용
	}

}
