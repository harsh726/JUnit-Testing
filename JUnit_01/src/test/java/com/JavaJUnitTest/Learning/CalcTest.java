package com.JavaJUnitTest.Learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c = new Calc(); // Create a object of Calc class from "src/main/java"
		assertEquals(5, c.divide(10, 2));	// Pass expected and actual result to asssertEquals method
		assertEquals(5, 5); // Manually pass actual and expected result to assertEquals method
	}
}
