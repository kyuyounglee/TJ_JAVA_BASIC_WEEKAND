package com.java.collection;

public class Rectangle implements Shape{
	int x, y;

	public Rectangle() {
		this(0,0);
	}
	
	public Rectangle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double length() {
		// TODO Auto-generated method stub
		return (x+y)*2;
	}
	
}
