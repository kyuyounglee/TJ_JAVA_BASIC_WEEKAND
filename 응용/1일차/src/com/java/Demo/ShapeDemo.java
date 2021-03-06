package com.java.Demo;

import com.java.shape.Circle;
import com.java.shape.Rectangle;
import com.java.shape.Shape;
import com.java.shape.Triangle;

public class ShapeDemo {

	public static void main(String[] args) {
		// ũ�Ⱑ �پ��� ������ ����� �� ������
		// �������� ���� ���ϼ���
		// new Circle(), new Rectangle(), new Triangle()
		int[] intAry = {1,2,3,4,5};
		Shape[] ary = {new Circle(5)
				, new Triangle(10,5)
				, new Rectangle(10, 5)
				, new Rectangle(5, 3)
				, new Circle(2)
				}; 
		// ��� �������� ���� ���
		// foreach
		double areaSum = 0.0;
		for (Shape shape : ary) {
			areaSum += shape.getArea();
		}
		System.out.println("�������� ���� : "+areaSum);
		// �߻�ȭ�� �ϰ� �Ǹ�
		// 1. ���� �迭�� Ŭ�������� �޼ҵ���� ����ȭ
		// 2. �������� �̿��� �� �ִ�
	}

}
