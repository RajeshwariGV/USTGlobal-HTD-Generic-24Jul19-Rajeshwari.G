package com.dev.Overriding;

public class ArithmeticOperations {
	
	public int add(int a, int b,int d) {
		int c=a+b+d;
		System.out.println("Addition of two Numbers :"+c);
		return 1;
	}
	
	public int sub(int a, int b, int e) {
		int c=a-b;
		System.out.println("Subtraction of two Numbers :"+c);
		return 1;
	}
	public int mul(int a, int b,int s,int d) {
		int c=a*b*s*d;
		System.out.println("Multiplication of two Numbers :"+c);
		return 1;
	}
	public int div(int a, int b, int g,int r) {
		int c=a/b/g/r ;
		System.out.println("Division of four Numbers :"+c);
		return 1;
	}
	public int mod(int a, int b,int e,int d) {
		int c=a%b%e%d;
		System.out.println("Mod of four Numbers :"+c);
		return 1;
	}

	public static void main(String[] args) {
		
		ArithmeticOperations ao = new ArithmeticOperations();
 ao.add(10,20,10);
 ao.sub(23,10,43);
 ao.mul(2, 3,4,6);
 ao.div(10, 2,45,60);
 ao.mod(16,8,34,23);
 
	}

}
