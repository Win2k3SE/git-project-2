package com.gittest.services;

import com.gittest.domain.Person;

public class NameSayer {

	public static void sayTheName(Person person) {
		System.out.println(generateTheName(person));
	}
	private static String generateTheName(Person person) {
		return "My name is " + person.getlName() + " " + person.getfName() + "! Nice to meet you!";
	}

}
