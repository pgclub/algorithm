package com.techli.algorithm.search;

import java.util.Arrays;

/**
 * @author techli
 * @QQ:1059997113
 * @date 2018年7月9日 下午10:52:21
 * @Description 二分法查找
 */
public class BinarySearch {
	public static int search(int value, int[] arr) {
		int min = 0;
		int max = arr.length - 1;
		Arrays.sort(arr);
		while (min <= max) {
			int mid = min + (max - min) / 2;
			if (value > arr[mid]) {
				min = mid + 1;
			} else if (value < arr[mid]) {
				max = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
