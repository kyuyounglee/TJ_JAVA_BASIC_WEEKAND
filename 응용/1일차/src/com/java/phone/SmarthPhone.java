package com.java.phone;

/**
 * 
 * ���: ����Ŭ������ Ȯ���ؼ� ���ο� Ŭ������ ����°� Ű���� : extends
 */
public class SmarthPhone extends Phone {
	// �θ��� ��ҵ��� ��ӹ޴´�..
	// private�� ������ ��� ��
	private String appName;

	// �ʱ�ȭ�� 4���� ������ �ʱ�ȭ
	// ����ڰ� �����ڸ� �ڵ����� ������
	// �⺻������ �⺻�����ڴ� �����ϰ� �ִ�.
	public SmarthPhone() {
		this("","","",""); // ������ ����
	}

	public SmarthPhone(String name,String color,String company, String appName) {
		super(name,color,company); // ������ ����		
		this.appName = appName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void installApp() {
		System.out.println("�� ��ġ");
	}

	@Override
	public String toString() {
		String str =  super.toString();
		return str + " SmarthPhone [appName=" + appName + "]";
	}

	@Override
	public void call() {
		System.out.println("��������ϰ� ��ȭ�� �޴´�");
	}
	
	

}
