package com.exceptionhandling;

//Defining the user exception
class UserDefinedException extends Exception{
	public UserDefinedException (String str) {
		super(str);
	}
}

class ExceptionThrow{
	
	void voteCheck(int i) {
			if(i<18) {
				throw new ArithmeticException(" Person not Eligible to vote "); 
			}
			else {
				System.out.println("Hey you can vote!!!");
			}
	}
	void userDefinedException() {
		try {
			throw new UserDefinedException("This is user Defined Exception");
		}
		catch(UserDefinedException ude) {
			System.out.println("Exception caught");
			System.out.println(ude.getMessage());
		}
	}
}


public class ThrowException {
	public static void main(String args[]) {
		int a = 10; 
		ExceptionThrow et = new ExceptionThrow();
		et.userDefinedException();
		et.voteCheck(a);
	}

}
