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
		// 인터페이스를 구현하려면...
		// 인터페이스를 상속한 클래스를 만들고 
		// 그 클래스의 객체를 통해 해당 메소드를 사용한다
		Test t = new Test();
		t.print();
		
		new Printer() {			
			@Override
			public void print() {
				System.out.println("프리터가 잘되네요");
			}
		}.print();
		
	}

}
