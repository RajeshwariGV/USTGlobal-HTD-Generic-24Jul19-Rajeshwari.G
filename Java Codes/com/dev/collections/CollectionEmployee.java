package com.dev.collections;

import java.util.HashSet;

public class CollectionEmployee {

	public static void main(String[] args) {
		HashSet<EmployeeDetails> hs = new HashSet<EmployeeDetails>();

		EmployeeDetails E1 = new EmployeeDetails();
		
		E1.setName("Raji");
		E1.setId(413);
		E1.setEmail("raju@gmail.com");
		E1.setPassword("raji8008");
		
		
		EmployeeDetails E2 = new EmployeeDetails();
		E2.setName("sid");
		E2.setId(412);
		E2.setEmail("raja@gmail.com");
		E2.setPassword("raja8008");

		EmployeeDetails E3 = new EmployeeDetails();
		E3.setName("Ranjith");
		E3.setId(411);
		E3.setEmail("ranjith@gmail.com");
		E3.setPassword("raj8008");
		
		
		
		

        System.out.println("add() e1 details "+hs.add(E1));
        System.out.println("add() e2 details "+hs.add(E2));
        System.out.println("add() e3 details "+hs.add(E3));
        System.out.println(hs);

		

	}

}
