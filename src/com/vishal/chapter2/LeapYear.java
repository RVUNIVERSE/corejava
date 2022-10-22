package com.vishal.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new  InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Year:");
		String str=br.readLine();
		int year=Integer.parseInt(str);
		
		if ((year % 4 == 0 && year % 100 != 0)||(year% 400==0)) {
			System.out.println("is Leap Year");
		}else {
			System.out.println("is not a Leap Year");
		}
		
		
	}

}
