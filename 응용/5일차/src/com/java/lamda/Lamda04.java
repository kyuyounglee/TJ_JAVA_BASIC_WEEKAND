package com.java.lamda;

public class Lamda04 {

	public static void main(String[] args) {
		System.out.println("start");
		Runnable r1 = ()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("[thread1]:"+i);	
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable r2 = ()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("[thread2]:"+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		System.out.println("Terminate");
		
		new TestInterface() {
			
			@Override
			public void A() {
				// TODO Auto-generated method stub
				
			}
		};
		
		TestInterface tb = ()->{
			
		};
	}
}

@FunctionalInterface
interface TestInterface{
	void A();	
}

