package com.innerclasses;

public class LocalInnerClass {
	private int data = 30;
	void display() {
		System.out.println("This is display method from outer class");
		class InnerClass{
			void msg() {
				System.out.println("This is msg method from inner class "+ data);
			}
		}
		InnerClass ic = new InnerClass();
		ic.msg();
		}
	public static void main(String args[]) {
		LocalInnerClass lic = new LocalInnerClass();
		lic.display();
	}
}
