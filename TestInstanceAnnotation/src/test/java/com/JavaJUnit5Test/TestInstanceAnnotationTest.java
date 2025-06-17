package com.JavaJUnit5Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestInstanceAnnotationTest {
	
	AreaOfShapes cs = new AreaOfShapes();
	
	/*
	 * The constructor of test class will call all the time when object got created.
	 * It will call same number of times as number of test method has implemented.
	 */	
	TestInstanceAnnotationTest(){
		System.out.println("TestInstanceAnnotationTest class object created ");
	}
	
	@BeforeAll
	void setUpBeforeClass() {
		System.out.println("<===== BeforeAll called =====> \n");
	}
	
	@Test
	void testComputeSquareArea() {
		assertEquals(25, cs.squareArea(5), ()-> "Area of Square test case has failed.");
		System.out.println("Test method called");
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, cs.circleArea(5), ()-> "Area of Circle test case has failed.");
		System.out.println("Test method called");
	}
	
	@AfterAll
	void tearDownAfterClass() {
		System.out.println("\n<===== AfterAll called =====>");
	}
}
