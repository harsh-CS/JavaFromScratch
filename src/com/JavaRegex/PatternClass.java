package com.JavaRegex;

import java.util.regex.*;


public class PatternClass {
	public static void main(String args[]) {
		// Method 1 to write Regex
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		
		// Method 2 to write Regex
		boolean b1 = Pattern.compile(".s").matcher("as").matches();
		
		// Method 3 to write Regex
		boolean b2 =Pattern.matches(".s", "as");
		
		System.out.println(b+" "+b1+" "+" "+b2);
		
		// Regex Character Classes
		
		System.out.println(Pattern.matches("[abc]", "a")); //Simple class
		System.out.println(Pattern.matches("[^abc]", "a")); // negation not to include below alpha
		System.out.println(Pattern.matches("[a-zA-Z]", "R")); // Any Alphabet 
		System.out.println(Pattern.matches("[a-d[m-p]]", "a")); // Its union that it from a to d and m to p only
		System.out.println(Pattern.matches("[a-z&&[def]]", "g")); // Its a intersection only def allowed 
		System.out.println(Pattern.matches("[a-z&&[^bc]]", "g")); // Its a Subtraction only bc not allowed 
		System.out.println(Pattern.matches("[a-z&&[^m-p]]", "n")); // Its a subtraction m to p not allowed
		
	}
}
