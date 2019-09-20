package com.dev.collections;
import java.util.HashSet;

public class EmployeeDetailsData {

	public static void main(String[] args) {
		HashSet<EmployeeDetails> hs =new HashSet<EmployeeDetails>();
		
		
		
		EmployeeDetails e1 = new EmployeeDetails();
		
		e1.setName("raji");
		e1.setId(100);
		e1.setEmail("raji@gmail.com");
		e1.setPassword("134156#$%");
        System.out.println("add() e1 details "+hs.add(e1));
        System.out.println(hs);
        

	}

}
