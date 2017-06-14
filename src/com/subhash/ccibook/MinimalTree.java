package com.subhash.ccibook;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MinimalTree {

	public static void main(String[] args) {
		int[] arr = {  9, 10, 20,221 };
//		int[] arr = { 0,2,3, 4, 5, 6, 7, 8, 9, 10, 20,221 };
//		int[] arr = { 0,2,3, 4, 5, 6, 7, 8, 9, 10, 20,221 };
				
		
		int start = 0;
		int end = arr.length - 1;

		Node tree = createTreeFromArray(arr, start, end);
		BTreePrinter.printBtreeNode(tree);
		
		boolean bfsSearch = BFS(tree,220);
		if(bfsSearch){
			System.out.println("Node Found using BFS " );
		}
		
		boolean binarySearch  = binarySearch(tree, 220);
		
		if(binarySearch){
			System.out.println("Node Found using Binary Search");
		}
		
		boolean recursiveBinarySearch = binarySearchRecursive(tree,220);
		if(recursiveBinarySearch){
			System.out.println("Node Found using Recursive Binary Search");
		}
		
		boolean dfsSearch = DFS(tree,222);
		if(dfsSearch){
			System.out.println("Node Found using DFS");
		}
		
	}
	
	private static boolean DFS(Node root, int i) {
		
		Stack<Node> stack = new Stack<Node>();
		
		if(root == null){
			return false;
		} else{
			stack.push(root);
			
			while(!stack.isEmpty()){

				Node temp = stack.pop();
				System.out.println("Stack Pop " + temp.data);
				
				if( temp.data == i) {
					return true;
				}else{	
					if( i<=temp.data && temp.left !=null ){
						stack.push(temp.left);
					}else if(i>temp.data && temp.right !=null){
						stack.push(temp.right);
					}else if( temp.left == null && temp.right ==null){
						return false;
					}
				}
			}
			
			
		}
		
		
		return false;
	}

	private static boolean binarySearchRecursive(Node root,int i){
		if(root == null){
			return false;
		}
		else{
			if(root.data==i){
				return true;
			} 
			if(i<root.data){
				return binarySearchRecursive(root.left, i);
			}else{
				return binarySearchRecursive(root.right,i);
			}
				
			
		}
	}

	private static boolean binarySearch(Node root, int i) {
		
		if(root==null){
			return false;
		}
		
		Node temp = root;
		
		while(temp!=null){
			
			System.out.println("Temp " + temp.data);
				
			if(temp.data == i){
				return true;
			} else{

				if(temp.left == null && temp.right==null){
					return false;
				}

				if( i <= temp.data){
					temp = temp.left;
				}else{
					temp = temp.right;
				}
				
			}
			
		}
		
		return false;
	}

	private static boolean BFS(Node root, int i) {
		
		if(root == null){
			return false;
		}
		Queue<Node> queue = new LinkedList<Node>();	
		queue.add(root);
		
		while(!queue.isEmpty()){
			
			Node temp = queue.remove();
			System.out.println("Popped -- " + temp.data);
			
			if(temp !=null && temp.data == i){
				return true;
			} else{
				if(temp.left!=null){
					queue.add(temp.left);
				}
				if(temp.right !=null){
					queue.add(temp.right);
				}
			}
		}
		return false;
	}

	private static Node createTreeFromArray(int[] arr, int start, int end) {

		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;
		Node rootNode = new Node(arr[mid]);
		rootNode.left = createTreeFromArray(arr, start, mid - 1);
		rootNode.right = createTreeFromArray(arr, mid + 1, end);
		return rootNode;

	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right= null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}

}
