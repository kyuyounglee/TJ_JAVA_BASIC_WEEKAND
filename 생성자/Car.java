package com.java.constructor;

/**
 * 
 * ������
 * this
 * overload (�����ڴ� ��ǥ���� �����ε��̴�)
 * Ŭ�������ο����� ���� �� ���Ǹ� ����
 * 
 * �ʱ�ȭ : �����ڸ� ���� , �ʱ�ȭ ��
 * static�� Ŭ���������� ����Ѵ�.
 * (��ü������ �ƴ�, ���뺯����� �Ѵ�)
 * 
 * static �޼ҵ�� ��������� �Ǵ��ϴ� ���
 * ���� �޼ҵ� ���ο��� Ŭ������ �Ϲ� ������ ������� ������ static���� 
 * �����ϰ� Ŭ������ ���� ����Ѵ�
 */
public class Car {
	static int staticNumber;
	private String color; // ���� ���� ĸ��ȭ(����ȭ)
	
	// static �ʱ�ȭ ��
	static
	{
		staticNumber = 0;
		System.out.println("static �ʱ�ȭ ��");
	}
	
	
	// instance �ʱ�ȭ ��(�Ϲݺ��� Ȥ�� �ν��Ͻ�����)
	{
		System.out.println("�ʱ�ȭ �� ");
	}
	
	
	Car(){	
		//color = "";
		//setColor("");
		this(""); // ������ ����
	} 	// �⺻������
	
	// �Ű����� ������
	Car(String color){
		this.color = color;
		System.out.println("�����ڸ� ���� �ʱ�ȭ");
		
	} 
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
//		this("");// ������ȣ���� ������ �ȿ����� ����
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
