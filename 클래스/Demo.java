package com.java.object;

public class Demo {

	public static void main(String[] args) {
		MyCal mc = new MyCal();
		int result1 =  mc.add(10, 2);
		int result2 = mc.minus(10, 5);
		int result3 =  mc.multi(10, 2);
		double result4 = mc.divde(5, 2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		int a = 0;
		int b = 0;
		if(a == b) {
			System.out.println("같다");
		}
		
		MyCal mc1 = new MyCal();
		MyCal mc2 = new MyCal();
		// 객체는 독립적이라서 서로 다르다.
			

	}

}
