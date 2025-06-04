package com.JavaJUnit5Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertNotEqualsDemoTest {
	
	AssertNotEqualsDemo ane = new AssertNotEqualsDemo();
	
	// Simple method with unexpected and actual value parameter
	@Test
	void testComputeSquare() {
		assertNotEquals(56, ane.squareArea(24));
	}

	// Method with passing static error message 
	@Test
	void testComputeSquare_WithMessage() {
		assertNotEquals(576, ane.squareArea(24), "Computer Area of Square with Message Test Case Has Failed.");
	}
	
	// Method with passing error message using Lambda Expression and Supplier Interface
	@Test
	void testComputeSquare_WithLambdaMessage() {
		assertNotEquals(576, ane.squareArea(24), () -> "Computer Area of Square with Lambda Message Test Case Has Failed.");
	}
}
