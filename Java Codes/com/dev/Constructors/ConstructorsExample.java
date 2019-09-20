package com.dev.Constructors;

public class ConstructorsExample {
	
	public ConstructorsExample() {
		System.out.println("This const is with no-arg ");
	}


	public ConstructorsExample(int i) {
		System.out.println("This const is with int arg");
	}
	
	public ConstructorsExample(String s) {
		System.out.println("This const is with String arg");	
	}
    
	public ConstructorsExample(int i,String s) {
		System.out.println("This const is with int arg and String arg");	
	}

	
	public ConstructorsExample(String s,int i) {
		System.out.println("This const is with String arg and int arg");	
	}

	public static void main(String[] args) {
		ConstructorsExample ce = new ConstructorsExample();
		ConstructorsExample ce1 = new ConstructorsExample(1);
		ConstructorsExample ce2 = new ConstructorsExample("A");
		ConstructorsExample ce3 = new ConstructorsExample("A",1);
		ConstructorsExample ce4 = new ConstructorsExample(1,"A");
	}
}
