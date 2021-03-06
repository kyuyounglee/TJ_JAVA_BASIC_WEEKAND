package com.java.phone;

/**
 * 
 * ����� ���� ������ �⺻������ Object�� ��ӹ��������� ó���Ѵ�
 *
 * �ɹ� ���� �޼ҵ� ���������� public private protected ����
 */
public class Phone {

	protected String name;
	protected String color;
	protected String company;

	// shift + alt + s
	// ����Ÿ�� �޼ҵ��̸�( ) { }
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	// �ɹ������� �ʱ�ȭ �� �� �ִ� ������ �����ڸ� �ۼ�
	// ����Ÿ���� ������� �ʴ´�
	// ��ü������ �ڵ����� ȣ�� - �ܺο��� ���Ƿ� ȣ�� �Ұ���
	// �޼ҵ��̸��� ������ �ִ�..--> Ŭ�����̸�

	// ������ �߿����� �Ű������� ���� �����ڴ� ����������
	// Phone ph = new Phone();
	// Phone()
	public Phone() {

	}

	// �Ű����� ������
	public Phone(String name, String color, String company) {
		// super();
		this.name = name;
		this.color = color;
		this.company = company;
	}

	// �ܺο��� ��ü�� print�ϸ� ������ toString() ȣ���ϰ� �Ǿ� ����

	@Override
	public String toString() {
		return "Phone [name=" + name + ", color=" + color + ", company=" + company + "]";
	}

	// int a;
	// int b = 100;

	// �����ڴ� ���� �������� ������ �⺻�����ڰ� �����ȴ�.
	// �׷���.. �ʿ信 ���ؼ� �Ű����� �����ڸ� �����
	// �⺻�����ڴ� �� �̻��������� �ʱ� ������ ����ڰ� ����� ��� �Ѵ�
	// �����ڴ� �ƿ� �ȸ���ų�.
	// �����... �ݵ�� �⺻�����ڵ� ���� ������ش�.
	// �����ڴ� ���ο��� �ݵ�� �θ��� �⺻�����ڸ� ȣ���Ѵ�.(�ڵ����ص�..)
	// �׷��� �ʿ信 ���ؼ� �θ��� �ٸ������ڸ� ȣ���ϰ� ������
	// superŰ���带 ����ؼ� ������ �θ��� �����ڸ� ȣ���Ѵ�.
	// �̶� �⺻���� �����ϴ� super() �� ����ڰ� ȣ���� �����ڷ� ��ü�ȴ�.
	
	
	public void call() {
		System.out.println("��ȭ�� �Ǵ�");
	}
	public void receive() {
		System.out.println("��ȭ�� �޴�");
	}
	
	// overload
	public void receive(int a) {
		System.out.println("��ȭ�� ������ ����");
	}
	// ���� �Լ��ߺ�
//	public void receive(int a)
//	{
//		System.out.println("��ȭ�� ������ ����2");
//	}
	
}
