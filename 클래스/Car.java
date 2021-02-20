package com.java.object;
/**
 * 
 * 필드 : 변수들(모든타입)
 * 생성자 : 객체생성할때 자동으로 호출되는메서드
 * 메서드(함수) : 기능
 * 리턴타입(void)  함수명(파라메터){}
 */
public class Car {
	// 필드
	private String type;	// 승용차 트럭 버스 = 용도
						// or 5인승 7인승,9인승 12인승, 다인승 = 인원
	String color;	// 색상
	int distance;	// 주행거리
	
	// 기본생성자
	Car(){
		System.out.println("기본생성자 호출되었습니다.");
	}
	
	boolean setType(String t) {
		if(t == "승용차" || t == "버스" || t=="트럭") {
			type = t;
			return true;
		}else {
			System.out.println("잘못된 타입입니다.");
			return false;
		}
	}
	
	String getType() {
		return type;
	}
	// type의 형태에 따른 종류들을 반환하는 메소드
	String[] getTypes(String kind){
		String[] ary;
		if(kind=="용도") {
			ary = new String[3];
			ary[0] = "승용차";
			ary[1] = "버스";
			ary[2] = "트럭";
		}else if( kind == "인원") {
			ary = new String[5];
			ary[0] = "5인승";
			ary[1] = "7인승";
			ary[2] = "9인승";
			ary[3] = "12인승";
			ary[4] = "다인승";
		}else {
			ary = new String[0];
		}
		return ary;
	}
}
