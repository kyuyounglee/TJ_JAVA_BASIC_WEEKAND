package com.java.array;

import java.util.Random;
import java.util.Scanner;

/**
 * 0 ~ 100
0 1 2  3   4   5    6       a  
3 5 10 25 95 100 125

사용자 값을 입력을 받는다.
50

50은 a[3]와 a[4]사이에 있습니다.

1. 랜덤하게 0 ~ 100 까지 생성하는 random
2. 정수형 배열 7개 만들어서
for문을 이용해서 값을 채운다.

3. 사용자로부터 찾을 값을 입력받는다.
4. 사용자의 값과 배열의 각각의 값을 비교해서
만약 같으면 같은 값을 출력하고
그렇지않으면 어느값 사이에 있는지 출력한다.
--for
 */
public class App10 {

	public static void main(String[] args) {
		//1 랜덤생성 및 배열 생성
		int[] ary = new int[7];
		Random rd = new Random();
		for (int i = 0; i < ary.length; i++) {
			ary[i] = rd.nextInt(100); 
			System.out.print(ary[i]+" ");
		}
		
		System.out.println("찾을 값을 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		// search
		// 만약 못찾은면 근사값이 가장 작은 값에 해당하는 
		// 배열 index를 찾는다
		// 근사값을 저장할 배열을 만든다
		int[] comp = new int[7]; 
		for (int i = 0; i < ary.length; i++) {
			if(ary[i] == choice) {
				System.out.println("찾았습니다. "+choice);
				break;
			}else {
				comp[i] = Math.abs(ary[i]-choice);				
			}
		}
		// 확인용
		System.out.println();
		for (int i = 0; i < comp.length; i++) {
			System.out.print(comp[i]+" ");
		}
		// 근사값 배열에서 가장 작은 값을 찾아서 그 값에 해당하는
		// index도 찾는다.. 그래서 그 index에 대항하는
		// 원본 배열 index 의 값이 가장 가까운 값이고
		// 그 index를 기준으로 앞 뒤의 값과 찾으려는 값의 차이가 
		// 가장 작은 값이 두 사이에 위치할 값이다.
		int min = comp[0], findIndex = 0;
		for (int i = 0; i < comp.length; i++) {
			if(comp[i]  < min) {
				min = comp[i];
				findIndex = i;
			}			
		}
		//ary[findIndex] --> 가장 근사치에 해당하는 원본 값
		int befor = ary[findIndex-1];
		int after = ary[findIndex + 1];
		if(Math.abs(choice-befor) > Math.abs(choice-after)) {
			System.out.println(after+"과"+ary[findIndex]);
		}else {
			System.out.println(befor+"과"+ary[findIndex]);
		}
				

	}

}
