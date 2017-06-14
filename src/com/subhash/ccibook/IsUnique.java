package com.subhash.ccibook;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {
	
	public static void main(String[] args) {
		
		String str = "axbckdhaf";
		
		isUnique(str);
		isUnique2(str);
		
		// Just for testing

//		System.out.println();
//		for(int i='a'-'a';i<='z'-'a';i++){
////			char c = (char) i;
//			System.out.println(i+"   ");
//		}
//		
//		boolean[] charArr = new boolean[128];
//		
//		charArr['r'] = true;
//		for(int i=0;i<128;i++){
//			if(charArr[i]){
//				System.out.println((char)i);
//			}
//		}
		
	}

	private static boolean isUnique2(String str) {
		
		boolean[] charArr = new boolean[128];
		
		for(int i=0;i<=str.length();i++){
			int val = str.charAt(i);
			if(charArr[val]){
				System.out.println("Not Unique");
				return false;
			}else{
				charArr[val]=true;
			}
			
		}
		System.out.println("Unique");
		return true;
	}

	private static boolean isUnique(String str) {
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			Character c = str.charAt(i);
			if(charMap.get(c)!=null){
				System.out.println("Not Unique");
				return false;
			} else{
				charMap.put(c, 1);
			}
		}
		
		System.out.println("Unique ");
		return true;
	}

}
