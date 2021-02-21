package com.java.inheritance;
/**
 * 
 * 맴버변수가 있으면 이를 적절히 초기화 할수 있는 생성자가 필요하다
 *
 */
public class Phone {

	private String name,color,compay;

	// 맨밑에 매개변수가 있는 생성자를 만들면
	// 바로밑에 있는 기본생성자는 제공하지 않으므로 만들어 준다
	public Phone() {
		// 생성자를 호출할때는 생성자에서만 가능하며
		// 형식은 this() 이렇게 사용
		this("","","");
	}
	
	public Phone(String name, String color, String compay) {
		super();
		this.name = name;
		this.color = color;
		this.compay = compay;
	}

	void call() {
		System.out.println("전화를 건다");
	}
	void receive() {
		System.out.println("전화를 받는다");
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompay() {
		return compay;
	}

	public void setCompay(String compay) {
		this.compay = compay;
	}
	
	public void showData() {
		System.out.println(this.color);
		System.out.println(this.compay);
		System.out.println(this.name);
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", color=" + color + ", compay=" + compay + "]";
	}
	
	
	
	
}
