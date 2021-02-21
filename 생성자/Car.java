package com.java.constructor;

/**
 * 
 * 생성자
 * this
 * overload (생성자는 대표적인 오버로드이다)
 * 클래스내부에서는 선언 및 정의만 가능
 * 
 * 초기화 : 생성자를 통해 , 초기화 블럭
 * static은 클래스단위로 사용한다.
 * (객체단위가 아님, 공용변수라고도 한다)
 * 
 * static 메소드로 만들것인지 판단하는 방법
 * 만든 메소드 내부에서 클래스의 일반 변수를 사용하지 않으면 static으로 
 * 선언하고 클래스명 으로 사용한다
 */
public class Car {
	static int staticNumber;
	private String color; // 변수 선언 캡슐화(은닉화)
	
	// static 초기화 블럭
	static
	{
		staticNumber = 0;
		System.out.println("static 초기화 블럭");
	}
	
	
	// instance 초기화 블럭(일반변수 혹은 인스턴스변수)
	{
		System.out.println("초기화 블럭 ");
	}
	
	
	Car(){	
		//color = "";
		//setColor("");
		this(""); // 생성자 위임
	} 	// 기본생성자
	
	// 매개변수 생성자
	Car(String color){
		this.color = color;
		System.out.println("생성자를 통해 초기화");
		
	} 
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
//		this("");// 생성자호출은 생성자 안에서만 가능
		this.color = color;	
	}
	
	static int addTwoNumber(int num1, int num2) {
		return num1+num2;
	}
	
	static int abs(int number) {
		if(number<0) {
			return -number;
		}
		return number;
	}
	
	
}
