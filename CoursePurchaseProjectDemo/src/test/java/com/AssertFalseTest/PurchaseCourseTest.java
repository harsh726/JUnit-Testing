package com.AssertFalseTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.AssertFalse.dao.JUnitCourse;
import com.AssertFalse.dao.JavaCourse;
import com.AssertFalse.dao.SpringBootCourse;
import com.AssertFalse.service.PurchaseCourse;

class PurchaseCourseTest {

	PurchaseCourse pc =new PurchaseCourse();
	
	@Test
	void testPurchaseJavaCourse() {
		boolean status = pc.proceedWithCourse(new JavaCourse());
		assertFalse(status, () -> "It is failed due to unit is results in true.");
	}
	@Test
	void testPurchaseJUnitCourse() {
		boolean status = pc.proceedWithCourse(new JUnitCourse());
		assertFalse(status);
		
	}@Test
	void testPurchaseSpringBootCourse() {
		boolean status = pc.proceedWithCourse(new SpringBootCourse());
		assertFalse(status);
	}
}
