package com.java.object;
/**
 * 
 * 이름 신장 체중등을 멤버로 가지는 사람 클래스를 작성(자유롭게)
 * name  height  weight
 * 
 * 사용은 HumanTeset  
 * 객체생성
 * 멤버셋팅
 * 멤버출력
 *
 */
public class Human {
	// 변수 캡슐화 -> 은닉화
	private String name;
	private int height, weight;	
	
	// 생성자 => 자신의 클래스 이름을 메소드 이름으로 하는 special 한 메소드로서 리턴타입은 안적는다
	public Human(String n, int h, int w)
	{
		name = n;
		height = h;
		weight = w;
	}
	
	// shift + ctrl + s
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getHeight() {
		return height;
	}
	void setHeight(int height) {
		this.height = height;
	}
	int getWeight() {
		return weight;
	}
	void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}
