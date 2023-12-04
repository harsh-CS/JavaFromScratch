package com.stringclass;

import java.util.StringJoiner;

class Concatenation{
	String s1 = "firstName";
	String s2 = "lastName";
	
	void concatByOperator() {
		System.out.println("By Concat Operator ++");
		System.out.println(s1+s2);
		System.out.println(50+50+s1+s1+50+50); // Here before String it is treated as int after string int is treated as string 
	}
	
	void concatMethod() {
		System.out.println("By Concat() Method");
		System.out.println(s1.concat(s2)); 
	}
	
	void concatByStringBuilder() {
		System.out.println("By String Builder");
		StringBuilder sb1 = new StringBuilder();
		sb1.append(s1);
		sb1.append(s2);
		System.out.println(sb1); 
	}
	
	void formatMethod() {
		System.out.println("By Format() Method");
		System.out.println(String.format("%s %s",s1,s2)); 
	}
	
	void joinMethod() {
		System.out.println("By Join() Method");
		System.out.println(String.join(" ",s1,s2)); 
	}
	void concatByStringJoinner() {
		System.out.println("By String Joiner");
		StringJoiner sb1 = new StringJoiner(" ");
		sb1.add(s1);
		sb1.add(s2);
		System.out.println(sb1); 
	}
	
}

public class StringConcatenation {
	public static void main(String args[]) {
		Concatenation con = new Concatenation();
		con.concatByOperator();
		con.concatMethod();
		con.formatMethod();
		con.joinMethod();
		con.concatByStringBuilder();
		con.concatByStringJoinner();
		
	}
}
