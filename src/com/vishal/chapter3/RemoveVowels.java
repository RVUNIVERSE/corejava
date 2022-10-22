package com.vishal.chapter3;

public class RemoveVowels {
	public static void main(String[] args) {
		String s="hello,I Love my India";
		s=s.replaceAll("[aeiouAEIOU]", "");
		System.out.println(s);
	}
}
