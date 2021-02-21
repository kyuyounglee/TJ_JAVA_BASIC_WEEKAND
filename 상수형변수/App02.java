package com.java.constant;
/**
 * final이 붙은 method
 * final이 사용되면 더이상 의미를 변경하지 못한다
 * overload 불허....(상속에서..)
 * 같은 클래스에서는 가능함
 * 
 * 클래스에 final이 붙으면 그 클래스는 더이상 부모가 되지 못함
 *
 */
public class App02 {
	
	// 메소드생성
	final void greeting() {
		System.out.println("안녕하세요");
	}
	
	// greeting 메소드 overload
	void greeting(String name) {
		System.out.println(name + " 님 안녕하세요");
	}	

}
