package com.java.object;
/**
 * 
 * �̸� ���� ü�ߵ��� ����� ������ ��� Ŭ������ �ۼ�(�����Ӱ�)
 * name  height  weight
 * 
 * ����� HumanTeset  
 * ��ü����
 * �������
 * ������
 *
 */
public class Human {
	// ���� ĸ��ȭ -> ����ȭ
	private String name;
	private int height, weight;	
	
	// ������ => �ڽ��� Ŭ���� �̸��� �޼ҵ� �̸����� �ϴ� special �� �޼ҵ�μ� ����Ÿ���� �����´�
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
