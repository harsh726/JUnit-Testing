package com.JavaJUnitTest5.SimpleJavaProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.JavaJUnitTest.Learning.ReverseString;

class ReverseStringTest {
	
	@Test
	void test() {
		ReverseString rs = new ReverseString();
		assertEquals("avaJ", rs.reverseString("Java"));
	}
}
