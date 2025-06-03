package com.JavaJUnit5Test.Learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComputeAreaOfShapesTest {

	ComputeAreaOfShapes s = new ComputeAreaOfShapes();
	
	@Test
	void testSquareArea() {
		assertEquals(576, s.squareArea(24));
	}
	
	@Test
	void testCircleArea() {
		/*
		 * We can also pass error message in assertEquals() method to dedicate which
		 * test case has failed, And the message will display in "Failure Trace window"
		 */
		assertEquals(78.5, s.circleArea(5), "Area of Circle test case has failed.");
	}
}
