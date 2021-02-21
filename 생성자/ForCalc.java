package com.java.constructor;
/**
 * 
 * 4칙연산을 하는 간단한 계산기
 *  피연산자는 2개 정수에 대해서(int)
 */
public class ForCalc {
	private int num1,num2;
	public ForCalc() {
		this(0,0);
	}
	
	public ForCalc(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int add() {
		return num1+num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
