package com.java.data;

import java.util.HashMap;
import java.util.Map;

/**
 * 이름 주소 학번 학점 수강과목
 *
 */
public class Student implements Comparable<Student> {

	protected String name, addr;
	protected int id;
	protected Map<String, String> hakjum;

	public Student() {
		this("", "", 0, new HashMap<>());
	}

	public Student(String name, String addr, int id
			, Map<String, String> hakjum) {
		super();
		this.name = name;
		this.addr = addr;
		this.id = id;
		this.hakjum = hakjum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public Map<String, String> getHakjum() {
		return hakjum;
	}

	public void setHakjum(Map<String, String> hakjum) {
		this.hakjum = hakjum;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", id=" + id + ", hakjum=" + hakjum + "]";
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Student target = (Student) obj;
			if (this.name.equals(target.name)) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int compareTo(Student o) {		 
		return -(this.id - o.id);
	}

}
