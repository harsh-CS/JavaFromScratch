package com.javaoops;

public class MethodOverloading {
	int add(int a,int b) {
		return a+b;
	}
	void add(int a,int b, long c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println (mo.add(10, 20));
		mo.add(10, 20, 30);
	}
	
}
