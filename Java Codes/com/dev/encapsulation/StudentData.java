package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRegno(16850413);
		s.setName("Raji");
	    s.setEmail("raji@gmail.com");
	    s.setPassword("8008");
	    
	  int regno =  s.getRegno();
	  System.out.println("Regno : "+s.getRegno());
	  System.out.println("Name : "+s.getName());
	  System.out.println("Email : "+s.getEmail());

	}

}
