package com.java.array;

import java.util.Scanner;

import com.java.object.ArrayUtils;

/*
 * 3���� �ĺ��� �ְ�.
 * 10���� �����ڷκ��� ��ǥ�� �����ؼ�
 * �缱�ڸ� �˾Ƴ������α׷�
 */
public class App11 {

	public static void main(String[] args) {
		//�ĺ���
		String[] names = {"ȫ�浿","������","�̼���"};
		// ��ǥ����
		int[] vote = new int[3];
		// ������ ��
		int person = 5;
		// �Է��� ���� ��ü
		Scanner sc = new Scanner(System.in);		
		// ���� �������� ��ǥ
		for (int i = 0; i < person; i++) {
			int choice = sc.nextInt();
			vote[choice]++;
		}
		// ��ǥ���� ��� ��ǥ  ���� ����ǥ�� ���� ������ ��ȣ(index)
//		int max = vote[0], maxindex = 0;
//		for (int i = 0; i < vote.length; i++) {
//			if(max < vote[i]) {
//				max = vote[i];
//				maxindex = i;
//			}
//		}
		// ���� �ڵ�� �츮�� ���� ��ü�� ��ü
		ArrayUtils au = new ArrayUtils();
		int maxindex = au.findMaxindex(vote, vote.length);
		
		// �缱�� ��ǥ
		System.out.println(names[maxindex]);
		
		
	}

}
