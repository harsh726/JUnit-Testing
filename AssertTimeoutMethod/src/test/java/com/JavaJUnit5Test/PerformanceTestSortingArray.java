package com.JavaJUnit5Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class PerformanceTestSortingArray {
	
	SortingArray sap = new SortingArray();
	int unsorted[] = { 534, 54, 21, 878, 56 };
	
	@Test
	void testSortingMethod_Performance() {
		assertTimeout(Duration.ofMillis(10000), () -> sap.sortingArray(unsorted));
	}

}
