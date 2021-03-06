package com.java.shape;

public class Rectangle extends Shape{	
	
	public Rectangle() {
		super(0,0);
		//this(0,0); // 생성자 위임
	}
	
	public Rectangle(int width, int height) {
		super(width, height);		
	}	
	
	public int getWidth() {
		return super.getWidth();
	}

	public void setWidth(int width) {
		super.setWidth(width);
	}

	public int getHeight() {
		return super.getHeight();
	}

	public void setHeight(int height) {
		super.setHeight(height);
	}

	public double getArea() {
		return super.getWidth() * super.getHeight();
	}
	
}
