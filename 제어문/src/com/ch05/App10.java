package com.ch05;

import java.util.Scanner;

/**
 * 1. �μ��� �Է¹޾Ƽ� 
 * ���� ū ���� ����ϰ�
 * �� ���� ���̸� ����ϼ���
 * ����
 * 50 80
 * ����ū ���� 80�̰� �μ��� ���̴� 30�Դϴ�.
 * 
 * 2. ������ ������ �Է¹޾Ƽ� ���� ū ���� ���� ���� ���� ���
 * ����  
 * 80 90 20
 * ����ū ���� 90 �̰� ���� ���� ���� 20 
 *
 * 3. ������ ���� �Է¹޾Ƽ� �߰� ����  ���
 * ����  80 90 100, (100 100 100)
 * �߰� ���� 80�Դϴ�.... 
 */
public class App10 {
	public static void main(String[] args) {
		// solution 1
		// ����
		int num1 = 0, num2 = 0, num3 = 0; 
		int max = 0, min = 0, diff = 0, mid = 0;
		// �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ��� �������� �Է��ϼ���(100 200)");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		// ����
		if(num1>=num2) {
			max = num1;
		}else {
			max = num2;
		}
		/* �ܼ��� if ~ else ������ 3 �׿����ڷ� ��ü�Ҽ� �ִ�
		diff = num1 - num2;   
		if(diff < 0) {
			diff = -diff;
		*/
		diff = num1 - num2;
		diff = (diff > 0)? diff : -diff;
		System.out.println("����ū���� " + max + " �μ��� ���̴� " + diff);
		// solution 2
		System.out.println("3���� ���� �Է��ϼ���(100 90 80)");
		// �Է�
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		// ����
		// 10 20 30, 10 30 20, 20 10 30, 20 30 10, 30 10 20, 30 20 10 
		max = num1;		
		if(max < num2 ) {
			max = num2;	
			if(max < num3) {
				max = num3;
			}
		}else if(max < num3){
			max = num3;
		}
		// 10 20 30, 10 30 20, 20 10 30, 20 30 10, 30 10 20, 30 20 10
		min = num1;
		if(min > num2) {
			min = num2;
			if(min > num3) {
				min = num3;
			}
		}else if(min > num3) {
			min = num2;
		}
		String result =  String.format("�Է��� ���� %d %d %d �̸� max=%d min=%d"
				, num1, num2,num3, max,min);
		System.out.println(result);
// 10 20 30, 10 30 20, 20 10 30, 20 30 10, 30 10 20, 30 20 10
		//solution 3
		mid = num1;
		if(mid > num2) {
			if(mid < num3) {
				//num2,num3�߿� ū���� �߰� ���̴�.(�̹� num1 �� �ִ밪�̹Ƿ�)
				mid = (num2 > num3) ? num2 : num3;
			}else {
				mid = num2;
			}
		}else if(num2 < num3){
			mid = num2;
		}
		// ���� ����
		if ((num1 >= num2 && num1 <= num3) ||(num1 >= num3 && num1 <= num1)) 
		{
			mid = num1;
		}		
		else if( (num2 >= num1 && num2 >= num3) ||(num2>=num3 && num2 <=num1))
		{
			mid = num2;
		}
		else if( (num3 >= num1 && num3 <= num2) ||(num3 >= num2 && num3 <= num1))
		{
			mid = num3;
		}
	}
}
