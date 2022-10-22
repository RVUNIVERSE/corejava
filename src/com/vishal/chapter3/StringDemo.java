package com.vishal.chapter3;

public class StringDemo {
	public static void main(String[] args) {
		//using string literal(string constant pool)
		String str="Hii";
		
		//using new operator(heap area)
		String str1=new String("Hello");
	}
}

/*
	-> String is a pre-defined class available in java.lang package
	-> String we can use as a data type also(referenced data types).
	** Note: Every java class can used as a reference data type
	-> String is used to store group of characters.
	-> String is immutable in java(can't be modified)
	** [StringBuffer(thread safe-access one thread at time) & 
		StringBuilder(not thread safe-access multi thread at time) 
		are mutable in java]
	-> we can create String in two ways -using String literal and using new operator
	** String Manipulation:
	-> String class provide several methods to perform operations in String:-
	
		
*/