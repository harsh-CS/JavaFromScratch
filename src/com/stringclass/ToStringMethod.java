package com.stringclass;

class ToString{
	int roll;
	String name,city;
	
	ToString(int roll,String name, String city){
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	// if we comment toString method we will be getting the hash-map of the object
	public String toString() {
		return roll +" "+name+" "+city;
	}
}

public class ToStringMethod {
	public static void main(String args[]) {
		
		ToString ts = new ToString(55, "Rajesh", "Delhi");
		System.out.println(ts);
		
	}

}
