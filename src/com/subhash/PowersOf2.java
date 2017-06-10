package com.subhash;

public class PowersOf2 {
	
	public static void main(String[] args) {
		int n =36;
		powersOf2(n);
	}

	private static int powersOf2(int n) {
		
		if(n<1){
			return 0;
		}else if (n==1){
			return 1;
		}else{
			
			int prev = powersOf2(n/2);
			int current = 2 * prev;
			System.out.println(current+" ");
			return current;
		}
		
	}

}
