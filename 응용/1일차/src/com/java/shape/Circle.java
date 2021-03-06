package com.java.shape;

public class Circle extends Shape{
	private int R;
	private final double PI = 3.14;

	public Circle() {
		this(0);
	}	
	public Circle(int r) {
		super();
		R = r;
	}
	public int getR() {		
		return R;
	}
	public void setR(int r) {
		R = r;
	}
	@Override
	public String toString() {
		return "Circle [R=" + R + "]";
	}
	
	
	@Override
	public double getArea() {
		return R*R*PI;
	}
	
	// ������ �θ��� �޼ҵ带 �����ϰ� �� override �ϰԲ�
	// �Ҽ� ������?
	
	
	
}
