package com.vishal.chapter3;

public class StringBuilderdemo {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java");
		sb.append("android");
		System.out.println(sb.capacity());
		
	}
}

/*
	**StringBuilder**
	*StringBuilder is a predefined class available in java.lang package
	*this class introduced in 1.5v
	*StringBuilder objects are mutable(content can be modified)
	*StringBuilder objects are not thread safe(multiple thread can access at time)
	*StringBuilder sb=new StringBuilder("java");
*/