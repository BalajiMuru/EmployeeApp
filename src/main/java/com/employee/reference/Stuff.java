package com.employee.reference;

public class Stuff {
	
//	public static void   dostuff() {
//		
//		
//		
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
//		System.out.println("I am doing task");
//		
//		
//	}
	
	public int myself() {
		return 17728834;
	}
//	

	public static void threadTask() {
		for(int i=0;i<=10;i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void myThread() {
		for(int i=0;i<=10;i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
