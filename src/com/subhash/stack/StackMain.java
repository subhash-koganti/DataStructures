package com.subhash.stack;

import java.util.Scanner;

import com.subhash.stack.SubhashStack;

public class StackMain {
	
	public static void main(String[] args) {
		
		SubhashStack stack = new SubhashStack(5);
		Scanner sc = new Scanner(System.in);
		stack.push(34);
		sc.nextLine();
		stack.push(23);
		sc.nextLine();
		stack.push(67);
		sc.nextLine();
		stack.push(37);
		sc.nextLine();
		stack.push(7);
		sc.nextLine();
		stack.push(937);
		sc.nextLine();
		stack.pop();
		sc.nextLine();
		stack.pop();
		sc.nextLine();
		stack.pop();
		sc.nextLine();
		
		stack.displayStack();
	}

}
