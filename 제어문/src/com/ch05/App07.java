package com.ch05;

public class App07 {

	public static void main(String[] args) {
		int score = 0; // �ʱ�ȭ
		// ��ø if ��
		if(score >=50) {
			// code A..
			if(score <= 90) {
				System.out.println("50 <= x <=90");	
				// code B..
			}
		}
		
		// �������� ���� �ϸ�  code B�� ó���Ҽ� ������ 
		// �Ʒ��� ���  code A�� ó���Ҽ� ����. else ��������
		// ǥ�� ����
		if( score >=50 && score <= 90) {
			System.out.println("50 <= x <=90");
			// code B..
		}

	}

}
