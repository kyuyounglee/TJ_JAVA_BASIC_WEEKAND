package com.java.it;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ItDemo2 {

	public static void main(String[] args) {
		// random
		Random rd = new Random();
		List<Integer> list = new ArrayList<>();
		// for 이용해서 램덤한 숫자 5 (0 ~100)
		for (int i = 0; i < 5; i++) {
			list.add(rd.nextInt(100));
		}
		System.out.println(list);
		
		// 복사에는 깊은복사(테이터는 같으나 서로다른 객체) 
		// 얖은복사(데이터만 같은 형태)
		
		// 기존 list 의 데이터를 또다른 list2에 복사해보자
		// 얕은복사
		List<Integer> list2 = list;
		
		// 깊은복사
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list);
		
//		for (int i = 0; i < list.size(); i++) {
//			list3.add(list.get(i));
//		}
		
		
		
		
		System.out.println("복사한 list2");
		System.out.println(list2);
		System.out.println("복사한 list3");
		System.out.println(list3);
		// 짝수를 찾아서 제거해 보자
		// 아래코드는 index를 알수 없다
//		for (Integer i : list) {
//			if(i %2 == 0) {
//				// 해당 값을 가지고 있는 list 의 index를 통해 제거
//				list.remove(0);
//			}
//		}
//		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i) % 2 == 0)
//				list.remove(i);
//		}
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			if(it.next() % 2 == 0)
				it.remove();
		}
		System.out.println(list);
		System.out.println("복사한 list2 데이터");
		System.out.println(list2);
		System.out.println("복사한 list3 데이터");
		System.out.println(list3);
	}

}
