package com.ch05;

import java.util.Scanner;

/**
 * 1. 두수를 입력받아서 
 * 가장 큰 값을 출력하고
 * 두 수의 차이를 출력하세요
 * 예시
 * 50 80
 * 가장큰 값은 80이고 두수의 차이는 30입니다.
 * 
 * 2. 세개의 정수를 입력받아서 가장 큰 값과 가장 작은 값을 출력
 * 예시  
 * 80 90 20
 * 가장큰 수는 90 이고 가장 작은 수는 20 
 *
 * 3. 세개의 수를 입력받아서 중간 값을  출력
 * 예시  80 90 100, (100 100 100)
 * 중간 값은 80입니다.... 
 */
public class App10 {
	public static void main(String[] args) {
		// solution 1
		// 변수
		int num1 = 0, num2 = 0, num3 = 0; 
		int max = 0, min = 0, diff = 0, mid = 0;
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("두수를 연속으로 입력하세요(100 200)");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		// 판정
		if(num1>=num2) {
			max = num1;
		}else {
			max = num2;
		}
		/* 단순한 if ~ else 구문은 3 항연산자로 대체할수 있다
		diff = num1 - num2;   
		if(diff < 0) {
			diff = -diff;
		*/
		diff = num1 - num2;
		diff = (diff > 0)? diff : -diff;
		System.out.println("가장큰수는 " + max + " 두수의 차이는 " + diff);
		// solution 2
		System.out.println("3개의 값을 입력하세요(100 90 80)");
		// 입력
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		// 로직
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
		String result =  String.format("입력한 수는 %d %d %d 이며 max=%d min=%d"
				, num1, num2,num3, max,min);
		System.out.println(result);
// 10 20 30, 10 30 20, 20 10 30, 20 30 10, 30 10 20, 30 20 10
		//solution 3
		mid = num1;
		if(mid > num2) {
			if(mid < num3) {
				//num2,num3중에 큰값이 중간 값이다.(이미 num1 이 최대값이므로)
				mid = (num2 > num3) ? num2 : num3;
			}else {
				mid = num2;
			}
		}else if(num2 < num3){
			mid = num2;
		}
		// 개선 로직
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
