package com.JavaJUnit5Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeEachAnnotationTest {
	
	ComputeAreaOfShapes cs;
	
	@BeforeEach
	void setUp() {
		 cs = new ComputeAreaOfShapes();
		 System.out.println("BeforeEach called");
	}

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
}
