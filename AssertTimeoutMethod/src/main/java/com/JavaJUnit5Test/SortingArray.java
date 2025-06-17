package com.JavaJUnit5Test;

import java.util.Arrays;

public class SortingArray {
	public int[] sortingArray(int[] array) {
		for(int i=0; i<=1000000000; i++) {
			Arrays.sort(array);
		}
		return array;
	}
}
