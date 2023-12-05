package com.exceptionhandling;

class Nested{
	// Here there is 1 parent and 2 child blocks
	void example1(int a, int b, int[] arr) {
		//Parent try block
		try {
			//outer try block for default
			
			// Try block 1
			try {
				System.out.println(a/b);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			
			//try block 2
			try {
					arr[10] = 100;
			}
			catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
			}
		}
		// catch block for outer try block
		catch (Exception e) {
			System.out.println(e);
		}
	}
	// Here there are 3 nested block 
	void example2(int a, int b, int[] arr) {
		//Parent try block
		try {
			//outer try block for default
			
			// Try block 1
			try {
				System.out.println(a/b);

			
				//try block 2
				try {
						arr[10] = 100;
				}
				catch(ArrayIndexOutOfBoundsException e) {
						System.out.println(e);
				}
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
		}
		// catch block for outer try block
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
}


public class NestedTryBlock {
	static int a = 100, b = 0, c = 2;
	static int[] arr =  new int[5];
	
	public static void main(String args[]) {
		Nested ns = new Nested();
		ns.example1(a,b,arr);
		ns.example2(a,b,arr);
	}

}
