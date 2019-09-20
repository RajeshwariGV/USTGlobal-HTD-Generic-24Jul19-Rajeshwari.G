package com.dev.abstraction;

public class Fly extends Animal{

	public static void main(String[] args) {
		Fly f = new Fly();
		f.eat();
		f.hunt();
		
	}
	@Override
	void eat() {
		System.out.println("Bird eats Nuts");
	}
	@Override
	void hunt() {
		System.out.println("Bird hunts small Insects");
	}
	
	public Fly() {
		System.out.println("Constructor of fly class");

}
}
