package com.vishal.chapter4;

public class StaticVariables {
	
	String name;
	String email;
	long phno;
	static String institute;
	
	public static void main(String[] args) {
		StaticVariables ankit=new StaticVariables();
		StaticVariables goutam=new StaticVariables();
	}
}

/*
	**Static Variables:
	
	- the variables which are declared inside the class and outside the method 
	  with static keyword are called as static variables.
	- static variables are class level variables.
	- when class is loaded into jvm then immidiately memory will be allocated for static variables
	- memory will be allocated for static varibles only once when the class is loaded into JVM
	-
*/