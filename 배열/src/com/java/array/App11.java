package com.java.array;

import java.util.Scanner;

import com.java.object.ArrayUtils;

/*
 * 3명의 후보가 있고.
 * 10명의 유권자로부터 투표를 진행해서
 * 당선자를 알아내는프로그램
 */
public class App11 {

	public static void main(String[] args) {
		//후보자
		String[] names = {"홍길동","강감찬","이순신"};
		// 투표용지
		int[] vote = new int[3];
		// 유권자 수
		int person = 5;
		// 입력을 위한 객체
		Scanner sc = new Scanner(System.in);		
		// 각각 유권자의 투표
		for (int i = 0; i < person; i++) {
			int choice = sc.nextInt();
			vote[choice]++;
		}
		// 투표함을 열어서 개표  가장 많은표를 받은 유권자 번호(index)
//		int max = vote[0], maxindex = 0;
//		for (int i = 0; i < vote.length; i++) {
//			if(max < vote[i]) {
//				max = vote[i];
//				maxindex = i;
//			}
//		}
		// 위의 코드는 우리가 만든 객체로 대체
		ArrayUtils au = new ArrayUtils();
		int maxindex = au.findMaxindex(vote, vote.length);
		
		// 당선인 발표
		System.out.println(names[maxindex]);
		
		
	}

}
