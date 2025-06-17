/*
 *	In this code, when we pass the array with values, it will pass with no exception because exception is not generating.
 *	But if we want to make test case fail manually, we need to use "fail()" method.
 */
package com.JavaJUnit5Test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class AssertingWithExceptionsSortingArrayTest {

	AssertingWithExceptionsSortingArray arrayEx = new AssertingWithExceptionsSortingArray();
	int unsorted[] = { 534, 54, 21, 878, 56 };

	@Test
	void sortingArray() {
		try {
			int sorted[] = arrayEx.sortingArray(unsorted);
			for(int i : sorted) {
				System.out.println(i);
			}
		System.out.println("Statement above fail() method.");
		/*	This will fail the test case manually. 
		 * 	And When we pass the empty array, 
		 * 	it will generate the exception and test case will pass
		*/
		fail(); 
		}
		catch (NullPointerException e) {
			System.out.println("Exception generated for an Empty Array.");
		}
	}
}
