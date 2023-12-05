package com.innerclasses;

public class StaticInnerClass {
	static int  i = 30;
	static class InnerClass{
		void msg() {
			System.out.println("This is inner class "+i);
		}
	}
	public static void main(String args[]) {
		StaticInnerClass.InnerClass siic= new StaticInnerClass.InnerClass();
		siic.msg();
		
	}
}
