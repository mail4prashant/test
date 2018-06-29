package com.allianz.test;

import java.math.BigDecimal;

public class SayHiService {

	private final static String HI = "Hi";
	
	public String sayHi(String name) {
		double value = 20.02d;
		BigDecimal bigDecimal = new BigDecimal(value);
		System.out.println(bigDecimal);
		return HI + " " + name;
	}
}
