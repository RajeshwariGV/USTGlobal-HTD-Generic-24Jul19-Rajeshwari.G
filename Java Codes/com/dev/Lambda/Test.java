package com.dev.Lambda;

public class Test {

	public static void main(String[] args) {
		FunctionalInterface f = ()->{
			try {
				int i = 10/5;
				System.out.println(i);
			}catch(Exception e) {
				System.out.println("Eception..");
			}
			};
			
			FunctionalInterface f2 = ()->{
				int i = 0;
				for(int j = 1;j<= i ;j++) {
					System.out.println(j);
				}
			};
			
		
   f.printVal();
  
   
	}
}


