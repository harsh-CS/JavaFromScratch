package com.innerclasses;

public class MemberInnerClass {

	private int a = 10;
	class InnerClass{
		void msg() {
			System.out.println("This is inner class "+a);
		}
	}
	public static void main(String args[]) {
		MemberInnerClass mic = new MemberInnerClass();
		MemberInnerClass.InnerClass minc = mic.new InnerClass();
		minc.msg();
	}
	
}
