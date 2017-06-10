package com.subhash.leetcode;

public class AddTwoNumbers {
	
	/**
	 * Definition for singly-linked list. public class ListNode { int val;
	 * ListNode next; ListNode(int x) { val = x; } }
	 */
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int num1 = findDecimalFromNode(l1);
		int num2 = findDecimalFromNode(l2);

		int result = num1 + num2;
		System.out.println("Result is " + result);
		 return getNodeFromNumber(result);
//		return null;
	}
	
	private static ListNode getNodeFromNumber(int a){
		ListNode result = null;
		int temp  =a;
		int count  = 0;
		while(temp!=0){
			int digit = temp %10;
			ListNode n1 = new ListNode(digit);
			temp = temp/10;
			System.out.println(digit);
		}
		
		
		
		
		return result;
	}

	private static int findDecimalFromNode(ListNode n1) {
		int count = 0;
		int temp = 0;
		if (n1 == null) {
			return temp;
		}
		ListNode current = n1;
		while (current != null) {
//			double p1 = 10;
//			double p2 = count;
			temp = (int) (temp + (Math.pow(10, count) * current.val));
			count++;
			System.out.println(temp);
			current = current.next;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		ListNode l1_1 = new ListNode(2);
		ListNode l1_2 = new ListNode(3);
		ListNode l1_3 = new ListNode(4);
		
		ListNode l2_1 = new ListNode(1);
		ListNode l2_2 = new ListNode(1);
		ListNode l2_3 = new ListNode(1);
		
		l1_1.next = l1_2;
		l1_2.next = l1_3;
		l1_3.next = null;
		
		l2_1.next = l2_2;
		l2_2.next = l2_3;
		l2_3.next = null;
		
		addTwoNumbers(l1_1,l2_1);
	}
}


