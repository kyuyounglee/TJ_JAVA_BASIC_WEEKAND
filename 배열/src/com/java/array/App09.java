package com.java.array;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/*
a[0] = 5
a[1] = 7
a[2] = 8
a = {5, 7, 8}

Scanner sc = new Scanner(System.in)
int n = sc.nextInt();
int[] a = new int[n];

�迭�� �� ��ҿ��ٰ� ���� �Է��� �޾Ƽ� ����
for ���� �̿��ؼ� �� �迭�� ���� �Է��� �޾Ƽ� ����
a[i] = sc.nextInt();
*/
public class App09 {

	public static void main(String[] args) {
		System.err.print("�迭�� ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int arrlen = sc.nextInt();
		int[] ary = new int[arrlen];
		
		Random rd = new Random();
		for (int i = 0; i < ary.length; i++) {
			ary[i] =  rd.nextInt(10);
		}
		System.out.println("��Ҽ� : "+arrlen);
		for (int i = 0; i < ary.length; i++) {
			String str = String.format("ary[%d] = %d", i,ary[i]);
			System.out.println(str);
		}
		String str = "ary = {";
//		for (int i = 0; i < ary.length; i++) {
//			str += ary[i];
//			if(i != ary.length-1)
//			{
//				str += ", ";
//			}			 
//		}
//		str += "}";
//		System.out.println(str);
		for (int i = 0; i < ary.length; i++) {
			str += ary[i]+", ";
						 
		}		
		int index = str.indexOf(",");
		int lastindex = str.lastIndexOf(",");		
		str = str.substring(0, lastindex);
		str += "}";
		System.out.println(str);
		
		String filename = "E:/�ָ��� �ڹٱ���/ZoomIt.exe";
		lastindex = filename.lastIndexOf(".");
		int len = filename.length();
		System.out.println(filename.substring(lastindex+1,len));
		
	}

}
