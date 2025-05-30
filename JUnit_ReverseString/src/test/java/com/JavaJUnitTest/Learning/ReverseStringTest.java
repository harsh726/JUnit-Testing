package com.JavaJUnitTest.Learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString rs = new ReverseString();
		assertEquals("avaJ", rs.reverseString("Java"));
	}
}
