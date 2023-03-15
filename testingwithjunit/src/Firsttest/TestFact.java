package Firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFact {
	
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
		System.out.println("After all test");
	}

	

	@After
	public void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	public void testFact()
	{
	int inputBase=3;
	int expectedValue=6;
	int actualValue=calc.fact(inputBase);
	assertEquals(expectedValue,actualValue);
	}

}

