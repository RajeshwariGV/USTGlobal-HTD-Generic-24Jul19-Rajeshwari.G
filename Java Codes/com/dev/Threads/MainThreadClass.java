package com.dev.Threads;

public class MainThreadClass {

	public static void main(String[] args) {
		System.out.println("Main thread started...");
		System.out.println("MainThreadClass prints the value of i");
		
		
		T2 t2 = new T2();
		t2.setName("Thread T2");
		t2.start();
		
		T3 t3 = new T3();
		Thread t = new Thread(t3);
		t.start();
		
		
		Thread.currentThread().setName("Main Thread");
		
		for(int i = 1;i<=10;i++) {
			System.out.println("i = "+i);
		}
		System.out.println("Thread Name2: "+t2.getName());
		System.out.println("Thread Name1: "+Thread.currentThread().getName());
		System.out.println("Thread2 id: "+t2.getId());
		System.out.println("Thread3 id: "+t.getId());
		System.out.println("Main Thread id: "+Thread.currentThread().getId());
		System.out.println("Main Thread priority: "+Thread.currentThread().getPriority());
		System.out.println("Main thread terminated...");
	
		
	}

}
