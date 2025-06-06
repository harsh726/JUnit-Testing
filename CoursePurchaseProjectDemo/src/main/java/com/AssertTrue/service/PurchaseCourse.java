package com.AssertTrue.service;

import com.AssertTrue.dao.Course;

public class PurchaseCourse {
	/*
	 * Declares a instance variable named course that 
	 * holds a reference to an object implementing the Course interface
	 * 
	*/
	
	// In the method parameter, it is Course course = new JavaCourse();
	public boolean proceedWithCourse(Course course) {
		return course.coursePurchased();
	}
}
