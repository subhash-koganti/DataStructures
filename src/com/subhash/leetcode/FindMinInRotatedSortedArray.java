package com.subhash.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindMinInRotatedSortedArray {
	
	public static void main(String[] args) {
		
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		           // 0  1  2  3  4  5  6
		
		int left =0 ;
		int right = nums.length-1;
		int mid =0;
		
		while(left < right ){
			
			mid = (left +right)/2;
			List<Integer> l =new ArrayList();
			
			System.out.println("left " +left+"----"+ nums[left]);
			System.out.println("mid " +mid+"----"+ nums[mid]);
			System.out.println("right "+ right +"---"+ nums[right]);
			
			if( nums[left] < nums[mid]){ // GO right
				left = mid;
			} else{ // Go left
				right = mid;
			}
			
			System.out.println("******");
		}
		
		System.out.println(nums[right]);
	}

}
