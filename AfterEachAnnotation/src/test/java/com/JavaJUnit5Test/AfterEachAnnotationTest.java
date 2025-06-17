package com.JavaJUnit5Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class AfterEachAnnotationTest {
	
	ComputeAreaOfShapes cs = new ComputeAreaOfShapes();

	@Test
	void testComputeSquareArea() {
		assertNotEquals(576, cs.squareArea(5), ()-> "Area of Square test case has failed.");
		System.out.println("Test method called");
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, cs.circleArea(5), ()-> "Area of Circle test case has failed.");
		System.out.println("Test method called");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("AfterEach called");
	}
}
