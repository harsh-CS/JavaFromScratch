package com.javaoops;

class Animal {
	void msg() {
		System.out.println("This is Animal");
	}
	void speak() {
		System.out.println("Animal make noise");
	}
	
}

class Dog extends Animal {
	void speak() {
		System.out.println("Wowf!!!");
	}
}

public class InheritanceLevels {
	public static void main(String[] args) {
		System.out.println("This is Inheritance");
		Dog dg = new Dog();
		dg.msg();
		dg.speak();
	}

}
