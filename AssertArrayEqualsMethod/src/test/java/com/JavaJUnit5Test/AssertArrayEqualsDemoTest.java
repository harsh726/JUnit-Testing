package com.JavaJUnit5Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AssertArrayEqualsDemoTest {

	AssertArrayEqualsDemo ar = new AssertArrayEqualsDemo();

	// Simple method with both arrays(actual and expected) passed for test case
	@Test
	void testAssertArrayEquals() {
		Arrays.sort(ar.actual);
		assertArrayEquals(ar.expected, ar.actual);
	}

	// Method with passing static error message along with both arrays(actual and expected)
	@Test
	void testAssertArrayEquals_WithMessage() {
		Arrays.sort(ar.actual);
		assertArrayEquals(ar.expected, ar.actual, "Check both arrays are same with Message Test Case Has Failed.");
	}

	// Method with passing error message using Lambda Expression and Supplier
	// Interface
	@Test
	void testAssertArrayEquals_WithLambdaMessage() {
		assertArrayEquals(ar.expected, ar.actual,
				() -> "Check both arrays are same with Lambda Message Test Case Has Failed.");
	}
}
