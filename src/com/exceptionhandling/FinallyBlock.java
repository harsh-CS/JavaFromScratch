package com.exceptionhandling;

class FinalBlock{
	void exceptionHandledBlock(int a, int b){
		try {
			System.out.println("Reminder is " +a/b);
		}
		catch (ArithmeticException  e) {
			System.out.println("Can't divide by 0 resulted in "+e);
		}
		finally {
			System.out.println("This is final block will run in all the condition \n");
		}
	}
	
	void exceptionNotHandledBlock(String s){
		try {
			System.out.println("Inside Try block");
			System.out.println("lentgh of String  is " + s.length());
		}
		catch (ArithmeticException  e) {
			System.out.println("Can't divide by 0 resulted in "+e);
		}
		finally {
			System.out.println("This is final block will run in all the condition");
		}
	}
}

public class FinallyBlock {
	public static void main(String args[]) {
		int a =100, b= 10, c = 0;
		String s = null;
		FinalBlock fb = new FinalBlock();
		fb.exceptionHandledBlock(a, b);
		fb.exceptionHandledBlock(a, c);
		fb.exceptionNotHandledBlock(s);
		
	}
}
