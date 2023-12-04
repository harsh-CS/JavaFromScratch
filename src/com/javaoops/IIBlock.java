package com.javaoops;

class Run{
	int i;
	
	void speed() {
		System.out.println(i);
	}
	{
		i = 100;
	}
	{
		i = 110;
	}
}


public class IIBlock {
	public static void main(String args[]) {
		Run obj = new Run();
		Run obj2 = new Run();
		obj.speed();
		obj2.speed();
	}
	
}
