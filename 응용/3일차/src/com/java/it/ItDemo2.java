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
		// for �̿��ؼ� ������ ���� 5 (0 ~100)
		for (int i = 0; i < 5; i++) {
			list.add(rd.nextInt(100));
		}
		System.out.println(list);
		
		// ���翡�� ��������(�����ʹ� ������ ���δٸ� ��ü) 
		// �A������(�����͸� ���� ����)
		
		// ���� list �� �����͸� �Ǵٸ� list2�� �����غ���
		// ��������
		List<Integer> list2 = list;
		
		// ��������
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list);
		
//		for (int i = 0; i < list.size(); i++) {
//			list3.add(list.get(i));
//		}
		
		
		
		
		System.out.println("������ list2");
		System.out.println(list2);
		System.out.println("������ list3");
		System.out.println(list3);
		// ¦���� ã�Ƽ� ������ ����
		// �Ʒ��ڵ�� index�� �˼� ����
//		for (Integer i : list) {
//			if(i %2 == 0) {
//				// �ش� ���� ������ �ִ� list �� index�� ���� ����
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
		System.out.println("������ list2 ������");
		System.out.println(list2);
		System.out.println("������ list3 ������");
		System.out.println(list3);
	}

}
