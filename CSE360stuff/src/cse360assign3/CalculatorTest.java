package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	@Test
	public void testCalculator() 
	{
		Calculator test = new Calculator();
		assertNotNull(test);
	}

	@Test
	public void testGetTotal() 
	{
		Calculator test = new Calculator();
		assertEquals(0,test.getTotal());	//checks total initialized to zero
	}

	@Test
	public void testAdd() 
	{
		Calculator test = new Calculator();
		test.add(5);
		assertEquals(5,test.getTotal());	// checks total is 5
		test.add(7);
		assertEquals(12,test.getTotal());	// checks total is 12 after 7 is added to 5
	}

	@Test
	public void testSubtract() 
	{
		Calculator test = new Calculator();
		
		test.add(5);
		test.subtract(3);
		assertEquals(2,test.getTotal());	// checks total is 2 after 3 is subtracted from 5
		
		test.subtract(3);
		assertEquals(-1,test.getTotal());	// checks total is -1 to see if negative numbers work
		
	}

	@Test
	public void testMultiply() 
	{
		Calculator test = new Calculator();
		
		test.multiply(2);
		assertEquals(0,test.getTotal());	// total should be zero and when multiplied should remain zero
		
		test.add(5);
		test.multiply(2);
		assertEquals(10,test.getTotal());	// 5 is added to total then multiplied and total should return as 10
	}

	@Test
	public void testDivide() 
	{
		Calculator test = new Calculator();
		
		test.divide(2);
		assertEquals(0,test.getTotal());	// total should be zero and when divided should remain zero
		
		test.add(10);
		test.divide(2);
		assertEquals(5,test.getTotal());	// 10 is added to total and divided by 2 and should return 5
		
		test.divide(0);
		assertEquals(0,test.getTotal());	// 5 was total but after dividing by zero should return zero
	}

	@Test
	public void testGetHistory() 
	{
		Calculator test = new Calculator();
		assertEquals("0",test.getHistory());	//should return "0" right after calculator is initialized
		
		test.add(10);
		assertEquals("0 + 10",test.getHistory());
		
		test.divide(2);
		assertEquals("0 + 10 / 2",test.getHistory());
		
		test.multiply(3);
		assertEquals("0 + 10 / 2 * 3",test.getHistory());
		
		test.subtract(5);
		assertEquals("0 + 10 / 2 * 3 - 5",test.getHistory());
		
		
		
	}

}
