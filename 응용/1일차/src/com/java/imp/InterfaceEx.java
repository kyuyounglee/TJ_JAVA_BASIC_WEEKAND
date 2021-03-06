package com.java.imp;
/** 
 * 추상화 메소드로만 구성되어 있는 클래스 즉
 * 완전 추상화 클래스를 인터페이스라고 한다.
 * 인터페이스는 완전한 메소드를 가질 수 없다
 * But 1.8 이후로는 default 키워들 이용해서
 * 추상화메소드의 내용을 정의 할수 있다
 *  
 */
public interface InterfaceEx {
	public int MIN_PRICE = 0;
	public int MAX_PRICE = 10000;
	
	// mean 은 평균을 의미
	public double meanPrice();
	public double totalPrice();
	default public double getSalesPrice(double price)
	{
		return price - (price * 0.05);
	};
	
	static void printPrice(double price) {
		System.out.println(price);
	}
	
}
