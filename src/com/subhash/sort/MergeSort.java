package com.subhash.sort;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] array = {3,50,20,89,33,24,240,2,60};
		mergeSort(array);
		System.out.println("\nSorted Array is ");
		printArray(array);
	}
	
	
	public static void mergeSort(int[] array){
		
		if(array.length < 2){
			return ;
		}else{
			int totalSize =array.length;
			int mid = array.length/2;
			int[] left = new int[mid];
			int[] right = new int[totalSize-mid];
			for(int i=0;i<mid;i++){
				left[i] = array[i];
			}
			for(int i=0;i<totalSize-mid;i++){
				right[i] = array[i+mid];
			}
//			System.out.println("");
//			System.out.print("left array--"); printArray(left);
//			System.out.println("");
//			System.out.print("right array--"); printArray(right);
//			System.out.println("");
			mergeSort(left);
			mergeSort(right);
			merge(left,right,array);
		}
		
		
	}


	private static void merge(int[] left, int[] right,int[] array) {
		int i=0,j=0,k=0;
		
		while(i<left.length && j<right.length){
			if(left[i]<right[j]){
				array[k++] = left[i];
				i++;
			}else{
				array[k++] = right[j];
				j++;
			}
		}
		while(i<left.length){
			array[k++] = left[i];
			i++;
		}
		while(j<right.length){
			array[k++] = right[j];
			j++;
		}
	}


	private static void printArray(int[] left) {
		for(int i=0;i<left.length;i++){
			System.out.print(left[i]+ "*");
		}
	}

}
