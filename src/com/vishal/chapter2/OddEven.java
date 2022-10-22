package com.vishal.chapter2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter No:");
		String str=br.readLine();
		int num= Integer.parseInt(str);
		
		if (num%2==0) {
			System.out.println("It is even number"); 
		}else {
			System.out.println("It is Odd number");
		}

	}

}
