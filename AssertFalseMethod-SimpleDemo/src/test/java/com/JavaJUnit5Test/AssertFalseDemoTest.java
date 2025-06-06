package com.JavaJUnit5Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertFalseDemoTest {

	AssertFalseDemo af = new AssertFalseDemo();
	
	// Simple method with condition
	@Test
	void testAssertFalse() {
		assertFalse(af.sum(5, 2) % 2 != 0);
	}

	// Method with passing static error message along with condition
	@Test
	void testAssertFalse_WithMessage() {
		assertFalse(af.sum(5, 2) % 2 != 0, "Check number is odd or even with Message Test Case Has Failed.");
	}

	// Method with passing error message using Lambda Expression and Supplier Interface
	@Test
	void testAssertFalse_WithLambdaMessage() {
		assertFalse(af.sum(5, 3) % 2 == 0, () -> "Check number is odd or even with Lambda Message Test Case Has Failed.");
	}

	// Use method for String type of logic and its method
	@Test
	void testAssertFalse_WithStringCompare() {
		String str = "Java";
		assertFalse(str.equals("Jasva"), () -> "String comparing has failed");
	}

}
