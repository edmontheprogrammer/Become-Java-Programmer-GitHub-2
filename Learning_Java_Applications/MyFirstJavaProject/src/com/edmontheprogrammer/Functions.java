package com.edmontheprogrammer;

public class Functions {

	public static void main(String[] args) {
		
		printS("static method"); 
		
		Functions myFunction = new Functions(); 
		myFunction.print("instance method");
	}
	
	void print(String data) {
		System.out.println(data); 
	}
	
	static void printS(String data) {
		System.out.println(data);
	}

}
