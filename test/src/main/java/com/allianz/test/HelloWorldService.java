package com.allianz.test;

public class HelloWorldService {

	private final static String HELLO = "Hello";
	
	public String getHello(String name) {
		return HELLO + " " + name;
	}
}
