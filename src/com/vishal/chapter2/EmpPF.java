package com.vishal.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpPF {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter Your Basic Salary");
		String str=br.readLine();
		double basicSalary=Double.parseDouble(str);
		double pf=basicSalary*12/100;
		
		System.out.println(pf);

	}

}
