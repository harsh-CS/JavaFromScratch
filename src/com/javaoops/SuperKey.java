package com.javaoops;

class Bike{
	String color = "Red";
	Bike(){
		System.out.println("This is parent class constructor");
	}
	void print() {
		System.out.println("This is parent method");
	}
}

class Activa extends Bike{
	String color = "Black";
	Activa(){
		super();
		System.out.println("Calling parent class constructor");	
	}
	void varprint() {
		System.out.println("This is referace to immediate parent instance value");
		System.out.println("This is child class "+color);
		System.out.println("This is Parent class "+super.color);
	}
	void methodPrint() {
		System.out.println("We are invoking Parent method");
		super.print();
	}
}

public class SuperKey {
	
	public static void main(String[] args) {
		
		Activa ac = new Activa();
		ac.varprint();
		ac.methodPrint();
		
		
	}
}
