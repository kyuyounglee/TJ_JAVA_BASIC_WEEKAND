package com.java.object;

import java.util.Random;
import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		// 객체 생성
		// 클래스명 객체명 = new 클래스명()
		// Member m1;   Member 클래스의 객체를 선언 상태는 null
		// Member m1 = new Member();  객체생성과 할당, 사용가능
		int a1 = 10;
		int b1 = 10;
		if(a1 == b1) {
			System.out.println("a1 과 a2는 같다");
		}
		
		Member m1 = new Member();
		Member m2 = new Member();
		m1.data = 10;
		m2.data = 10;
		
		m1 = m2; // key point
		
		if(m1 == m2) {
			System.out.println("m1 m2 같다");
		}else {
			System.out.println("m1 m2 다르다");
		}
		
	}

}
