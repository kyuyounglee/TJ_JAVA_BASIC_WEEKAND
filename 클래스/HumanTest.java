package com.java.object;

public class HumanTest {

	public static void main(String[] args) {
		
		Human a = new Human("�̱Կ�",100,20);	
		
		// ?? ��ü�� �����Ҷ�.. �ʿ��� �����͸� �����ؼ�
		// �ѹ濡 ��ü�� ������ �� ������?
		// ��ü������ �ݵ�� �����ϴ� ������
		// �׷� �����ڸ� ���� , �� �����ڴ� �޼ҵ��� �����̱⶧����
		// �����ڿ� ���� ������ �� �ִ�.
		// ���.. ��ü������ �ʿ��� �����͸� �����ؼ� ��ü�� ����� �ȴ�.
		// �����ڸ� �뵵�� �°� ����� ����		
		System.out.println(a.getName());
		System.out.println(a.getHeight());
		System.out.println(a.getWeight());
	}

}
