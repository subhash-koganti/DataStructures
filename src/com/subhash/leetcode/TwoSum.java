package com.subhash.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];

		List<Integer> numsList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			numsList.add(nums[i]);
		}
		List<Integer> originalList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			originalList.add(nums[i]);
		}

		System.out.println("Un-Sorted List " + numsList);
		Collections.sort(numsList);
		System.out.println("Sorted List " + numsList);

		int i = 0;
		int j = numsList.size() - 1;

		while (i < j) {

			int temp = numsList.get(i) + numsList.get(j);
			if (temp < target) {
				i++;
			} else if (temp > target) {
				j--;
			} else {
				result[0] = numsList.get(i);
				result[1] = numsList.get(j);
				break;
			}

		}

		int x = Collections.binarySearch(originalList, result[0]);
		int y = Collections.binarySearch(originalList, result[1]);

		result[0] = x;
		result[1] = y;

		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 3,2,4 };
		int target = 6;
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && complement != nums[i]) {
				result[0] = i;
				result[1] = map.get(complement);
				break;
			}
		}

		System.out.println(result[0] + "," + result[1]);
	}
}