package com.AssertTrue.dao;

public class JUnitCourse implements Course {

	@Override
	public boolean coursePurchased() {
		System.out.println("JUnit course purchased.");
		return true;
	}

}
