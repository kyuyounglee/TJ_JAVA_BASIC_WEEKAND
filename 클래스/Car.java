package com.java.object;
/**
 * 
 * �ʵ� : ������(���Ÿ��)
 * ������ : ��ü�����Ҷ� �ڵ����� ȣ��Ǵ¸޼���
 * �޼���(�Լ�) : ���
 * ����Ÿ��(void)  �Լ���(�Ķ����){}
 */
public class Car {
	// �ʵ�
	private String type;	// �¿��� Ʈ�� ���� = �뵵
						// or 5�ν� 7�ν�,9�ν� 12�ν�, ���ν� = �ο�
	String color;	// ����
	int distance;	// ����Ÿ�
	
	// �⺻������
	Car(){
		System.out.println("�⺻������ ȣ��Ǿ����ϴ�.");
	}
	
	boolean setType(String t) {
		if(t == "�¿���" || t == "����" || t=="Ʈ��") {
			type = t;
			return true;
		}else {
			System.out.println("�߸��� Ÿ���Դϴ�.");
			return false;
		}
	}
	
	String getType() {
		return type;
	}
	// type�� ���¿� ���� �������� ��ȯ�ϴ� �޼ҵ�
	String[] getTypes(String kind){
		String[] ary;
		if(kind=="�뵵") {
			ary = new String[3];
			ary[0] = "�¿���";
			ary[1] = "����";
			ary[2] = "Ʈ��";
		}else if( kind == "�ο�") {
			ary = new String[5];
			ary[0] = "5�ν�";
			ary[1] = "7�ν�";
			ary[2] = "9�ν�";
			ary[3] = "12�ν�";
			ary[4] = "���ν�";
		}else {
			ary = new String[0];
		}
		return ary;
	}
}
