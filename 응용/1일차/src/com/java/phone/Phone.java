package com.java.phone;

/**
 * 
 * 상속을 받지 않으면 기본적으로 Object를 상속받은것으로 처리한다
 *
 * 맴버 변수 메소드 접근제한자 public private protected 생략
 */
public class Phone {

	protected String name;
	protected String color;
	protected String company;

	// shift + alt + s
	// 리턴타입 메소드이름( ) { }
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	// 맴버변수를 초기화 할 수 있는 적절한 생성자를 작성
	// 리턴타입을 명시하지 않는다
	// 객체생성시 자동으로 호출 - 외부에서 임의로 호출 불가능
	// 메소드이름은 정해져 있다..--> 클래스이름

	// 생성자 중에서도 매개변수가 없는 생성자는 개본생성자
	// Phone ph = new Phone();
	// Phone()
	public Phone() {

	}

	// 매개변수 생성자
	public Phone(String name, String color, String company) {
		// super();
		this.name = name;
		this.color = color;
		this.company = company;
	}

	// 외부에서 객체를 print하면 내부의 toString() 호출하게 되어 있음

	@Override
	public String toString() {
		return "Phone [name=" + name + ", color=" + color + ", company=" + company + "]";
	}

	// int a;
	// int b = 100;

	// 생성자는 따로 생성하지 않으면 기본생성자가 제공된다.
	// 그런데.. 필요에 의해서 매개변수 생성자를 만들면
	// 기본생성자는 더 이상제공하지 않기 때문에 사용자가 만들어 줘야 한다
	// 생성자는 아예 안만들거나.
	// 만들면... 반드시 기본생성자도 같이 만들어준다.
	// 생성자는 내부에서 반드시 부모의 기본생성자를 호출한다.(코딩안해도..)
	// 그런데 필요에 의해서 부모의 다른생성자를 호출하고 싶으면
	// super키워드를 사용해서 적합한 부모의 생성자를 호출한다.
	// 이때 기본으로 제고하던 super() 는 사용자가 호출한 생성자로 대체된다.
	
	
	public void call() {
		System.out.println("전화를 건다");
	}
	public void receive() {
		System.out.println("전화를 받다");
	}
	
	// overload
	public void receive(int a) {
		System.out.println("전화를 받을까 말까");
	}
	// 에러 함수중복
//	public void receive(int a)
//	{
//		System.out.println("전화를 받을까 말까2");
//	}
	
}
