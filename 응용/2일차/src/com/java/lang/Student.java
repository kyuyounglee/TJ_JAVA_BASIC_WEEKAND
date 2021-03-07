package com.java.lang;

public class Student implements Cloneable{
	String name;
	int age;
	public Student() {
		this("",0);
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 매개변수의 다형성
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student t = (Student)obj;
			if(this.age == t.age && this.name.equals(t.name))
				return true;			
		}
		return false;		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {		
		return super.clone();
	}

		
	
	
}
