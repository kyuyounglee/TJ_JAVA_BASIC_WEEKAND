package com.java.inter;
// java 1.8 ÀÌÈÄ
public interface Myinter1 {
	default void dMethod() {
		System.out.println("default method");
	}
	static void sMethod() {
		System.out.println("static method");
	}
}
