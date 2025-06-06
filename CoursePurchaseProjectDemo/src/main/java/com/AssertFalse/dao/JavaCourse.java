package com.AssertFalse.dao;

public class JavaCourse implements Course {

	@Override
	public boolean coursePurchased() {
		System.out.println("Java course purchase failed due to a database connection error, so the method returned false.");
		return true;
	}

}
