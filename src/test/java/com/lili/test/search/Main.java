package com.lili.test.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.lili.algorithm.search.BinarySearch;

public class Main {

	private int[] arr = { 3, 5, 2, 1, 7, 8 };

	/**
	 * 二分法查找测试
	 */
	@Test
	public void test() {
		assertEquals(1, BinarySearch.search(2, arr));
	}
}
