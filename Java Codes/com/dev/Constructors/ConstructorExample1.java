package com.dev.Constructors;

public class ConstructorExample1 {
	public ConstructorExample1(float f) {
		System.out.println("This const wint float arg");
	}
	
	public ConstructorExample1(int i,double d) {
		System.out.println("This const wint int i arg and double d");
	}
	
	public ConstructorExample1(int i,char c) {
		System.out.println("This const wint int i arg and char c");
	}

	public static void main(String[] args) {
		
		ConstructorExample1 ce = new ConstructorExample1(3.4f);
		ConstructorExample1 ce1 = new ConstructorExample1(2,44);
		ConstructorExample1 ce2 = new ConstructorExample1(4,'a');
		
	}

}
