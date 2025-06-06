package com.JavaJUnit5Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTrueDemoTest {
	AssertTrueDemo at = new AssertTrueDemo();
	
	// Simple method with condition
	@Test
	void testAssertTrue() {
		assertTrue(at.sum(5, 3) % 2 == 0);
	}
	
	// Method with passing static error message along with condition
	@Test
	void testAssertTrue_WithMessage() {
		assertTrue(at.sum(5, 3) % 2 == 0, "Check number is odd or even with Message Test Case Has Failed.");
	}
	
	// Method with passing error message using Lambda Expression and Supplier Interface
	@Test
	void testAssertTrue_WithLambdaMessage() {
		assertTrue(at.sum(5, 3) % 2 != 0, () -> "Check number is odd or even with Lambda Message Test Case Has Failed.");
	}
	
	// Use method for String type of logic and its method
	@Test
	void testAssertTrue_WithStringCompare() {
		String str = "Java";
		assertTrue(str.equals("Jasva"), () -> "String comparing has failed");
	}
}
