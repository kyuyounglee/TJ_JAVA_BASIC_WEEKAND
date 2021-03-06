package com.java.phone;

/**
 * 
 * 상속: 기존클래스를 확장해서 새로운 클래스를 만드는것 키워드 : extends
 */
public class SmarthPhone extends Phone {
	// 부모의 요소들을 상속받는다..
	// private을 제외한 모든 것
	private String appName;

	// 초기화는 4개의 변수를 초기화
	// 사용자가 생성자를 코딩하지 않으면
	// 기본적으로 기본생성자는 제공하고 있다.
	public SmarthPhone() {
		this("","","",""); // 생성자 위임
	}

	public SmarthPhone(String name,String color,String company, String appName) {
		super(name,color,company); // 생성자 위임		
		this.appName = appName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void installApp() {
		System.out.println("앱 설치");
	}

	@Override
	public String toString() {
		String str =  super.toString();
		return str + " SmarthPhone [appName=" + appName + "]";
	}

	@Override
	public void call() {
		System.out.println("잠금해제하고 전화를 받는다");
	}
	
	

}
