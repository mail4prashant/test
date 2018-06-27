package com.allianz.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class HelloWorldServiceTest {
  
  private final static HelloWorldService SERVICE = new HelloWorldService();
  
  @Test
  public void testName1() {
	  assertEquals(SERVICE.getHello("name1"), "Hello name1");
  }

  @Test
  public void testName2() {
	  assertEquals(SERVICE.getHello("name2"), "Hello name2");
  }

  @Test
  public void testName3() {
	  assertEquals(SERVICE.getHello("name3"), "Hello name3");
  }

  @Test
  public void testName4() {
	  assertEquals(SERVICE.getHello("name4"), "Hello name4");
  }

  @Test
  public void testName5() {
	  assertEquals(SERVICE.getHello("name5"), "Hello name5");
  }

  @Test
  public void testName6() {
	  assertEquals(SERVICE.getHello("name6"), "Hello name6");
  }

}
