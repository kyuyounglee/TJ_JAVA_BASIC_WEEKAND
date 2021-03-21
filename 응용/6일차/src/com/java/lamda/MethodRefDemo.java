package com.java.lamda;


@FunctionalInterface
interface Mathematical{
	double calculate(double d);
}
class A implements Mathematical{
	@Override
	public double calculate(double d) {		
		return d*10;
	}	
}

class Test {	
	public static double Test_method(double a) {
		// non-static 이 없으면 된다
		return a*a*100;
	}
}



@FunctionalInterface
interface Pickable{
	char pick(String s, int i);
}

@FunctionalInterface
interface Computable{
	int compute(int x, int y);
}

class Utils{
	int add(int a, int b) {
		return a+b;
	}
}

public class MethodRefDemo {

	public static void main(String[] args) {		
		Mathematical m;
		Pickable P;
		Computable c;
		
		m = new A();
		m.calculate(10);
		
		new Mathematical() {
			public double calculate(double d) {				
				return d*10;
			}
		}.calculate(10);		
		m = d->d*d*100;
		m.calculate(10);
		
		Test t = new Test();		
		// 클래스의 함수의 refence를 가져올때  클래스명::메소드명
		// 객체::메소드
		// 객체로 참조표현을 쓸때는 해당 메소드가 non-static
		//  객체::메소드
		// static 메소드는 참조할때 
		// 클래스명::메소드
		m = Test::Test_method;
		m.calculate(10);
		
		
		
		
		
		// m 음 Math클래스의 abs 메소드를 참조한다
		m = (a)-> a * 10 ;
		System.out.println(m.calculate(-50.3));

		m= Math::abs;
		System.out.println(m.calculate(-50.3));
		
		// 문자열을 문자배열로 전환해서 i번째 인데스에 해당하는
		// 문자를 리턴한다
		P = (s, i) -> s.charAt(i);		
		System.out.println(P.pick("ABCDEFG", 2));
		
		P =  String::charAt;
		System.out.println(P.pick("ABCDEFG", 3));
		
		Utils ut = new Utils();
		
		c = (a,b)->a+b;
		c = (a, b) -> ut.add(a, b);
		// 함수의 refrence를 가져온다.. 즉 참조한다.
		c = ut::add;
		System.out.println(c.compute(20, 30));
		System.out.println(ut.add(20, 30));		
	}

}
