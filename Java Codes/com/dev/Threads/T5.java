package com.dev.Threads;

public class T5 extends Thread{
	
		Printer p;
		
		public T5(Printer pref) {
			p = pref;
		}
		
		
		
		@Override
		public void run() {
			p.printVal(10,"Thread 5");
			}
		
	}



