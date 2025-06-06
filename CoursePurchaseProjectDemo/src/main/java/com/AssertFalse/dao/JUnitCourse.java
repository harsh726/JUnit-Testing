package com.AssertFalse.dao;

public class JUnitCourse implements Course {

	@Override
	public boolean coursePurchased() {
		System.out.println("JUnit course purchase failed due to a database connection error, so the method returned false.");
		return false;
	}

}
