package com.java.collection;

public class Triangle implements Shape{

	int r;
	final double PI = 3.14;
	
	public Triangle() {
		this(0);
	}
	
	public Triangle(int r) {
		super();
		this.r = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return r*r*PI; 
	}

	@Override
	public double length() {
		// TODO Auto-generated method stub
		return 2*PI*r;
	}

}
