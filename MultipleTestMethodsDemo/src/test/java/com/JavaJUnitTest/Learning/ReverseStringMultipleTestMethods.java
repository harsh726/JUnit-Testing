package com.JavaJUnitTest.Learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringMultipleTestMethods {
	
	ReverseString rs = new ReverseString();
	
	@Test
	public void testReverseString_OneWord() {	// 1st Method/test case to check single world reverse
		assertEquals("avaJ", rs.reverseString("Java"));
	}
	
	@Test
	public void testReverseString_MultipleWord() {	// 2nd Method/test case to check multiple worlds reverse
		assertEquals(".ysae si avaJ", rs.reverseString("Java is easy."));
	}
}
