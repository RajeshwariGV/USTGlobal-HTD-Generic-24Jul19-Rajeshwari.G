package com.dev.Polymorpism;

public class CompiletimePolymorphism {
	
	static CompiletimePolymorphism p = new CompiletimePolymorphism();
	
	   public void add(int a, int b) {
	    int c=a+b;
	     System.out.println("addition of two num: a= "+a);
		 
	     }
       public void add(int a, int b, int c) {
       int e= a+b+c;
	   System.out.println("adiition of three num: "+e);			
	   }

      public void add(int a, int b, int c,int d) {
           int f= a+b+c+d;
    	   System.out.println("adiition of four num: "+f);
      }
    			
	public static void main(String[] args) {
    p.add(10,23);
    p.add(10,20,30);
    p.add(10,20,30,40);
    

     
	}

}	
	


