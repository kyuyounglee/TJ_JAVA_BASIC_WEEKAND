package com.ch03;

/**
 * ����ȯ ����
 * @author �̱Կ�
 *
 */
public class App03 {

	// �������α׷�
	public static void main(String[] args) {
		// �ڵ�����ȯ(auto casting)
		// ������ ������Ÿ�� �Ǵ� ����Ÿ�Կ��� ūŸ������
		int number = 10;
		long number2 = number;
		
		// ����ȯ�� �� ��� �ϴ°��
		// ūŸ�Կ��� -> ����Ÿ������...
		double pi = 3.14;
		int pi2 = (int)pi;
		System.out.println(pi);
		System.out.println(pi2);
		//  ����....
		//  pi �� ���� �����κа� �Ҽ��κ����� ������(������ ����)
		// ���� Ÿ�Կ� �´� ������ �����ϰ� ����ϼ���
		// 3.14 - 3 = 0.14 
		
		double pi3 = pi - pi2; // 3.14 - 3
		System.out.println(pi3);
		
		 String str =  String.format("�ݰ����ϴ� %s ��", "�̱Կ�");
		 System.out.println(str);
		 str = String.format("%.3f", pi3);
		 System.out.println(str);
		 str = String.format("%5.3f", pi3);
		 System.out.println(str);
		 str = String.format("%-5.3f", pi3);
		 System.out.println(str);
				
		
	}

}
