package com.qaforall.learnauto;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {

	@Test
	public void addingTwoNumbers () {
		Calculator calc = new Calculator ();
		int testOne = calc.sumOfTwoNumbers(5, 10);
		Assert.assertEquals(15, testOne);
		
	}
	
	public void addingThreeNumbers () {
		Calculator calc = new Calculator ();
		int testTwo = calc.sumOfThreeNumbers(5, 10, 15);
		Assert.assertEquals(30, testTwo);
	
	}
}
