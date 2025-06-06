# Course Purchase Project – Demonstrating assertTrue() and assertFalse() Methods
This project is designed to provide a clear understanding of the assertTrue() method in JUnit 5.
The flow of the project involves checking and validating whether a user has purchased a course or not.

In the project we have created JavaCourse, JUnitCourse and SpringBootCourse java class file which implements Course interface.
Based on whichever class method call, it will display the output accordingly.

In the test class file, we have used Course type referance to invoke or reffer other Courses class (SpringBoot, Java, and JUnit) object using Polymorphism – Method Overloading and Method Overriding concept.

## Overview of Code and Workflow
1.  ``` dao\Course.java ``` is a functional interface with ``` boolean coursePurchased(); ``` method.
2.  Below are the classes that implements Course Interface:
    ``` dao\JavaCourse.java  JUnitCourse.java   SpringBootCourse.java```
3.  ``` service\PurchaseCourse.java ``` service class:
    This file contains ``` public boolean proceedWithCourse(Course course) ``` method with boolean type which takes an object of Course interface as a parameter.
    And based on Object passed from (Java, SpringBoot or JUnit class), ``` course.coursePurchased() ``` will invoke.
        If the Object of JUnitCourse class has passed then the method of JUnitCourse class will be invoke and whatever return value was in that class file, it will return that value to the method parameter.
4.  ``` AssertTrueTest\PurchaseCourseTest.java ``` test class:
    This test file, we have first created an Object of ``` PurchaseCourse.java ``` class file and declare ``` testPurchaseCourse() ``` method:
        Inside of that method, we are invoking proceedWithCourse() method using the referance variable, or Object of ``` PurchaseCourse.java ``` and injecting object of either one of course files ``` (JavaCourse, JUnitCourse, or SpringBootCourse) ``` object. See the below method from ``` PurchaseCourseTest.java ```:
        
            PurchaseCourse pc =new PurchaseCourse(); 
	        @Test
	        void testPurchaseCourse() {
		        boolean status = pc.proceedWithCourse(new JavaCourse());
		        assertTrue(status);
	        }
5.  For the ``` assrtFalse() ``` Method, I have implemented same class files in "AssertFalse" package. Other then that, all the implementation is same except method name.
    