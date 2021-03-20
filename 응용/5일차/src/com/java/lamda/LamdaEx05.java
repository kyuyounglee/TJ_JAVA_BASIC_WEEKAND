package com.java.lamda;

public class LamdaEx05 {

	public static void main(String[] args) {		
		int a = 10, b = 5;
		LamdaCalc c1 = (x,y)->{
			return x+y;
		};
		System.out.println(c1.calc(a, b));
		
		c1 = (x,y)->{
			return x*y;
		};
		System.out.println(c1.calc(a, b));
		
		
	}

}
// 정수 두개를 받아서 계산하는 프로그램
@FunctionalInterface
interface LamdaCalc{
	int calc(int x, int y);
}
