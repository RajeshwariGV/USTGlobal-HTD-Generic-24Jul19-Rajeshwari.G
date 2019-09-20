package com.dev.array1;

public class ArraysExample2 {

	public static void main(String[] args) {
		int[] intArr = new int[5];
		
		intArr[0] = 1;//
		
        
		int[] intArr2 = {11,22,33,44,55};
		System.out.println(intArr2[3]);// if u give 5  it will show error array index out of bound exception
		System.out.println("Length of the 2nd array: "+intArr2.length);
	}

}
