package com.vishal.chapter3;

import java.util.Arrays;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1="Ashok@it";
		String s2="it";
		String[] arr=s1.split("@");
		System.out.println(Arrays.toString(arr));
	
	}

}

/*
	**String class Methods**
	charAt()------to get a char based on index
	length()------to get size of String (no of char in string)
	equals()------to compare content of two Strings
	concat()------to join two strings(appending)
	replaced()----to replace chars with another chars
	toUppercase()-to convert string into upper case
	toLowercase()-to convert string into lower case 
	indexOf()-----to get first occurance of a char
	lastindexOf---to get last occurance of char
	subString()---it is used to get some part of the String
	split()-------it is used to split the string based on delimeter(separator)
	
*/