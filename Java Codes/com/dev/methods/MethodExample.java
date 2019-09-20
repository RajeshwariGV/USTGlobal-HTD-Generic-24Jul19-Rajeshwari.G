package com.dev.methods;

public class MethodExample {
	
	
	static int j = 0;
	
    
	static MethodExample me = new MethodExample();


	public static void main(String[] args) {
		
		
		j = calcArea(6);
		System.out.println("Area of square is: "+j);
		int area1 = me.areaRec(2,4);
		System.out.println("Area of Rectangle: "+area1);
		

	}
    
	public static int calcArea(int side) {
		int t = side*side;
		int n = me.areaRec(4, 8);
		System.out.println(n);
		return t;
	}
		public int areaRec(int len,int Width) {
			j = len*Width;
			return j;
		}
	}


