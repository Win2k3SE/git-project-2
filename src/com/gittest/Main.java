package com.gittest;

public class Main {
	
	private static final String fName = "Jeonghan";
	private static final String lName = "Yoon";

	public static String getFname() {
		return fName;
	}
	public static String getLname() {
		return lName;
	}
	public static String generateTheName() {
		return "My name is " + getLname() + " " + getFname() + "! Nice to meet you!";
	}
	public static void sayTheName() {
		System.out.println(generateTheName());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		System.out.println("Another line");
		System.out.println("Added the thirdd line");
		
		System.out.println("Added the fourth line");
		// this is great isn't it!?
		
	}
}
