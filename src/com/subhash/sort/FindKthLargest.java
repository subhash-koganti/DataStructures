package com.subhash.sort;

import java.util.Arrays;

public class FindKthLargest {
	
	public static void main(String[] args) {
		
		int a[] = {32,453,12,3,5,37,98};
		int k =5;
		System.out.println(Arrays.toString(a));
		findKthLargest(a,k);
		System.out.println(Arrays.toString(a));
	}

	private static void findKthLargest(int[] a,int k) {
		buildMaxHeap(a);
		System.out.println("After Max Heap is built");
		System.out.println(Arrays.toString(a));
		System.out.println("Sorting start");
		for(int i=a.length-1;i>=0;i--){
			int temp = a[i];
			a[i]=a[0];
			a[0]=temp;
			MaxHeapify(a, 0 ,i );
			System.out.println(Arrays.toString(a));
			k--;
			if(k==0){
				System.out.println("result ="+a[i]);
				break;
			}
		}
	}

	private static void buildMaxHeap(int[] a) {
		
		int n = a.length;
		for (int  i= (n/2 -1) ;i>=0;i--){
			MaxHeapify(a,i,n);
		}
	}

	private static void MaxHeapify(int[] a, int i, int n) {
		int leftChildIndex = 2*i+1;
		int rightChildIndex = 2*i+2;
		int largestElemIndex = i ;
		
		if(leftChildIndex < n && a[leftChildIndex]>a[largestElemIndex]){
			largestElemIndex = leftChildIndex;
		}
		
		if(rightChildIndex < n && a[rightChildIndex]>a[largestElemIndex]){
			largestElemIndex = rightChildIndex;
		}
		
		if(largestElemIndex != i){
			int temp = a[i];
			a[i] = a[largestElemIndex];
			a[largestElemIndex]=temp;
			
			MaxHeapify(a, largestElemIndex , n);
		}
	}

	
}
