package com.ch04;
// �������� ����
public class App03 {

	public static void main(String[] args) {
		int a = 0, b = 20;
		System.out.println(a = 10 );
		System.out.println(a);
		System.out.println((a = 20) > 0 );
		System.out.println(a);
		System.out.println("-----------------------");
		System.out.println(a > b && (a = 30) < 0 );
		System.out.println(a);
		// &&  �� ���� ���ǹ����� �����߿�   false ������ ������ ������ ������
		// ���� ���Ѵ�...
		
		// || �� ���� ���ǹ����� �����߿�   true ������ ������ ������ ������
		// ���� ���Ѵ�...
		
		
		String name = "ȫ�浿";
		name.charAt(0);
		
		name = null;
		if(name !=null && name.length() > 0)
			name.charAt(0);
		

	}

}
