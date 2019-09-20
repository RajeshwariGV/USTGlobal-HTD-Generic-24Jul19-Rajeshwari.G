package com.dev.assignment;

public class ArrayElement {
	static void ArrayElement(int a[]) {
		int first = a[0];
		int mid=a[(a.length-1)/2];
		int secondLast = a[a.length-2];
		int sum =first+mid+secondLast;
		System.out.println("firstElement="+first);
		System.out.println("midElement="+mid);
		System.out.println("secondLastElement="+secondLast);
		System.out.println("sum of first , mid and last element="+sum);
		
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		ArrayElement(a);     

	}

}
