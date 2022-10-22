package com.vishal.chapter3;

import java.util.Arrays;

public class StringDemo4 {
	public static void main(String[] args) {
		String s1="java";
		char[] c=s1.toCharArray();
		System.out.println();
		
		
		/*
		 * String s1="hi"; String s2=s1.intern(); 
		 * System.out.println(s1==s2); String
		 * s3=new String("hello"); String s4=s3.intern(); 
		 * System.out.println(s3==s4);
		 */
		
		//int a=20;
		//int b=22;
		//String c=String.valueOf(a) + String.valueOf(b);
		//System.out.println(c);
		
		//String s1="ashokit";
		//String s2="20";
		//System.out.println(s1.startsWith("a"));
		//System.out.println(s1.endsWith("it"));
	}
}	

/*
	valueOf()------it is used to convert any type value into string type
	startWith()----it is used to check given string is strtning with particular char(s) or not
	endsWith()---it is used to check given string is ending wuth particular char(S) or not 
	trim()----it is used to remove
	intern()---it is used to access object from string constant pool 
	toString()---it is used to convert object in string
	toCharArray()---convert this string into new char array
	
*/