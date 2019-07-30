package com.yedam.jsc;
abstract class Animal{
	public String kind;
	public void breathe() {
		System.out.println("���� ����.");
	}
	public abstract void sound();
	
	
}
class Cat extends Animal{

	@Override
	public void sound() {
	System.out.println("�߿�");
		
	}
	
}

class Dog extends Animal{

	@Override
	public void sound() {
	System.out.println("�۸�");

		
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
