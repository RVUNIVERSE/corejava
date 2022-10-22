package com.vishal.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShoesBrand {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter Brand Name");
		String brand=br.readLine();
		
		switch(brand){
			
			case"Nike":System.out.println("Just Do It"); break;
			
			case"Adidas":System.out.println("Impossible is Nothing"); break;
			
			case"Puma": System.out.println("Forever Faster"); break;
			
			case"Reebok": System.out.println("I am What I am");break;
			
			default: System.out.println("Brand Not Found");
		
		
		}

	}

}
