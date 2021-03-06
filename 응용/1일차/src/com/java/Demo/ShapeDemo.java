package com.java.Demo;

import com.java.shape.Circle;
import com.java.shape.Rectangle;
import com.java.shape.Shape;
import com.java.shape.Triangle;

public class ShapeDemo {

	public static void main(String[] args) {
		// 크기가 다양한 도형을 만들고 그 각각의
		// 면적들의 합을 구하세요
		// new Circle(), new Rectangle(), new Triangle()
		int[] intAry = {1,2,3,4,5};
		Shape[] ary = {new Circle(5)
				, new Triangle(10,5)
				, new Rectangle(10, 5)
				, new Rectangle(5, 3)
				, new Circle(2)
				}; 
		// 모든 도형들의 면적 계산
		// foreach
		double areaSum = 0.0;
		for (Shape shape : ary) {
			areaSum += shape.getArea();
		}
		System.out.println("도형들의 합은 : "+areaSum);
		// 추상화를 하게 되면
		// 1. 같은 계열의 클래스들의 메소드들을 통일화
		// 2. 다형성을 이용할 수 있다
	}

}
