package com.dev.Threads;

public class T4 extends Thread {
	
	Printer p;
	
	public T4(Printer pref) {
		p = pref;
	}
	
	
	
	@Override
	public void run() {
		p.printVal(10,"Thread 4");
		}
	}

