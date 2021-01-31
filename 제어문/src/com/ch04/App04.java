package com.ch04;
/**
 * 3항 연산자
 * @author 이규영
 *
 */
public class App04 {

	public static void main(String[] args) {
		int age = 5;
		String name = (age > 18)? "성인" : "미성년자";
		String str 
		= String.format("입력하신 나이 %d 는 %s 입니다", age, name);
		System.out.println(str);

	}

}
