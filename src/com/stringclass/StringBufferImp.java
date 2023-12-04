package com.stringclass;

public class StringBufferImp {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer();
		System.out.println("StringBuffer Intialised Capacity \r"+sb.capacity());
		System.out.println("Appending to Buffer \n"+sb.append("Hey, How u doing?"));
		System.out.println("Inserting to Buffer \n"+sb.insert(17, "Buddy"));
		System.out.println("Replacing hey to hii \n"+sb.replace(0, 3, "Hii"));
		System.out.println("Deleting buddy \n"+sb.delete(17, 24));
		System.out.println("Retuning a charAt 3 positon \n"+sb.charAt(2)); 	
		System.out.println("Returning the length \n"+sb.length());
		System.out.println("Returning Substring with start index \n"+ sb.substring(6));
		System.out.println("Returning Substring with start & end index \n"+sb.substring(2,15));
		System.out.println("Reversing the string \n"+sb.reverse());
		
	}
}
