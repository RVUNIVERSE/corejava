package com.vishal.chapter3;

public class foreachArray {
	public static void main(String[] args) {
		int arr[][]= {{100,200},{300,400}};
		
		for(int[] a:arr) {
			for(int x:a) {
				System.out.println(x);
			}
		}
	}
}
