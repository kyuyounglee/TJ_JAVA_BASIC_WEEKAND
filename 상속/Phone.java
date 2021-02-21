package com.java.inheritance;
/**
 * 
 * �ɹ������� ������ �̸� ������ �ʱ�ȭ �Ҽ� �ִ� �����ڰ� �ʿ��ϴ�
 *
 */
public class Phone {

	private String name,color,compay;

	// �ǹؿ� �Ű������� �ִ� �����ڸ� �����
	// �ٷιؿ� �ִ� �⺻�����ڴ� �������� �����Ƿ� ����� �ش�
	public Phone() {
		// �����ڸ� ȣ���Ҷ��� �����ڿ����� �����ϸ�
		// ������ this() �̷��� ���
		this("","","");
	}
	
	public Phone(String name, String color, String compay) {
		super();
		this.name = name;
		this.color = color;
		this.compay = compay;
	}

	void call() {
		System.out.println("��ȭ�� �Ǵ�");
	}
	void receive() {
		System.out.println("��ȭ�� �޴´�");
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompay() {
		return compay;
	}

	public void setCompay(String compay) {
		this.compay = compay;
	}
	
	public void showData() {
		System.out.println(this.color);
		System.out.println(this.compay);
		System.out.println(this.name);
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", color=" + color + ", compay=" + compay + "]";
	}
	
	
	
	
}
