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
		map.put("����", "A");
		
		Student st1 
		= new Student("ȫ�浿","�����ȵ�",2010001
				,new HashMap<>());
		
		Student st2 
		= new Student("ö��","�����",2010002
				,map);
		
		Student st3 
		= new Student("����","���ν�",2010003
				,new HashMap<String,String>() {
			{
					put("����","A");
					put("����","B");
					put("����","C");
			};
		}
		);
		
		// Student ��ü�� �����ϴ� ���
		// 1. �迭
		// 2 Collection FrameWork - List �迭�� ArrayList
		
		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);		
		
		// ����Ʈ�� ��䵥���� Ȯ���ϱ�
		//System.out.println(list);
		
		//System.out.println(list.get(0));
		//System.out.println(list.get(1));
		
		// list ������ ���� ����ϱ�  ���� for��		
		for (Student s : list) {
			System.out.println(s);
		}
		
		// ���� �л��� ����
		// �ΰ��� ��ü�� ���ٰ� ���� �ִ� �����̳� ��Ҵ� ����?
		// �̸� �Ӽ��� ������ �� ��ü�� ����
		//Scanner sc = new Scanner(System.in);
		
//		list.sort(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {				
//				return -(o1.getId() - o2.getId()) ;
//			}
//		});
		list.sort(null);
		
		System.out.println("�⺻������");
		for (Student s : list) {
			System.out.println(s);
		}
		
		
		list.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return -(o1.getAddr().compareTo(o2.getAddr()));				
			}
		});
		
		System.out.println("�ּҸ� �������� ����");
		for (Student s : list) {
			System.out.println(s);
		}
	}

}
