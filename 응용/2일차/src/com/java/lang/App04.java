package com.java.lang;

public class App04 {

	public static void main(String[] args) {
		// 기본데이터 타입을 제외하고는 전부 참조형
		// 배열,  객체
		int[] ary1 = {1,2,3};
		int[] ary2 = {10,20,30};		
		int[] ary3 = ary1.clone();
		
		// 문자열형태의 hash코드는 객체의 고유값이 아니라. 문자열이 같으면
		// 같은 값을 리턴한다.
		System.out.println(System.identityHashCode(ary1) );
		System.out.println(ary1);
		System.out.println(ary2);
		System.out.println(ary3);
		// 배열 ary1의 값을 전부 출력해 보고
		// 배열 ary3의 값을 전부 출력해 보자.
		
		ary3[0] = 100;
		System.out.println("ary1 : ");
		for (int i : ary1) {
			System.out.println(i);
		}		
		
		System.out.println("ary3 : ");
		for (int i : ary3) {
			System.out.println(i);
		}
		
		// 기본형을 제외한 참조형에 데이터를 대입할때는
		// 주의를 요한다(원본도 바뀔수 있으므로)
		// clone을 이용
		
		

	}

}
