package com.java.lamda;

public class LamdaEx03 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("시작");		
		// Runable 타입의 객체를 전달
		// original
//		RunImp ri = new RunImp();
//		Thread t = new Thread(ri);
		
		// 익명클래스방식
//		Thread t = new Thread(new Runnable() {			
//			@Override
//			public void run() {
//				System.out.println("new Runnable()");				
//			}
//		});		
		
		// 람다식
		Runnable r = ()->{
			System.out.println("new Runnable()");
		};
		Thread t = new Thread(r);
		
		t.start();	
		System.out.println("종료");
	}
}

class RunImp implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

}
