package com.java.array;

import java.util.Iterator;
import java.util.Random;

/*
// 0 과 5사이의 임의의 값으로 정수형 4개의 배열을 초기화하고
각 배열의 값으로 아래와 같은 막대그래프 형태로 출력
int[] ary = new int[4]
// 값을 임의로 셋팅
ary[0]  : 3    ary[1] : 2  ary[2] : 5  ary[3]  : 4  

    
    * 
    * *
*   * *
* * * *
* * * *
-------------------
0 1 2 3 
 */
public class App08 {

	public static void main(String[] args) {
		int[] ary = new int[10];
		Random rd = new Random();
		int min = 0, max = 10;
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = rd.nextInt(max+1);
			System.out.println(ary[i]);
		}
		// 최대의 길이는 5
		for (int i = max; i > 0; i--) {  // 막대그래프의 각 row
			// 배열순환
			for (int j = 0; j < ary.length; j++) {
				if(ary[j] >= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < ary.length; i++) {
			System.out.print("-");	
		}
		System.out.println();
		for (int i = 0; i < ary.length; i++) {
			System.out.print(i);
		}
		

	}

}
