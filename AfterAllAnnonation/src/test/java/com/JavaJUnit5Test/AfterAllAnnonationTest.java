package com.JavaJUnit5Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AfterAllAnnonationTest {
	
	ComputeAreaOfShapes cs;
	
	@BeforeAll
	static void setUpBeforeClass() {
		System.out.println("<===== BeforeAll called =====> \n");
	}

	@AfterEach
	void setUp() {
		 cs = new ComputeAreaOfShapes();
		 System.out.println("AfterEach called");
	}

	@Test
	void testComputeSquareArea() {
		//assertEquals(576, cs.squareArea(5), ()-> "Area of Square test case has failed.");
		System.out.println("Test method called");
	}
	
	@Test
	void testComputeCircleArea() {
		//assertEquals(78.5, cs.circleArea(5), ()-> "Area of Circle test case has failed.");
		System.out.println("Test method called");
	}
	
	@AfterAll
	static void tearDownAfterClass() {
		System.out.println("\n<===== AfterAll called =====>");
	}
}
