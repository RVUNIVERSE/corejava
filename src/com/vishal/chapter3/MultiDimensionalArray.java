package com.vishal.chapter3;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int arr[][]= {{100,200},{300,400}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
