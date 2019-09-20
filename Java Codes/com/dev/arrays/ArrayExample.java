package com.dev.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int []intArr;
		char[] chArr;
		byte byteArr[];
		
		intArr = new int[5];
		chArr = new char[5];
		byteArr = new byte[5];

		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		
		int res = intArr[1] * 3;
		int add = intArr[1] + 3;
		int sub = intArr[3] - 5;
		int div = intArr[4] / 4;
		int mod = intArr[3] % 4;

		System.out.println("Mul: "+res);
		System.out.println("Add: "+add);
		System.out.println("Sub: "+sub);
		System.out.println("Div: "+div);
		System.out.println("Mod: "+mod);
		
	}

}
