package com.java.generic;

import java.util.List;

import com.java.data.Student;

public class GenericEX {

	public static void main(String[] args) {
		NoGeneric nogen = new NoGeneric();
		
		Object[] a = {1,2,3};
		nogen.setV(a);
		for (Object ob : nogen.getV()) {
			System.out.println((Integer)ob);
		}
		nogen.setV( new Student[] {new Student(),new Student()}  );
		for (Object ob : nogen.getV()) {
			Student temp = (Student)ob;
			System.out.println(temp);
		}
		////////////////////////////////////////
		Generic<Student> gen = new Generic<>();
		gen.setV(new Student[] {new Student(), new Student()});
		for (Student s : gen.getV()) {
			System.out.println(s);
		}		
	}

}
