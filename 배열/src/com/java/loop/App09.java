package com.java.loop;
/**
 * 1. 0 ���� 10������ ¦���� ����ϼ���
 * 2. 0���� 10���� ���ʷ� ���Ҷ� �� ���� 20���� ū ���ڴ�? 
 * @author tj2
 *
 */
public class App09 {

	public static void main(String[] args) {
		// 1
		for (int i = 0; i <= 10; i += 2) {
			System.out.println(i);			
		}
		
		for (int i = 0; i <=10; i++) {
			if(i % 2 != 0) { // Ȧ��
				continue;
			}
			System.out.println(i);
		}
		
		

	}

}
