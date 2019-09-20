package com.dev.inheritance;

public class Father extends GrandFather {
	static Father f = new Father();
	
	@Override
	public void printName() {
		String name= "Raja";// String s= f.lastName;
    System.out.println(name+ " " +f.name+" "+f.name+"  "+f.lastName);
	}
	public static void main(String[] args) {
		f.printName();
    
	}
}
