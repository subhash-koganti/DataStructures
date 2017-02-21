package com.subhash.tree;

public class TreeMain {
	
	public static void main(String[] args) {
		SubhashBinaryTree binaryTree = new SubhashBinaryTree();
		
		binaryTree.insertElement(12);
		binaryTree.insertElement(10);
		binaryTree.insertElement(20);
		binaryTree.insertElement(8);
		binaryTree.insertElement(11);
		binaryTree.insertElement(14);
		binaryTree.insertElement(21);
		
		binaryTree.insertElement(12);
		binaryTree.insertElement(10);
		binaryTree.insertElement(20);
		binaryTree.insertElement(8);
		binaryTree.insertElement(11);
		binaryTree.insertElement(14);
		binaryTree.insertElement(21);
		
		binaryTree.insertElement(19);
		binaryTree.insertElement(16);
		
		binaryTree.printLevelOrder();
	}

}
