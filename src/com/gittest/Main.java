package com.gittest;

import com.gittest.domain.Person;
import com.gittest.services.NameSayer;

public class Main {
	// comment
	public static void main(String[] args) {
		
		Person yjh = new Person("Jeonghan", "Yoon");
		
		NameSayer.sayTheName(yjh);

	}
	
}
