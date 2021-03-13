package com.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		String[] subject = {"국어","영어"};
		String[] grade = {"A","B"};
		// 국어에 대한 학점
		for (int i = 0; i < subject.length; i++) {
			if(subject[i].equals("국어")) {
				System.out.println(grade[i]);
			}
			
		}
		Map<String, String> map = new HashMap<>();
		map.put("국어", "A");
		map.put("영어", "B");
		// 국어에 대한 학점
		System.out.println(map.get("국어") );
		System.out.println(map.get("영어") );
		
		// map에 데이터를 추가할때...
		map.put("수학", "A");
		map.put("국어", "A+");
		System.out.println(map);
		
		map.remove("수학");
		System.out.println(map);
		map.put("영어", "A");
		System.out.println(map);
		
		
		List<String> list = new ArrayList<>();
		list.add("A");list.add("B");list.add("C");
		for (String s : list) {
			System.out.println(s);
		}
		// 1.  순환
		
		Set<String> keys =  map.keySet();
		System.out.println(keys);
		for (String s : keys) {
			System.out.println("key = "+s + " value = " + map.get(s));
		}
		
		// 2. 순환
		Set<Entry<String, String>> entry =  map.entrySet();
		for (Entry<String, String> e : entry) {
			System.out.println("key = "+e.getKey() + " value = "+e.getValue());
		}
		
		// 검색(키 값으로 찾을때)
		if( map.get("국어") != null) {
			System.out.println(map.get("국어"));
		}
		
		if(map.containsKey("영어")) {
			System.out.println(map.get("영어"));
		}

	}

}
