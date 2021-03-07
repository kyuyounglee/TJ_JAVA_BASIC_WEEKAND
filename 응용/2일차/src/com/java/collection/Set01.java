package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/*
 * SET 중복을 허용하지 않는다.
 * 순서를 보장하지 않는다
 * key 속성을 표현할때 사용한다.(ex 주민번호,자동차번호,제품의 바코드)
 */
public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(3);set.add(2);set.add(1);set.add(3);
		System.out.println(set);		
		
		ArrayList<Integer> list = new ArrayList<>(set);
		System.out.println(list);
		System.out.println(list.get(1));
		
		Random rd = new Random();
		
		// 리스트 초기화
		list = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			list.add(rd.nextInt(46));
		}
		// 출력
		System.out.println(list);
		// 중복 제거
		set = new HashSet<>(list);
		System.out.println(set);
		
	}

}
