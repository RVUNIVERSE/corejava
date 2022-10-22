package com.vishal.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PrimeOrNot {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter No:");
		String str=br.readLine();
		int num= Integer.parseInt(str);
		
		if (num/2==0) {
			System.out.println("is prime Number");
		}else {
			System.out.println("is not prime no");
		}

	}

}
