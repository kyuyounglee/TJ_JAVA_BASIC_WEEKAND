package com.java.exception;

import java.util.Scanner;

public class App04 {
	public static final String USER_ID = "user";
	public static final String USER_PSW = "1234";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� : ");
		String id = sc.nextLine();
		System.out.println("�н�����");
		String psw = sc.nextLine();
		
		try {
			if(!USER_ID.equals(id)) {
				throw new LoginException("���̵� Ʋ���ϴ�.");
			}else if(!USER_PSW.equals(psw)) {
				throw new LoginException("�н����尡 Ʋ���ϴ�.");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
