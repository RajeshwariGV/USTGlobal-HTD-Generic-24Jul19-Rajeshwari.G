package com.dev.Threads;

public class SyncNMainThread2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("SyncMain Thread started..");
		
		Printer p =new Printer();
		
		T4 t4 = new T4(p);
		t4.start();   
		
		new T5(p).start();
		

		//new T4(p).start();
		
		//new T5(p).start();
		
		System.out.println("SyncMain Thread terminated...");
	}
}
		

	


