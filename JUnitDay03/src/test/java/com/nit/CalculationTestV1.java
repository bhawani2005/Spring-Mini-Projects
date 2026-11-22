package com.nit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculationTestV1 {
	private Calculation calculation;
	private int addValue1;
	private int addValue2;
	private int expectedAddResult;
	private int subValue1;
	private int subValue2;
	private int expectedSubResult;
	private int multiValue1;
	private int multiValue2;
	private int expectedMultiResult;
	private int divValue1;
	private int divValue2;
	private int expectedDivResult;
	
	@Before
	public void setup() {
		calculation = new Calculation();
		addValue1 = 10;
		addValue2 = 20;
		expectedAddResult = 30;
		
		subValue1 = -10;
		subValue2 = -20;
		expectedSubResult = 10;
		
		multiValue1 = 17;
		multiValue2 = 8;
		expectedMultiResult = 136;
		
		divValue1 = 10;
		divValue2 = 2;
		expectedDivResult = 5;
	}
	
	@Test
	public void testAdd() {
		int actualAddResult = calculation.add(addValue1, addValue2);
		
		assertEquals(actualAddResult, expectedAddResult);
	}
	
	@Test
	public void testSub() {
		int actualSubResult = calculation.sub(subValue1, subValue2);
		
		assertEquals(actualSubResult, expectedSubResult);
	}
	
	@Test
	public void testMulti() {
		int actualMultiResult = calculation.multi(multiValue1, multiValue2);
		
		assertEquals(actualMultiResult, expectedMultiResult);
	}
	
	@Test
	public void testDiv() {
		int actualDivResult = calculation.div(divValue1, divValue2);
		
		assertEquals(actualDivResult, expectedDivResult);
	}
	
	@Test
	public void testIsPositive() {
		assertTrue(calculation.isPositive(20));
	}
	
	@Test
	public void testIsNegative() {
		assertFalse(calculation.isPositive(-10));
	}
	
	@Test
	public void testException() {
		assertThrows(ArithmeticException.class, ()->{
			calculation.div(10, 0);
		});
	}
	
	@Test
	public void testNotNull() {
		assertNotNull(calculation);
	}
	
	@Test
	public void testNull() {
		calculation = null;
		assertNull(calculation);
	}
	
	@After
	public void tearDown(){
		calculation = null;
		addValue1 = 0;
		addValue2 = 0;
		expectedAddResult = 0;
		
		subValue1 = 0;
		subValue2 = 0;
		expectedSubResult = 0;
		
		multiValue1 = 0;
		multiValue2 = 0;
		expectedMultiResult = 0;
		
		divValue1 = 0;
		divValue2 = 0;
		expectedDivResult = 0;
	}
}
    