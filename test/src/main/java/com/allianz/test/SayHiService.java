package com.allianz.test;

public class SayHiService {

	private final static String HI = "Hi";
	
	public String sayHi(String name) {
		return HI + " " + name;
	}
}
