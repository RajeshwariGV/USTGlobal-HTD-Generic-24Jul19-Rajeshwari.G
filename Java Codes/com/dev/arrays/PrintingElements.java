package com.dev.arrays;

public class PrintingElements {

	public static void main(String[] args) {
		int[] intArr = {11,22,33,44,55};
		int index = 4;
		if(index<intArr.length) {
			System.out.println("Valid Index");
			for(int i = 0;i<=index;i++) {
				System.out.println(intArr[i]);
			}
		}else { 
			System.out.println("Invalid Index");
		}
		

	}

}
