package com.vishal.chapter3;

public class CountNoOfWords {
	public static void main(String[] args) {
		String s="            hello        i love    java   programming                   ";
		String[] arr=s.trim().split("\\s+");
		
		System.out.println(arr.length);
	}
}
