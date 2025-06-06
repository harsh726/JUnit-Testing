package com.AssertFalse.dao;

public class SpringBootCourse implements Course{

	@Override
	public boolean coursePurchased() {
		System.out.println("SpringBoot course purchase failed due to a database connection error, so the method returned false.");
		return false;
	}

}
