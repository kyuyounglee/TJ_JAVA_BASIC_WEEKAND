package com.java.object;

public class HumanTest {

	public static void main(String[] args) {
		
		Human a = new Human("이규영",100,20);	
		
		// ?? 객체를 생성할때.. 필요한 데이터를 전달해서
		// 한방에 객체를 생성할 수 없을까?
		// 객체생성시 반드시 동작하는 생성자
		// 그럼 생성자를 통해 , 즉 생성자는 메소드의 형태이기때문에
		// 생성자에 값을 전달할 수 있다.
		// 결론.. 객체생성시 필요한 데이터를 전달해서 객체를 만들면 된다.
		// 생성자를 용도에 맞게 만들어 쓴다		
		System.out.println(a.getName());
		System.out.println(a.getHeight());
		System.out.println(a.getWeight());
	}

}
