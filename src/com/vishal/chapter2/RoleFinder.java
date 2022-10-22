package com.vishal.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoleFinder {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter exp:");
		String str =br.readLine();		
		int exp= Integer.parseInt(str);
		
		if (exp> 0 && exp<=2) {
			System.out.println("Associate Engineer");
		}else if (exp> 3 && exp<=5){
			System.out.println("Software Engineer");
		}else if(exp>=6 && exp<=9) {
			System.out.println("Manager");
		}else {
			System.out.println("Role not found");
		}
	}

}
