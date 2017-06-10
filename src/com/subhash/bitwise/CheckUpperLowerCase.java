package com.subhash.bitwise;

import java.util.Stack;

public class CheckUpperLowerCase {

	
	public static void main(String[] args) {
		
//		for(int i=33;i< 97+26;i++){
//			char temp = (char)i;
//			String s= "";
//			System.out.println(s.format("%s--%s", i,temp));
//			
//		}
		
		int a = 0xFFFF;
		System.out.println("a = " + a);
		Stack<Integer> stack = new Stack<Integer>();
		while(true){
			
			int remainder = a % 16;
			
			stack.push(remainder);
//			System.out.println(Integer.toBinaryString(a));
			a = a / 16;
			
			if(a <= 1){
				stack.push(remainder);
				break;
			}
			
		}
		System.out.print(a+" ");
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
	
	}
}
