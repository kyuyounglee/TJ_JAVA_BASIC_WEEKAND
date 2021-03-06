package com.java.inter;

public class ImplMyinter implements Myinter1  {

	@Override
	public void dMethod() {
		Myinter1.sMethod();
		Myinter1.super.dMethod();
		//Myinter1.super.dMethod();
	}
	
}
