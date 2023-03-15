package Firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFibano {
  static Calculator calc;
	@Before
	public void setUp() throws Exception
	{
	
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc=new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testfiba() {
		{
		int inputBase=5;
		int expectedValue=3;
		int actualValue=calc.fiba(inputBase);
		assertEquals(expectedValue,actualValue);
		}
		//fail("Not yet implemented");
	}

}
