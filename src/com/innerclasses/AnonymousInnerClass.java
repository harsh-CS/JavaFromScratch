package com.innerclasses;


abstract class AnonymousInnerClass{  
	  abstract void eat();  
}  
class TestAnonymousInner{  
	 public static void main(String[] args){  
		 AnonymousInnerClass p=new AnonymousInnerClass(){  
			 void eat(){
				 System.out.println("nice fruits");
			}  
		 };  
		 p.eat();  
	 }  
}  