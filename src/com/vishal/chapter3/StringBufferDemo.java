package com.vishal.chapter3;

public class StringBufferDemo {
	public static void main(String[]args) {
		StringBuffer sb=new StringBuffer("hello");
		//sb.append("bye");
		System.out.println(sb);
		
		//String s1="vishal";
		//s1.concat("rathod");
		//System.out.println(s1);
	}
	
}

/*
 	**StringBuffer:
 	- it is predefined class available in java.lang package
 	- it is used to store group of objects
 	- StringBuffer is mutable ()
 	- StringBuffer is thread safe(only one thred can access at a time)
 	- aapend()
 	- reverse()
 	
 */

