package com.innerclasses;

interface Showable{
	void show();
	interface Message{
		void msg();
	}
}

public class NestedInterface implements Showable.Message{
	public void msg() {
		System.out.println("This is msg method");
	}
	public static void main(String args[]) {
		Showable.Message  m = new NestedInterface(); //upcasting
		m.msg();
	}
	
}
