package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest2 {
  @Test(priority=1,description="this is first executing")
  public void f() {
	  System.out.println("from test method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from before test method");
  }
  @Test(priority=2,description="tests description")
  public void a() {
	  System.out.println("from test method a()");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("from after test method");
  }

}
