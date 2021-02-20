package com.java.object;

public class CarTest {

	public static void main(String[] args) {		
		// car 클래스의 객체를 생성
		Car c = new Car();
		//c.type = "외재차";
		// 함수를 통해 타입을 셋팅
		boolean isSuccees =c.setType("승용차");
		if(isSuccees) {
			System.out.println(c.getType());
		}
		
		String[] result =  c.getTypes("용도");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		

	}

}
