package com.java.exception;

public class App01 {

	public static void main(String[] args) {
		
		try {
			int[] arr = {1,2,3};
			System.out.println("�迭�� ������ : " + arr.length);
			//int data = arr[3];
			System.out.println(3/0);
			System.out.println("try���� ������ �Դϴ�.");
		}catch (Exception e) {}
		
		
		System.out.println("���α׷� ����");

	}

}
