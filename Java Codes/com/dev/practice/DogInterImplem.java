package com.dev.practice;

import java.util.HashSet;

public class DogInterImplem implements DogInterface {
	
	HashSet<Dog> hs = new HashSet<Dog>();
	@Override
	public boolean addData(Dog dog) {
		System.out.println("Adding data :");
		if(dog!=null) {
			hs.add(dog);
			return true;
		}
		    return false;
		   
	   }


@Override
public void getData() {
	System.out.println("getting data :"+hs);
	

}
@Override
public boolean removeData(Dog dog) {
	System.out.println("remove data :");
	boolean b = hs.remove(dog);
	   if(b) {
		   return true;
	   }  

	return false;
}
}




