package com.gittest;

import com.gittest.domain.Person;
import com.gittest.services.NameSayer;

public class Main {
	
	// Ja hueju s etogo gita!
	public static void main(String[] args) {
		
		Person yjh = new Person("Jeonghan", "Yoon");
		
		NameSayer.sayTheName(yjh);

		// first modif on branch crazy idea
		// 2nd commit on crazy idea
	}
	
	// modifying the line below main() 
	// this shouldn't result in a conflict
}
