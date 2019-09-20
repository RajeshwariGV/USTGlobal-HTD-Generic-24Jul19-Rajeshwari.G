package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Some String";
		String str1 = "SOmE StRING";
		int length = str.length();
		System.out.println("Output for length() "+ length);
		
		char[] ch = str.toCharArray();
		System.out.println("Output for toCharArray() "+ch[3]);
		
		char c = str.charAt(5);
		System.out.println("Output for charAt "+c);
		
		boolean b= str.contentEquals(str1);
		System.out.println("Output for equals "+b);
		  
		boolean b1 = str.equalsIgnoreCase(str1);
		System.out.println("Output for equalsIgnoreCase "+b);
		
		boolean v = str.contains("Som");
		System.out.println("Output for contains() "+v);
		
		
		String g = str.replace('S', 'A');
		System.out.println("Output for replace('S','A') "+g);
		
		int f = str.indexOf('S');
		System.out.println("Output for indexOf() "+f);
		
		String s = str.toUpperCase();
		System.out.println(s);
		
		String h = str.toLowerCase();
		System.out.println(h);
		
		String a = str.substring(3);
		System.out.println("Output for substring():"+a);
		
		String q = str.substring(3,11);
		System.out.println("Output for substring(int,int): "+q);
		
		
		
		
		
		
		
	}

}
