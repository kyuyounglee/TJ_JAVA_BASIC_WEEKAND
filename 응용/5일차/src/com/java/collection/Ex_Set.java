package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex_Set {

	public static void main(String[] args) {
		// Type String
//		1. 해시 세트의 끝에 지정된 요소를 추가하는 Java 프로그램을 작성하십시오(지정된요소 - 적당한 데이터)
		Set<String> set = new HashSet<>();
		set.add("Red");
		set.add("Green");
		set.add("Black");
		set.add("White");
		set.add("Pink");
		set.add("Yellow");
		System.out.println(set);		
//		2. 해시 목록의 모든 요소를 ​​반복하는 Java 프로그램을 작성하십시오(순환문)
		for (String s : set) {
			System.out.println(s);
		}
//		3. 해시 세트의 요소 수를 가져 오는 Java 프로그램을 작성하십시오.(데이터의 갯수)
		System.out.println("요소의 개수는 : "+set.size());
//		4. 해시 세트를 다른 해시 세트로 복제하는 Java 프로그램을 작성하십시오.
		Object obj =  ((HashSet<String>)set).clone();
		HashSet<String> copySet = (HashSet<String>) obj;
		System.out.println(set);
		System.out.println(copySet);
		
//		5. 해시 세트를 비우는 Java 프로그램을 작성하십시오.
		copySet.removeAll(copySet);
		System.out.println(copySet);		
		
//		6. 해시 세트가 비어 있는지 여부를 테스트하는 Java 프로그램을 작성하십시오.
		if(copySet.isEmpty())
			System.out.println("비어있음");
		else
			System.out.println("비어있지 않음");//		
//		7. 해시 세트를 배열로 변환하는 Java 프로그램을 작성하십시오. (배열 형태로 전환)
		String[] strArry = new String[set.size()];
		int i = 0;
		for (String s : set) {
			strArry[i++] = s;
		}
		System.out.println(Arrays.asList(strArry));
//		8. 해시 세트를 List / ArrayList로 변환하는 Java 프로그램을 작성하십시오.
		// 1 
		//List<String> converList = new ArrayList<>(set);
		
		// 2.
		//List<String> converList = new ArrayList<>();		
		//converList.addAll(set);
		
		// 3
		List<String> converList = new ArrayList<>();		
		for (String s : set) {
			converList.add(s);
		}
		
		System.out.println(converList);
		
//		9. 두 해시 세트를 비교하는 Java 프로그램을 작성하십시오. ( 같은면 yes 틀리면 no 라고 해서 새로운 리스트를 만드세요)
		// 기존 set은 일부만 추출하는 기능이 없어서
		// set을 list형태로 변경해서 원하는 값을 추출한다음.. 이걸 다시 set형태로 변경
		List<String> subList =  converList.subList(1, 4);		
		Set<String> subSet = new HashSet<>(subList);
		System.out.println(subSet);
		// set에 있는 데이터를 subSet이 가지고 잇는지 비교 해서 있으면 yes 없으면 no
		List<String> yesno = new ArrayList<>();
		for (String s : set) {
			if(subSet.contains(s)) {
				yesno.add("yes");
			}else {
				yesno.add("no");
			}
		}
		System.out.println(yesno);
		
//		10. 두 세트를 비교하고 두 세트에서 동일한 요소를 유지하는 Java 프로그램을 작성하십시오. 
//		 (두개의 set 형태의 collection이 있는데. 두개를 비교해서 같은 값을 추출하고 그 값들을 가지는 리스트를 만드세요)
		// set subSet
		Set<String> targetSet = new HashSet<>();
		targetSet.add("Red");
		targetSet.add("Green");
		targetSet.add("Black2");
		targetSet.add("White");
		targetSet.add("Pink2");
		targetSet.add("Yellow");
		Set<String> setEquals = new HashSet<>();
		for (String s : set) {
			if(targetSet.contains(s))
				setEquals.add(s);
		}
		System.out.println(setEquals);
//		 11. 해시 세트에서 모든 요소를 ​​제거하는 Java 프로그램을 작성하십시오.
		set.clear();
		System.out.println(set.size());
		set.removeAll(set);
		System.out.println(set.size());	

	}

}
