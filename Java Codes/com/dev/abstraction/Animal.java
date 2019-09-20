package com.dev.abstraction;

public abstract class Animal {
	public Animal() {
		System.out.println("Constructor of Animal class");
	}

	abstract void eat(); //abstract method has no body
	abstract void hunt();

}
