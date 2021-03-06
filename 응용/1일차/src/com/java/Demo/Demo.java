package com.java.Demo;

import com.java.phone.Phone;
import com.java.phone.SmarthPhone;

public class Demo {

	public static void main(String[] args) {
		// phone
		int a = 0;
		Phone ph = new Phone("전화기", "검정색", "전화기회사");
		System.out.println(ph);
		
		SmarthPhone sp = new SmarthPhone("전화기", "검정색", "전화기회사","공부앱");		
		System.out.println(sp);
		
		Phone ph2 = new Phone();
		SmarthPhone sp2 = new SmarthPhone();
		
		ph2 = new SmarthPhone();
		// override 
		ph2.call();
		
		
		
		// 응용 또는 활용
		if( ph2 instanceof SmarthPhone) {
			SmarthPhone instance =  (SmarthPhone)ph2;
			instance.getAppName();
		}	
		
		
	}
	
	

	
}
