package com.java.loop;

import java.util.Random;
import java.util.Scanner;

public class App07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int rdnumber = rd.nextInt(10);
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("10������  ���ڸ� �Է��ϼ���");
			int hnumber = sc.nextInt();
			if(hnumber  == rdnumber) {
				System.out.println("����");
				break;
			}else if(hnumber > rdnumber) {
				System.out.println("ũ��");
			}else {
				System.out.println("�۴�");
			}
			System.out.println("����Ͻðڽ��ϱ�?(y/n");
			String str = sc.next();
			if("n".equalsIgnoreCase(str)) {
				break;
			}
				
		}
	}

}
