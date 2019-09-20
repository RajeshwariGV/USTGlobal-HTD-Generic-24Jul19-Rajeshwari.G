package com.dev.assignment;

public class ReversingString {
	public void reverse(String s) {
		System.out.println("original string : "+s);
		String revS = "";
		for(int i = s.length()-1;i>=0;i--) {
			revS = revS + s.charAt(i);
			
		}
		System.out.println("reverse of string : "+revS);
	}
public static void main(String[] args) {
	ReversingString s = new ReversingString();
	s.reverse("Hello");
}
}