package com.exceptionhandling;

class TryCatch{
	void basicTryCatch(int a, int b) {
		System.out.println("This is the Basic example of try catch block using respective Exception class");
		try {
			a = a/b;
			System.out.println(a);
			// In case of error this won't be executed 
			System.out.println("I am getting aexecuted because of no exception");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			//printing custom message to user
			System.out.println("can't divide by zero");
		}
		System.out.println("The Exception Handled");
	}
	
	void handlingExceptionWithParentClass(int a, int b) {
		System.out.println("This is the Basic example of try catch block using parent Exception class");
		try {
			a = a/b;
			System.out.println(a);
		}
		// Using parent Exception class for handling the exception.
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("The Exception Handled");
	}
	
	void handlingExceptionWithAnotherException(int a, int b) {
		System.out.println("This is the Basic example of try catch block using another Exception class, here exception won't be handled");
		try {
			a = a/b;
			System.out.println(a);
		}
		// Here we are trying to handle exception from another here exception won't be handled
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("The Exception Handled");
	}
	
	void resolveInCatch(int a, int b) {
		System.out.println("Making changes to code to adapt the change");
		try {
			a = a/b;
			System.out.println(a);
		}
		// Making changes to code to adapt the change
		catch(ArithmeticException e) {
			System.out.println("can't divide by zero hence adding 2 to divisor");
			System.out.println(a/(b+2));
		}
		System.out.println("The Exception Handled");
	}
	
}

public class SimpleTryCatch {
	static int a = 50, b =0, c = 5;
	public static void main(String args[]) {
		TryCatch tc  = new TryCatch();
		tc.basicTryCatch(a, b);
		tc.basicTryCatch(a, c);
		tc.handlingExceptionWithParentClass(a, b);
		tc.handlingExceptionWithParentClass(a, c);
		tc.resolveInCatch(a, b);
		tc.resolveInCatch(a, c);
		tc.handlingExceptionWithAnotherException(a, b);
		tc.handlingExceptionWithAnotherException(a, c);
		
	}
}
