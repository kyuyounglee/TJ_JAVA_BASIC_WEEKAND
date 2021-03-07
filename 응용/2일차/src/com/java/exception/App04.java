package com.java.exception;

import java.util.Scanner;

public class App04 {
	public static final String USER_ID = "user";
	public static final String USER_PSW = "1234";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("패스워드");
		String psw = sc.nextLine();
		
		try {
			if(!USER_ID.equals(id)) {
				throw new LoginException("아이디가 틀립니다.");
			}else if(!USER_PSW.equals(psw)) {
				throw new LoginException("패스워드가 틀립니다.");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
