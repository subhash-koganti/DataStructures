package com.subhash.ccibook;

import java.util.Arrays;

public class IsPermutation {
	
	public static void main(String[] args) {
		String a= "z";
		String b= "slacbz";
		
		isAPerm1(a, b);
		isAPerm2(a,b);
	}

	private static void isAPerm2(String a, String b) {
		
		if(a.length()!=b.length()){
			System.out.println("Not a Permutation");
			return;
		}
		
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(new String(arr1).equals(new String(arr2))){
			System.out.println("Valid Perm");
			return;
		}else{
			System.out.println("Not a Valid Perm");
			return;
		}
		
	}

	private static void isAPerm1(String a, String b) {
		if(a.length()!=b.length()){
			System.out.println("Not a Permutation");
			return;
		}
		int[] charCount = new int[128];
		
		for(int i=0; i < a.length();i++){
			char c = a.charAt(i);
			charCount[c]++;
			char d = b.charAt(i);
			charCount[d]--;
		}
		for(int i=0;i<charCount.length;i++){
			if(charCount[i]!=0){
				System.out.println("Not A Perm");
				return;
			}
		}
		System.out.println("Valid Perm");
	}

}
