package com.JavJUnit5Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


class AssertThrowsDemoTest {

	AssertThrowsDemo arrayEx = new AssertThrowsDemo();
	//int unsorted[] = {534, 54, 21, 878, 56};
	int unsorted[] = null;
	
	@Test
	void testAssertThrow() {
		assertThrows(NullPointerException.class, () -> arrayEx.sortingArray(unsorted));
	}

}
