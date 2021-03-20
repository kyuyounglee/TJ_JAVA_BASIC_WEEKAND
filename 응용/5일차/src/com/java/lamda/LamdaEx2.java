package com.java.lamda;
public class LamdaEx2 {

	public static void main(String[] args) {
		InterEx01 it01 = ()->{
			System.out.println("안녕하세요");
		};
		it01.print();
		
		InterEx02 it02 = (/* String */ s)->{
			System.out.println(s+"님 안녕하세요");
		};
		it02.print("홍길동");
		
		InterEx02 it03 = s->{
			System.out.println(s+"님 안녕하세요");
		};
		it03.print("홍길동");
		
		

	}

}

interface InterEx01{
	void print();
}

interface InterEx02{
	void print(String s);
}
