package com.java.excute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java.data.Student;

public class StudentDemo {

	public static void main(String[] args) throws IOException {		
		Map<String, String> map = new HashMap<>();
		map.put("국어", "A");
		
		Student st1 
		= new Student("홍길동","조선팔도",2010001
				,new HashMap<>());
		
		Student st2 
		= new Student("철수","서울시",2010002
				,map);
		
		Student st3 
		= new Student("영희","용인시",2010003
				,new HashMap<String,String>() {
			{
					put("국어","A");
					put("영어","B");
					put("수학","C");
			};
		}
		);
		
		// Student 객체를 관리하는 방법
		// 1. 배열
		// 2 Collection FrameWork - List 계열의 ArrayList
		
		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);		
		
		// 리스트에 담긴데이터 확인하기
		//System.out.println(list);
		
		//System.out.println(list.get(0));
		//System.out.println(list.get(1));
		
		// list 데이터 전부 출력하기  향상된 for문		
		for (Student s : list) {
			System.out.println(s);
		}
		
		// 같은 학생을 정의
		// 두개의 객체가 같다고 볼수 있는 조건이나 요소는 뭘까?
		// 이름 속성이 같으면 두 객체는 같다
		//Scanner sc = new Scanner(System.in);
		
//		list.sort(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {				
//				return -(o1.getId() - o2.getId()) ;
//			}
//		});
		list.sort(null);
		
		System.out.println("기본정렬후");
		for (Student s : list) {
			System.out.println(s);
		}
		
		
		list.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return -(o1.getAddr().compareTo(o2.getAddr()));				
			}
		});
		
		System.out.println("주소를 기준으로 정렬");
		for (Student s : list) {
			System.out.println(s);
		}
	}

}
