package com.java.object;

public class CarTest {

	public static void main(String[] args) {		
		// car Ŭ������ ��ü�� ����
		Car c = new Car();
		//c.type = "������";
		// �Լ��� ���� Ÿ���� ����
		boolean isSuccees =c.setType("�¿���");
		if(isSuccees) {
			System.out.println(c.getType());
		}
		
		String[] result =  c.getTypes("�뵵");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		

	}

}
