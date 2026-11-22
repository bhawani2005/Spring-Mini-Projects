package com.nit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculationTestV2 {

	private int value1;
	private int value2;
	private int expectedAddResult;
	private int expectedSubResult;
	private int expectedMultiResult;
	private int expectedDivResult;
	private int positiveValue;
	private int negativeValue;
	private Calculation calculation = new Calculation();
	
	
	

	public CalculationTestV2(int value1, int value2, int expectedAddResult, int expectedSubResult,
			int expectedMultiResult, int expectedDivResult, int positiveValue, int negativeValue) {
		super();
		this.value1 = value1;
		this.value2 = value2;
		this.expectedAddResult = expectedAddResult;
		this.expectedSubResult = expectedSubResult;
		this.expectedMultiResult = expectedMultiResult;
		this.expectedDivResult = expectedDivResult;
		this.positiveValue = positiveValue;
		this.negativeValue = negativeValue;
	}

	@Parameters
	public static List<Integer[]> insertValues(){
		Integer [][]values = {{10,5,15,5,50,2,60,-123},{-10,-5,-15,-5,50,2,26,-894}};
		
		return Arrays.asList(values);
	}
	
	@Test
	public void testAdd() {
		int actualResult = calculation.add(value1, value2);
		
		assertEquals(actualResult, expectedAddResult);
	}
	
	@Test
	public void testSub() {
		int actualSubResult = calculation.sub(value1, value2);
		
		assertEquals(actualSubResult, expectedSubResult);
	}
	
	@Test
	public void testMulti() {
		int actualMultiResult = calculation.multi(value1, value2);
		
		assertEquals(actualMultiResult, expectedMultiResult);
	}
	
	@Test
	public void testDiv() {
		int actualDivResult = calculation.div(value1, value2);
		
		assertEquals(actualDivResult, expectedDivResult);
	}
	
	@Test
	public void testIsPositive(){
		assertTrue(calculation.isPositive(positiveValue));
	}
	
	@Test
	public void testIsNegative() {
		assertFalse(calculation.isPositive(negativeValue));
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
	
	@Test
	public void testException() {
		assertThrows(ArithmeticException.class, ()->{
			calculation.div(26, 0);
		});
	}
	
}
