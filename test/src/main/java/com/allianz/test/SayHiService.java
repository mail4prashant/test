package com.allianz.test;

import java.math.BigDecimal;

public class SayHiService {

	private final static String HI = "Hi";
	
	public String sayHi(String name) {
		return HI + " " + name;
	}
}
