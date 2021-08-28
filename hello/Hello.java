package com.hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello,");
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter your name:");
		String username = userinput.nextLine();
		System.out.println ("Welcome to Java Selenium World " + username);
		
		

	}

}
