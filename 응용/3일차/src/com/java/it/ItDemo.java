package com.java.it;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ItDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		Random rd = new Random();		
		for (int i = 0; i < 5; i++) {
			list.add(rd.nextInt(100));
			set.add(rd.nextInt(100));
		}
		// ������ Ȯ��
		System.out.println(list);
		System.out.println(set);
		
		// �����͸� ���� ����غ��� - ��ȯ�� �̿�
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println();
		for (Integer i : set) {
			System.out.println(i);
		}		
		
		Iterator<Integer> it =  list.iterator();
		System.out.println("list iterator ���");
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		while (it.hasNext()) {
			System.out.println(it.next());			
		}
		
		
		
	}

}
