package com.dev.Overriding;

public class Child extends Parent {
	@Override
	public void m1() {      //private,static methods can not be overriden
		System.out.println("m1() in Child class ");
	}
	
	public void m2() {      
		System.out.println("m2() in Child class ");
	}

	public static void main(String[] args) {
		
		Child c = new Child();
	
		c.m1();
		c.m2();
		Parent p = new Parent();
        p.m1();
	}

}
