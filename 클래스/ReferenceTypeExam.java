package com.java.object;

public class ReferenceTypeExam {	

	static void addOne(int value) {
		value++;
	}
	
	static void addOne(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			ary[i]++;
		}
	}
	
	public static void main(String[] args) {
		// 자기자신의 객체를 생성
		ReferenceTypeExam rte = new ReferenceTypeExam();
		int value = 10;
		int[] ary = {1,2,3};
		
		// 1. 일반변수를 메소드에 전달하고 그 메소드에서 받아서 값을 변화시키면?
		// 과연 전달한 변수는 전달후에 값이 변했을까?
		System.out.println("함수 호출전 value = "+value);
		addOne(value);
		System.out.println("함수 호출후 value = "+value);
		
		System.out.println("함수 호출전 배열값");
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		addOne(ary);
		System.out.println("함수 호출전 배열값");
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
				
	}

}
