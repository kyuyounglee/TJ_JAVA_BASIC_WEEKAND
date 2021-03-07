package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

// 간단한 lotto 추천번호 시스템
public class Set02 {

	public static void main(String[] args) {
		Random rd = new Random();
		HashSet<Integer> set = new HashSet<>();
		
		// 순환문... for 횟수가 정해져 있을때
		// while 조건을 만족할때
//		for (int i = 0; i < 6; i++) {
//			int rdNumber = rd.nextInt(46)+1; //1 ~ 46
//			set.add(rdNumber);			
//		}
		ArrayList<HashSet<Integer>> list  = new ArrayList<>();
		int gameCount = 5;
		final int MAXNUBER = 6;
		for (int i = 0; i < gameCount; i++) {
			//set.clear();
			set = new HashSet<>();
			while (true) {
				int rdNumber = rd.nextInt(46)+1; //1 ~ 46
				set.add(rdNumber);
				if(set.size() >= MAXNUBER) {
					break;
				}
			}
			list.add(set);
		}
		// 출력
		for (HashSet<Integer> data : list) {
			System.out.println(data);
		}


	}

}
