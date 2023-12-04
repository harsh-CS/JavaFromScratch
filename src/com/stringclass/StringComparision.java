package com.stringclass;

class Comparision{
	String s1 = "Hello";
	String s2 = "Hello";
	String s3 = "World";
	String s4 = "HELLO";
	
	void equalsmethod() {
		System.out.println("Comparison by equals() method");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}
	void comparisionOperator() {
		System.out.println("Comparison by == Comparision Operator");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
	}
	void compareToMethod() {
		System.out.println("Comparison by compareTo() method");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
	}
}

public class StringComparision {
	
	public static void main(String args[]) {
		Comparision com = new Comparision();
		com.equalsmethod();
		com.comparisionOperator();
		com.compareToMethod();
		
	}
	

}
