package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * MAP
 * 1. map을이용해서 데이터를 저장(키와 벨류는 임의로)
 * 2. map을 만들고 iterator을 이용해서 출력(map 속성중에 entrySet() 의 iterator)
 * 3. map을 만들고 데이터를 넣고 모든 데이터를 삭제
 * 4. map에 데이터가 있는지 없는지 확인
 * 5. 기존 map 데이터를 또다른 map 형태로 복사(얕은복사 와 깊은복사 두가지모두 사용)
 * 6. map데이터의 value를 배열형태로 변환(배열구조를 만들어서 거기에 값을 배열 형태로저장)
 * 7. map 의 키와 벨류를 떼어내오 리스트형태로 저장(리스트형태로 만드세요)
 * 8. 임의의 클래스를 정의하고, 그 클래스를 list 와 set 과 map 형태로 저장 
 * 9. 보너스 : 8번에서 정의한 클래스에 맴버변수를 정의하고(없으면) 그 변수가 같으면
 *     객체가 같다고 정의하고 그래서 두개의 객체를 만들어서 같은지 비교
 *     그런다음... map 과 set에 해당 객체들을 넣었을때... 어떻게 되는지 
 *     (예   Student 클래스에 score라는 맴버변수가 있고.. 그들이 같으면 같다고 정의했을때
 *     Stuent s1 = new Student(100)
 *     Stuent s2 = new Student(100)
 *     if(s1.equals(s2)) --> true
 *     
 *     s1 과 s2객체를 list set map에 넣고 모든 요소를 확인해보자.
 *     
 *     
 */
public class MapSample {
	public static void main(String[] args) {	
		//1. map을이용해서 데이터를 저장(키와 벨류는 임의로)
		Map<String, String> map = new HashMap<>();
		map.put("a", "1223");
		map.put("b", "3221");
		//2. map을 만들고 iterator을 이용해서 출력(map 속성중에 entrySet() 의 iterator)		
		Iterator<String> it =  map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print(key+"\t");
			System.out.println(map.get(key));
			
		}
		
		Iterator<Entry<String, String>> itt =  map.entrySet().iterator();
		while (itt.hasNext()) {
			Entry<String, String> entry = itt.next();
			System.out.print(entry.getKey()+"\t");
			System.out.println(entry.getValue());
			
		}
		
		// 3. map을 만들고 데이터를 넣고 모든 데이터를 삭제
		//map.clear();
		
		// a, b, c, d
		// forEach는 업데이트를 제외하고 삭제나 추가와같이 집합의
		// 갯수를 변경하는걸 허락하지 않는다
		for (String key : map.keySet()) {
			//map.remove(key);
			//map.put("aaa", "bbbb");
			map.put("b", "1");
		}		
		
		// 키값을 따로 빼내서 각각 키를 이용해서 remove 한다
		Object[] str = new String[map.size()];
		int index = 0;
//		for (String key : map.keySet()) {
//			str[index++] = key;
//		}
		str =  map.keySet().toArray();
		
		
		for (Object s : str) {
			map.remove(s);
		}		
		System.out.println("map = " + map);
		
		//4. map에 데이터가 있는지 없는지 확인
		if(map.isEmpty()) {};
		if(map.size() !=0 ) {}
		boolean isEmpty = false;
		for (String key : map.keySet()) {
			if(!key.isEmpty()) {
				isEmpty = true;
				return;
			}
		}
		if(isEmpty) {}
		
		
		// 5. 기존 map 데이터를 또다른 map 형태로 복사(얕은복사 와 깊은복사 두가지모두 사용)
		map.put("a", "aa");
		map.put("b", "bb");
		// copyMap 두개의 객체가 같은 데이터를 바라본다.. .얕은복사
		// 어느한쪽의 객체를 이용해서 데이터를 변경하면 나머지 객체에도 영향을 준다
		Map<String, String> copyMap = map;
		
		//깊은복사
		HashMap<String, String> copyMap2 = new HashMap<>();
		Object clone =  ((HashMap<String, String>)map).clone();
		copyMap2 = (HashMap<String, String>) clone;
		System.out.println("copyMap2 = "+copyMap2);
		
		
		
		
		//6. map데이터의 value를 배열형태로 변환(배열구조를 만들어서 거기에 값을 배열 형태로저장)
		str = new String[map.size()];
		index = 0;
		for (String value : map.values()) {
			str[index++] = value;
		}
		System.out.println(Arrays.asList(str));
		
		
		// 7. map 의 키와 벨류를 떼어내오 리스트형태로 저장(리스트형태로 만드세요)
		// key 분류
		Set<String> s1 =  map.keySet();
		List<String> setList 
		= new ArrayList<>(map.keySet());
		
		//value
		Collection<String> c1 = map.values();
		List<String> valueList 
		= new ArrayList<>(map.values());
		
//		8. 임의의 클래스를 정의하고, 그 클래스를 list 와 set 과 map 형태로 저장
		Temp t = new Temp();
		// data에 100넣어보자
		t.setData(100);
		
		Temp t2 = new Temp(100);
		Temp t3 = new Temp(1500);
		Temp t4 = new Temp();
		t4.setData(200);
		t3.setData(200);
		
		List<Temp> tempList = new ArrayList<>();
		tempList.add(t);
		tempList.add(t2);
		tempList.add(t3);
		tempList.add(t4);
		
		Temp obj1 = new Temp(10);
		Temp obj2 = new Temp(10);
		// obj1과 obj2의 data값이 같으므로 두 객체가 같다고 표현		
		
		
		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(10);
		System.out.println(s.size());
		System.out.println(s);
		
		Set<Temp> ss = new HashSet<>();
		ss.add(obj1);
		ss.add(obj2);
		System.out.println(ss.size());
		System.out.println(ss);			
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.equals(obj2) );
		System.out.println(obj1 == obj2 );
		System.out.println("identityHashCode--------");
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		// 객체간의 비교는 반드시 equals라는 메소드를 사용
		
		Map<Temp, String> m = new HashMap<>();
		m.put(obj1, "객체1");
		m.put(obj2, "객체2");
		System.out.println("/////////////////");
		System.out.println(m.size());
		System.out.println(m);
		
	}
	
	

}
