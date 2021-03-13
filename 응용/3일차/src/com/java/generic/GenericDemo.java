package com.java.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.java.data.Student;

public class GenericDemo {
//	static void showList(List<Integer> listInt) {
//		for (Integer i : listInt) {
//			System.out.println(i);
//		}
//	}
//	
//	static void showList2(List<Double> listDouble) {
//		for (Double i : listDouble) {
//			System.out.println(i);
//		}
//	}
//	
//	static void showList3(List<String> listString) {
//		for (String i : listString) {
//			System.out.println(i);
//		}
//	}
	static <T> void showList(List<T> list) {
		for (T i : list) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// 리스트에 담긴데이터를 확인하는 기능

		// 정수형 리스트 만들고 적당한데이터를 추가
		// double
		// String
		List<Integer> listInt = new ArrayList<>();
		List<Double> listDouble = new ArrayList<>();
		List<String> listString = new ArrayList<>();
		List<Student> listStudent = new ArrayList<>();

		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			listInt.add(rd.nextInt(100));
			listDouble.add(rd.nextDouble());
			listString.add("String_" + rd.nextInt(100));
			listStudent.add(new Student("String_" + rd.nextInt(100), "String_" + rd.nextInt(100), 0, null));
		}
		showList(listInt);
		showList(listDouble);
		showList(listString);
		showList(listStudent);

	}

}
