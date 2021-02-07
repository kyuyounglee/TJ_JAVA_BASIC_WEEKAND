package com.java.array;

import java.util.Random;
import java.util.Scanner;

/**
 * 0 ~ 100
0 1 2  3   4   5    6       a  
3 5 10 25 95 100 125

����� ���� �Է��� �޴´�.
50

50�� a[3]�� a[4]���̿� �ֽ��ϴ�.

1. �����ϰ� 0 ~ 100 ���� �����ϴ� random
2. ������ �迭 7�� ����
for���� �̿��ؼ� ���� ä���.

3. ����ڷκ��� ã�� ���� �Է¹޴´�.
4. ������� ���� �迭�� ������ ���� ���ؼ�
���� ������ ���� ���� ����ϰ�
�׷��������� ����� ���̿� �ִ��� ����Ѵ�.
--for
 */
public class App10 {

	public static void main(String[] args) {
		//1 �������� �� �迭 ����
		int[] ary = new int[7];
		Random rd = new Random();
		for (int i = 0; i < ary.length; i++) {
			ary[i] = rd.nextInt(100); 
			System.out.print(ary[i]+" ");
		}
		
		System.out.println("ã�� ���� �Է��ϼ���:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		// search
		// ���� ��ã���� �ٻ簪�� ���� ���� ���� �ش��ϴ� 
		// �迭 index�� ã�´�
		// �ٻ簪�� ������ �迭�� �����
		int[] comp = new int[7]; 
		for (int i = 0; i < ary.length; i++) {
			if(ary[i] == choice) {
				System.out.println("ã�ҽ��ϴ�. "+choice);
				break;
			}else {
				comp[i] = Math.abs(ary[i]-choice);				
			}
		}
		// Ȯ�ο�
		System.out.println();
		for (int i = 0; i < comp.length; i++) {
			System.out.print(comp[i]+" ");
		}
		// �ٻ簪 �迭���� ���� ���� ���� ã�Ƽ� �� ���� �ش��ϴ�
		// index�� ã�´�.. �׷��� �� index�� �����ϴ�
		// ���� �迭 index �� ���� ���� ����� ���̰�
		// �� index�� �������� �� ���� ���� ã������ ���� ���̰� 
		// ���� ���� ���� �� ���̿� ��ġ�� ���̴�.
		int min = comp[0], findIndex = 0;
		for (int i = 0; i < comp.length; i++) {
			if(comp[i]  < min) {
				min = comp[i];
				findIndex = i;
			}			
		}
		//ary[findIndex] --> ���� �ٻ�ġ�� �ش��ϴ� ���� ��
		int befor = ary[findIndex-1];
		int after = ary[findIndex + 1];
		if(Math.abs(choice-befor) > Math.abs(choice-after)) {
			System.out.println(after+"��"+ary[findIndex]);
		}else {
			System.out.println(befor+"��"+ary[findIndex]);
		}
				

	}

}
