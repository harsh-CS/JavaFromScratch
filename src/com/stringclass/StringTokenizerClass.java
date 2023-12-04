package com.stringclass;
import java.util.StringTokenizer;

class Tokenizer{
	
	void token(StringTokenizer s) {
		System.out.println(s.countTokens());
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
			System.out.println(s.nextToken(","));
		}
		
	}
	
}

public class StringTokenizerClass {
	public static void main(String argsp[]) {
		StringTokenizer st = new StringTokenizer("Hey, How you doing?");
		StringTokenizer st1 = new StringTokenizer("Hey how u doing?"," ");
		StringTokenizer st2 = new StringTokenizer("Hey how u doing?", " ", false);
		StringTokenizer st3 = new StringTokenizer("Hey how u doing?", " ", true);
		Tokenizer tk = new Tokenizer();
		tk.token(st);
		tk.token(st1);
		tk.token(st2);
		tk.token(st3);
		
	}
}
