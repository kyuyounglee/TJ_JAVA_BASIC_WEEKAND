package com.java.loop;
/*
 * do ~ while ��
 * while���� for��ó�� ó������ ������ ���� �����ϴ� �ݸ鿡
 * do~while�� ���� �ѹ��� ���ǰ� ������� ������ �����ϰ�
 * 2��°���� ������ ����
 */
public class App08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2;
		
		while(number > 2) {
			System.out.println("while 1");
			number ++;
		}
		
		do {
			System.out.println("do ~ while");
		} while (number > 2);
		
	}

}
