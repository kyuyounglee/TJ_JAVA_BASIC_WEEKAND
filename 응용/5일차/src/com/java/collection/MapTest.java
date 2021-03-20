package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("일",  1);
		map.put("이", 2);
		map.put("삼",  3);
		System.out.println(map); // toString() override		
		// 입력순서를 유지하지 않는다 - Set의 속성을 가지고 있어서
		// update
		map.put("이", 22);
		System.out.println(map);
		// 특정 키의 값
		int result =  (Integer)map.get("이");
		System.out.println(result);
		// 값이 있 는지 확인
		boolean isContain =  map.containsKey("삼");
		System.out.println(isContain);
		isContain =  map.containsValue(22);
		System.out.println(isContain);
		
		// for문을 이용하는 방법
		// 1 key를 기준
		System.out.println(map.keySet());
		for (String key : map.keySet()) {
			System.out.println(key + "," + map.get(key));
		}
		
		
		
	}

}
