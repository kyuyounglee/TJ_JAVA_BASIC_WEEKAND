package com.java.Demo;

import com.java.phone.Phone;
import com.java.phone.SmarthPhone;

public class Demo {

	public static void main(String[] args) {
		// phone
		int a = 0;
		Phone ph = new Phone("��ȭ��", "������", "��ȭ��ȸ��");
		System.out.println(ph);
		
		SmarthPhone sp = new SmarthPhone("��ȭ��", "������", "��ȭ��ȸ��","���ξ�");		
		System.out.println(sp);
		
		Phone ph2 = new Phone();
		SmarthPhone sp2 = new SmarthPhone();
		
		ph2 = new SmarthPhone();
		// override 
		ph2.call();
		
		
		
		// ���� �Ǵ� Ȱ��
		if( ph2 instanceof SmarthPhone) {
			SmarthPhone instance =  (SmarthPhone)ph2;
			instance.getAppName();
		}	
		
		
	}
	
	

	
}
