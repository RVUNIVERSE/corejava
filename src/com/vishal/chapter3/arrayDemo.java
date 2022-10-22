package com.vishal.chapter3;

import java.util.Arrays;

public class arrayDemo {
	
	public static void main(String[] args) {
	
		int arr[]= {15,12,8,9,4,2};
	//using sort method	
		Arrays.sort(arr);
		System.out.println("Min Element :"+arr[0]);
		System.out.println("Max Element :"+arr[arr.length-1]);
		
	}
}
