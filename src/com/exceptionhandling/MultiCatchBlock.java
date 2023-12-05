package com.exceptionhandling;


class CatchBlock{
	
	void multicatch(int a , int b) {
		try {
			a = a/b;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Can't Divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Default parent class");
		}
	}
	
	void arraycatch(int[] a) {
		try {
			a[10] = 100;
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Default parent class");
		}
	}
	
	void notDeclaredException(String s) {
		try {
			System.out.println(s.length());
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Default parent class");
		}
	}
		void generalToSpecficDefination(int a, int b) {
			try {
				a = a/b;
				System.out.println(a);
			}
			
			catch(Exception e) {
				System.out.println("Default parent class");
			}
			// if we uncomment we will get Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
			/*
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
				System.out.println("Can't Divide by zero");
			}
			*/
		}
}



public class MultiCatchBlock {
	static int a = 50 ,b = 0, c =5;
	static String s = null;
	static int[] arr = new int[5];
	public static void main(String args[]) {
		CatchBlock cb = new CatchBlock();
		cb.multicatch(a, b);
		cb.multicatch(a, c);
		cb.arraycatch(arr);
		cb.notDeclaredException(s);
		
	}
}
