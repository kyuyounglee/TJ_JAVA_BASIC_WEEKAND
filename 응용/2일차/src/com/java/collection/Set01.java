package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/*
 * SET �ߺ��� ������� �ʴ´�.
 * ������ �������� �ʴ´�
 * key �Ӽ��� ǥ���Ҷ� ����Ѵ�.(ex �ֹι�ȣ,�ڵ�����ȣ,��ǰ�� ���ڵ�)
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
		
		// ����Ʈ �ʱ�ȭ
		list = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			list.add(rd.nextInt(46));
		}
		// ���
		System.out.println(list);
		// �ߺ� ����
		set = new HashSet<>(list);
		System.out.println(set);
		
	}

}
