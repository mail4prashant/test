package com.allianz.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SayHiServiceTest {
  
  private final static SayHiService SERVICE = new SayHiService();
  
  @Test
  public void testName1() {
	  assertEquals(SERVICE.sayHi("name1"), "Hi name1");
  }

  @Test
  public void testName2() {
	  assertEquals(SERVICE.sayHi("name2"), "Hi name2");
  }

  @Test
  public void testName3() {
	  assertEquals(SERVICE.sayHi("name3"), "Hi name3");
  }

  @Test
  public void testName4() {
	  assertEquals(SERVICE.sayHi("name4"), "Hi name4");
  }

  @Test
  public void testName5() {
	  assertEquals(SERVICE.sayHi("name5"), "Hi name5");
  }

  @Test
  public void testName6() {
	  assertEquals(SERVICE.sayHi("name6"), "Hi name6");
  }

}
