package com.dev.encapsulation;

public class PetsData {

	public static void main(String[] args) {
	 Pets p1 = new Pets();
	 Pets p2 = new Pets();
	 Pets p3 = new Pets();		
		p1.setAge(1);
		p1.setBreed("Dober Man");
		p1.setColor("Black");
		p1.setName("Shiro");
		
		
		p2.setAge(2);
		p2.setBreed("Female");
		p2.setColor("White");
		p2.setName("Kitty");
		 
		p3.setAge(3);
		p3.setBreed("Female");
		p3.setColor("Black&Brown");
		p3.setName("Kutti");
		 
		Pets [] p = {p1,p2,p3};
		
		for(int i=0; i<=p.length;i++) {
			System.out.println("Age: "+p[i].getAge());
			System.out.println("Name: "+p[i].getName());
			System.out.println("Color: "+p[i].getColor());
			System.out.println("Breed: "+p[i].getBreed());
			
		}
	}


	}


