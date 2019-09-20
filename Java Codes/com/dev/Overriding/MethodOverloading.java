package com.dev.Overriding;

public class MethodOverloading {
	static MethodOverloading mo = new MethodOverloading();
	
	public void print() {
		System.out .println("This is print method with no-arg");//it is possible with same method names
	}
	
	 private int print(int i) {
	
		System.out .println("This is print method with no-arg");//not possible to create same method with same arguments
		return 1;
	}
	static String print(String str) {
		System.out.println("This is print method with string arg");
		return"A";
		
			}
	

	public static void main(String[] args) {
      mo.print();	

	}

}
