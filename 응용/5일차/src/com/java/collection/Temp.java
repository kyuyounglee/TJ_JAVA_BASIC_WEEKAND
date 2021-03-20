package com.java.collection;

public class Temp {
	// 맴버 변수
	// 맴버 변수를 적절하게 초기화 할수 있는 생성자를 추가
	// 일반 메소드
	private int data;	
	
	// 기본 디폴트 생성자 존재( 아무생성자가 없을때)
	// 리턴타입을 기술하지 않는 메소드, 메소드이름은 정해져있다.클래스명
	Temp( int data){
		this.data = data;
	}
	// 기본생성자
	Temp(){
		
	}
	// 생성자를 만들면.. 기본제공되는 생성자는 삭제	
	
//	void setData(int data){
//		this.data = data;
//	}
//	
//	int getData(){
//		return data;
//	}
	//shift + alrt + s or  Soucr라는 메뉴

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
//	@Override
//	public boolean equals(Object obj) {
//		Temp t = (Temp)obj;		
////		if(this.data == t.data)
////			return true;
////		else return false;
//		return this.data == t.data;		
//	}
	@Override
	public String toString() {
		return "Temp [data=" + data + "]";
	}
	@Override
	public int hashCode() {
		String name = "";
		
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + data;
		return (name+data).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temp other = (Temp) obj;
		if (data != other.data)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
