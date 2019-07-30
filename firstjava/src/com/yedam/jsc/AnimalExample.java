package com.yedam.jsc;
abstract class Animal{
	public String kind;
	public void breathe() {
		System.out.println("见阑 疆促.");
	}
	public abstract void sound();
	
	
}
class Cat extends Animal{

	@Override
	public void sound() {
	System.out.println("具克");
		
	}
	
}

class Dog extends Animal{

	@Override
	public void sound() {
	System.out.println("港港");

		
	}
	
}


public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breathe();
		dog.sound();
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
		
		
	}
	
	

}
