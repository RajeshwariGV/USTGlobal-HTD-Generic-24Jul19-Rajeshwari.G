package com.dev.Threads;

public class Printer2 {
   

 synchronized public void printVal(int i,String thread) {
	  for(int j =0;j<=i;j++) {
		  
		System.out.println("Thread: "+thread+" "+" j="+j);
		  
	  }
  }


}
