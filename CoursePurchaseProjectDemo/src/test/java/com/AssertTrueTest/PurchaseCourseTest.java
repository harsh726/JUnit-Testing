package com.AssertTrueTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.AssertTrue.dao.JUnitCourse;
import com.AssertTrue.dao.JavaCourse;
import com.AssertTrue.dao.SpringBootCourse;
import com.AssertTrue.service.PurchaseCourse;

class PurchaseCourseTest {

	PurchaseCourse pc =new PurchaseCourse();
	
	@Test
	void testPurchaseJavaCourse() {
		boolean status = pc.proceedWithCourse(new JavaCourse());
		assertTrue(status);
	}
	@Test
	void testPurchaseJUnitCourse() {
		boolean status = pc.proceedWithCourse(new JUnitCourse());
		assertTrue(status);
		
	}@Test
	void testPurchaseSpringBootCourse() {
		boolean status = pc.proceedWithCourse(new SpringBootCourse());
		assertTrue(status);
	}
}
