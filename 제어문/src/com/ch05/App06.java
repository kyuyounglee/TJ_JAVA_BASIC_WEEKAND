package com.ch05;

import javax.xml.ws.handler.MessageContext.Scope;

/**
 * ��ø if statement
 * @author �̱Կ�
 *
 */
public class App06 {
	//  50 <= x <=90
	public static void main(String[] args) {
		int score = 0; // �ʱ�ȭ
		// ��ø if ��
		if(score >=50) {
			if(score <= 90) {
				System.out.println("50 <= x <=90");	
				// code here
			}
		}
		
		// �������� ����
		if( score >=50 && score <= 90) {
			System.out.println("50 <= x <=90");
		}
	}

}
