package com.java.shape;

public abstract class Shape {

	protected int width, height;

	public Shape() {
		this(0,0);
	}
	
	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + "]";
	}
	
	// 추상화 메소드
	public abstract double getArea();	
	
}
