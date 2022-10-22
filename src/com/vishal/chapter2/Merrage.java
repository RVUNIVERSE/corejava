package com.vishal.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Merrage {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter age:");
		String str1=br.readLine();
		int age=Integer.parseInt(str1);
		
		System.out.println("Enter your Salary:");
		String str2=br.readLine();
		double salary=Double.parseDouble(str2);
		
		if (age <30 && salary>100000 ) {
			System.out.println("You are Eligible for Merrage");
		}else {
			System.out.println("You Are Not Eligible for Merrage");
		}
	}

}
