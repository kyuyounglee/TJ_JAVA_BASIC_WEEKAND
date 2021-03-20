package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Demo3 {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(list_Strings);

		for (String element : list_Strings) {
			System.out.println(element);
		}
		list_Strings.add(0, "Pink");
		list_Strings.add(5, "Yellow");

		String element = list_Strings.get(0);
		System.out.println("First element: " + element);
		element = list_Strings.get(2);
		System.out.println("Third element: " + element);
		
		list_Strings.set(1, "Yellow");
		list_Strings.remove(2);
		
		boolean isSearch =  false;
		for (String s : list_Strings) {
			if(s.equals("White"))
				isSearch = true;
			
		}
		if(isSearch)
			System.out.println("Found the Element");
		else
			System.out.println("There is no search Element");
		
		/////////////////////////////////////////////////////////////
		if(list_Strings.contains("red"))
			System.out.println("Found the Element");
		else
			System.out.println("There is no search Element");
		
		list_Strings.sort(null);
		Collections.sort(list_Strings);		
		System.out.println(list_Strings);
		
		// 깊은copy
		List<String> copyList = new ArrayList<>();
		System.out.println(copyList);
		
		for (String s : list_Strings) {
			copyList.add(s);
		}
		
		System.out.println(copyList);
		copyList.remove(0);
		System.out.println("list_Strings : "+list_Strings);
		System.out.println("copyList : "+copyList);
		
		
		//Collections.shuffle(copyList);
		Random r = new Random();
		r.nextInt(copyList.size());
		for (int i = 0; i < 10; i++) {
			String first = copyList.get(0);
			int index = r.nextInt(copyList.size());
			String target = copyList.get(index);
			copyList.set(0, target);
			copyList.set(index, first);
		}
		
		System.out.println("copyList : "+copyList);
		
		// 1~46 사이의 중복되지 않은 임의의 숫자 6개를 추려보자		
		Collections.reverse(copyList);
		System.out.println("copyList : "+copyList);		
		
		for (int i = 0, j=copyList.size()-1; i < copyList.size()/2; i++,j--) 
		{
			String first =  copyList.get(i);
			String second =  copyList.get(j);
			copyList.set(i, second);
			copyList.set(j, first);
		}
		System.out.println("copyList : "+copyList);
		
		
		// index 0부터 시작해서 3개를 가져와서 동일한 리스트형태로 반환한다.
		List<String> copyListSub =  copyList.subList(0, 3);
		System.out.println(copyListSub);
		
		
		// copyList 에 있는 요소가 copyListSub에 있는지 여부를 조사해서 yesno 에 담는다
		// contains
		
		// coplyListSub
		List<String> yesno = new ArrayList<>();
		for (int i = 0; i < copyList.size(); i++) {
			if(copyListSub.contains(copyList.get(i))) {
				yesno.add("yes");
			}else {
				yesno.add("no");
			}
			
		}
		
		// 리스트에서 두개의 값을 교환
		
		Collections.swap(copyListSub, 0, 2);
		
		// 두개의 리스트를 합쳐서 새로운 리스를 만든다..
		List<String> mergeList = new ArrayList<>();
		// 대상이 copyListSub   yesno
		// 합치기전 두개의 리스트 목록
		System.out.println("합치기전");
		System.out.println(copyListSub);
		System.out.println(yesno);
		
		mergeList.addAll(copyListSub);
		mergeList.addAll(yesno);
		System.out.println("합친후");
		System.out.println(mergeList);
		
		// mergeList  요소를 복사해서 새로운 객체를 만드는 (깊은복사)		
		ArrayList<String> deepCopy 
		= (ArrayList<String>) ((ArrayList<String>) mergeList).clone();
		
		System.out.println("deepCopy  원래의 값");
		System.out.println(deepCopy);
		//  다 지운다
		deepCopy.removeAll(deepCopy);		
		System.out.println(deepCopy);
		
		// 18
		// 리스트 객체의 내용이 없는지 판단하는 프로그램
		// -- 리스트가 비어있는지 여부를 판단해 보자
		System.out.println(deepCopy.size());
		if(deepCopy.size() == 0) {
			System.out.println("비어있다");
		}
		
		if(deepCopy.isEmpty()) {
			System.out.println("비어있다");
		}
		
		// 19 리스트는 내부에 배열알고리즘을 사용하고
		// 데이터를 추가할때 모라자면 2배씩 늘려서 사용 그래서 실제 사용안하는
		// 공간이 존재한다.
		// 실제 들어있는 데이터 크기만큼 리스트의 메모리를 재 조정
		deepCopy.trimToSize();
		
		
		
	}

}





