package com.vishal.chapter2;

public class NestedLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j-2);
			}
			System.out.println();
		}

	}
}
//program to print tringle ,pyramid,butterfly,diamond
//diff between print and println
//are two methods
//print() method is used to print statement on same line and 
//println() to print on next line