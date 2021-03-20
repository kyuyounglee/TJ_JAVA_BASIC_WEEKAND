package com.java.lamda;

public class LamdaEx01 {

	public static void main(String[] args) {
		normalClass nc = new normalClass();
		nc.show();
		
		// 인터페이스에 명시되어 있는 메소드를 사용하고 싶으면
		// 인터페이스를 상속받은 클래스를 만들고 메소드를 구현하면된다.
		// 그리고 객체만들어서 사용함
		ExInter01 exi = new ExInter01();
		exi.interShow();
		
		// 익명 = 이름이 없다
		// 익명 객체를 사용
		// 불필요한 객체를 사용안함
		(new ExInter01()).interShow();
		
		
		// 익명클래스
		// 불필요한 클래스를 만들지 않는다
		new inter01() {			
			@Override
			public void interShow() {				
				System.out.println("익명클래스의 구현");
			}
		}.interShow();
		
		// 람다는 기존의 익명방식과 다형성을 합친거
		// 인터페이스 형태의 객체를 표현하는 기존방식
		inter01 a = new ExInter01();
		a.interShow();	
		
		// 람다		
		inter01 b = ()->{
			System.out.println("람다표현");
		};
		
		b.interShow();

	}

}

// 인터페이스 에 있는 메소드는 상속을 통해서 odverride 해야 한다.(구현해야 한다.)
class ExInter01 implements inter01{
	@Override
	public void interShow() {		
		System.out.println("inter01");
	}
}

interface inter01{
	void interShow();
}

class normalClass{
	void show() {
		System.out.println("hello");
	}
		
}

