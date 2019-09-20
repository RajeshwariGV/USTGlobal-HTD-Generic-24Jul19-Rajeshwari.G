package com.dev.inheritance;

public class GrandFather {
	
	 static GrandFather g = new GrandFather();

	String lastName = "Gundam";
	 String name = "Venkatraidu";// we are declaring globally initially it was locally
	public static void main(String[] args) {
		g.printName();                                          //call this object

	}
   public void printName() {
	 //non-static thats y we r creating object
	   System.out.println(name+ " " +g.lastName);
   }
}
