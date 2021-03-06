package com.java.shape;

public class Triangle extends Shape {	
	
	public double getArea() {		
		return width*height / 2.0;
	}
	public Triangle() {
		this(0,0);
	}
	
	public Triangle(int width, int height) {
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
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	// 생성자 기본, 매개변수 생성자
	// getter, setter
	// toString()   override
	
}
