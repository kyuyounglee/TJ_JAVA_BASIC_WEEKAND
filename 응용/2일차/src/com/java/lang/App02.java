package com.java.lang;

public class App02 {

	public static void main(String[] args) {
		Student st1 = new Student("ȫ�浿",100);
		Student st2 = new Student("ȫ�浿",100);
		if(st1 == st2) {
			System.out.println("����");
		}
		
		if(st1.equals(st2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
	}

}
