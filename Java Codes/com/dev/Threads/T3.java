package com.dev.Threads;

public class T3 extends Thread{

	public void run() {
        
		
		System.out.println("T3 thread started...");		
		
		for(int k = 1;k<=10;k++) {
			System.out.println("k=   "+k);
		}
		
		System.out.println("T3 thread terminated...");
		
	}

	}


