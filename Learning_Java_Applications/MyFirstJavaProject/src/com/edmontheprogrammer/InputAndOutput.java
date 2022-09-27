package com.edmontheprogrammer;

import java.util.Scanner;

public class InputAndOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name"); 
		String name = scanner.nextLine();
		System.out.println("Hello " + name); 
		
		
		
		scanner.close();
	}

}
