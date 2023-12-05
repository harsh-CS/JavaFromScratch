package com.stringclass;

class MethodStrings{
	
	char charAtMethod(String a) {
		System.out.println("This is the chatAt() Method \n");
		return a.charAt(2);
	}
	
	int compareToMethod(String a, String b) {
		System.out.println("This is the compareTo() Method \n");
		return a.compareTo(b);
	}
	
	String concatMethod(String a, String b) {
		System.out.println("This is the concat() Method \n");
		return a.concat(b);
	}
	
	void endsWithMethod(String a) {
		System.out.println("This is the endsWith() Method \n");
		System.out.println("Checking for char "+a.endsWith("h"));
		System.out.println("Checking for String "+a.endsWith("Rajesh"));
	}
	
	boolean equalsMethod(String a, String b) {
		System.out.println("This is the equals() Method \n");
		return a.equals(b);
	}
	
	boolean equalsIgnoreCaseMethod(String a, String b) {
		System.out.println("This is the equalsIgnoreCase() Method \n");
		return a.equalsIgnoreCase(b);
	}
	
	void formatMethod(String a, String b) {
		System.out.println("This is the Format() Method \n");
		System.out.println(String.format("%s %s",a,b));
		System.out.println(String.format("%f %s %d",23.22,a,11));
	}
	
	void getBytesMethod(String a) {
		System.out.println("Converting String to Bytes by getBytes() Method \n");
		byte[] b1 = a.getBytes();
		for (int i = 0; i<b1.length;i++) {
			System.out.print(b1[i]+" ");
		}
		System.out.println("Converting Bytes to String by creating a new  \n");
		String s = new String(b1);
		System.out.println(s);
	}
	
	char[] getCharsMethod(String a) {
		System.out.println("This is the getChars() Method \n");
		char[] ch = new char[50];
		a.getChars(1, 5, ch, 0);
		return ch;
	}
	
	void indexOfMethod(String a) {
		System.out.println("This is the indexOf() Method \n");
		System.out.println(a.indexOf("e"));
		System.out.println(a.indexOf("e", 3));
		System.out.println(a.indexOf("Rajesh"));
		System.out.println(a.indexOf("Rajesh", 6));
		
	}
	
	boolean isEmptyMethod(String a) {
		System.out.println("This is the getChars() Method \n");
		return a.isEmpty();
	}
	
	void internMethod(String a,String b) {
		System.out.println("This is the intern() Method \n");
		String sh = new String("Hey, Rajesh");
		System.out.println("checking 2 String Literal \n"+ a.equals(b)+"\n");
		System.out.println("Checking 1 String Literal & new keyword String \n"+a.equals(sh));
		String shh = new String("Hey, Rajesh").intern();
		System.out.println("Checking 1 String Literal & new keyword String after declaring as intern() \n"+a.equals(shh));
	}
	
	void joinMethod(String a, String b) {
		System.out.println("This is the join() Method \n");
		System.out.println("Joining using space as delimiter "+String.join(" ",a,b)); 
		System.out.println("Joining using - as delimiter "+String.join("-",a,b)); 
	}
	
	void lastindexOfMethod(String a) {
		System.out.println("This is the lastIndexOf() Method \n");
		System.out.println(a.lastIndexOf("e"));
		System.out.println(a.lastIndexOf("e", 3));
		System.out.println(a.lastIndexOf("Rajesh"));
		System.out.println(a.lastIndexOf("Rajesh", 6));
	}
	
	int lengthMethod(String a) {
		System.out.println("This is the length() Method \n");
		return a.length();
	}
	
	void replaceMethod(String a) {
		System.out.println("This is the replace() Method \n");
		System.out.println("replaceing char"+a.replace("e", "i"));
		System.out.println("replacing String/CharSequence"+a.replace("Rajesh", "Rakesh"));
	}
	
	void replaceAllMethod(String a) {
		System.out.println("This is the replaceAll() Method \n");
		System.out.println("replaceing char"+a.replaceAll("e", "i"));
		System.out.println("replacing String/CharSequence /n"+a.replaceAll("Rakesh", "Rajesh"));
	}
	
	void splitMethod(String a) {
		System.out.println("This is the split() Method");
		String[] b = a.split("");
		for(String s:b) {
			System.out.println(s);
		}
	}
	
	void starstWithMethod(String a) {
		System.out.println("This is the startWith() Method \n");
		System.out.println("Checking for char "+a.startsWith("h"));
		System.out.println("Checking for String "+a.startsWith("Rajesh"));
	}
	
	void substringMethod(String a) {
		System.out.println("This is the substring() Method \n");
		System.out.println(a.substring(6));
		System.out.println(a.substring(0,6));
	}
	
	char[] toCharArray(String a) {
		System.out.println("This is the toCharArray() Method \n");
		char[] ch = a.toCharArray();
		return ch;
	}
	
	String toLowerCaseMethod(String a) {
		System.out.println("This is the toLowerCase() Method \n");
		return a.toLowerCase();
	}
	
	String toUpperCaseMethod(String a) {
		System.out.println("This is the toUpperCase() Method \n");
		return a.toUpperCase();
	}
	
	String trimMethod(String a) {
		return a.trim();
	}
	
	void valueOfMethod() {
		int i = 100;
		boolean b = true;
		double d = 265.65;
		System.out.println("Int to String \n "+String.valueOf(i));
		System.out.println("Int to String \n "+String.valueOf(b));
		System.out.println("Int to String \n "+String.valueOf(d));
	}
}

public class StringMethods {
	public static void main(String args[]) {
		String s = "Hey, Rajesh";
		String s1 = "Hey, Rajesh";
		String s2 = new String ("Hey, Rajesh");
		String s3 = "HEY, RAJESH";
		String s4 = "Hey Reshma!";
		String s5 = new String(" How u doing?");
		
		MethodStrings ms = new MethodStrings();
		System.out.println(ms.charAtMethod(s));
		System.out.println(ms.compareToMethod(s, s1));
		System.out.println(ms.compareToMethod(s, s2));
		System.out.println(ms.concatMethod(s, s5));
		ms.endsWithMethod(s);
		System.out.println(ms.equalsMethod(s, s1));
		System.out.println(ms.equalsMethod(s, s2));
		System.out.println(ms.equalsMethod(s, s4));
		System.out.println(ms.equalsIgnoreCaseMethod(s, s1));
		System.out.println(ms.equalsIgnoreCaseMethod(s, s3));
		ms.formatMethod(s, s5);
		ms.getBytesMethod(s5);
		System.out.println(ms.getCharsMethod(s4));
		ms.indexOfMethod(s);
		System.out.println(ms.isEmptyMethod(s));
		ms.internMethod(s, s5);
		ms.joinMethod(s4, s5 );
		ms.lastindexOfMethod(s2);
		System.out.println(ms.lengthMethod(s5));
		ms.replaceMethod(s);
		ms.replaceAllMethod(s1);
		ms.splitMethod(s5);
		ms.starstWithMethod(s2);
		ms.substringMethod(s5);
		System.out.println(ms.toCharArray(s4));
		System.out.println(ms.toLowerCaseMethod(s3));
		System.out.println(ms.toUpperCaseMethod(s1));
		System.out.println(ms.trimMethod(s5));
		ms.valueOfMethod();
	}
	
}
