package com.allianz.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SayByeServiceTest {
  
  private final static SayByeService SERVICE = new SayByeService();
  
  @Test
  public void testName1() {
	  assertEquals(SERVICE.sayBye("name1"), "Bye name1");
  }

  @Test
  public void testName2() {
	  assertEquals(SERVICE.sayBye("name2"), "Bye name2");
  }

  @Test
  public void testName3() {
	  assertEquals(SERVICE.sayBye("name3"), "Bye name3");
  }

  @Test
  public void testName4() {
	  assertEquals(SERVICE.sayBye("name4"), "Bye name4");
  }

  @Test
  public void testName5() {
	  assertEquals(SERVICE.sayBye("name5"), "Bye name5");
  }

  @Test
  public void testName6() {
	  assertEquals(SERVICE.sayBye("name6"), "Bye name6");
  }

}
