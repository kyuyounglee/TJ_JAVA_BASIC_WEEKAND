package com.java.imp;
/** 
 * �߻�ȭ �޼ҵ�θ� �����Ǿ� �ִ� Ŭ���� ��
 * ���� �߻�ȭ Ŭ������ �������̽���� �Ѵ�.
 * �������̽��� ������ �޼ҵ带 ���� �� ����
 * But 1.8 ���ķδ� default Ű���� �̿��ؼ�
 * �߻�ȭ�޼ҵ��� ������ ���� �Ҽ� �ִ�
 *  
 */
public interface InterfaceEx {
	public int MIN_PRICE = 0;
	public int MAX_PRICE = 10000;
	
	// mean �� ����� �ǹ�
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
