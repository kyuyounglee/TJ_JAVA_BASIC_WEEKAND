package com.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		String[] subject = {"����","����"};
		String[] grade = {"A","B"};
		// ��� ���� ����
		for (int i = 0; i < subject.length; i++) {
			if(subject[i].equals("����")) {
				System.out.println(grade[i]);
			}
			
		}
		Map<String, String> map = new HashMap<>();
		map.put("����", "A");
		map.put("����", "B");
		// ��� ���� ����
		System.out.println(map.get("����") );
		System.out.println(map.get("����") );
		
		// map�� �����͸� �߰��Ҷ�...
		map.put("����", "A");
		map.put("����", "A+");
		System.out.println(map);
		
		map.remove("����");
		System.out.println(map);
		map.put("����", "A");
		System.out.println(map);
		
		
		List<String> list = new ArrayList<>();
		list.add("A");list.add("B");list.add("C");
		for (String s : list) {
			System.out.println(s);
		}
		// 1.  ��ȯ
		
		Set<String> keys =  map.keySet();
		System.out.println(keys);
		for (String s : keys) {
			System.out.println("key = "+s + " value = " + map.get(s));
		}
		
		// 2. ��ȯ
		Set<Entry<String, String>> entry =  map.entrySet();
		for (Entry<String, String> e : entry) {
			System.out.println("key = "+e.getKey() + " value = "+e.getValue());
		}
		
		// �˻�(Ű ������ ã����)
		if( map.get("����") != null) {
			System.out.println(map.get("����"));
		}
		
		if(map.containsKey("����")) {
			System.out.println(map.get("����"));
		}

	}

}
