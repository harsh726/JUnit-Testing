/*
 *	This code is responsible to receive an Array, sort array and 
 *	return sorted array to the caller of the method.
 *	But this code does not check whether array is empty or with value.
 */
package com.JavaJUnit5Test;

import java.util.Arrays;

public class AssertingWithExceptionsSortingArray {
	public int[] sortingArray(int[] array) {
		Arrays.sort(array);
		return array;
	}
}
