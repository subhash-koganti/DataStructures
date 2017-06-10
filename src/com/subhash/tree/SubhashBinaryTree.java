package com.subhash.tree;

public class SubhashBinaryTree {
	
	BtreeNode root ;
	
	public SubhashBinaryTree(){
		root =null;
	}
	
	public SubhashBinaryTree(BtreeNode treeNode){
		this.root = treeNode;
	}
	
	public int getHeight(BtreeNode treeNode){
		int height = 0;
		if(treeNode == null){
			return 0;
		}
		if(treeNode.left != null || treeNode.right !=null){
			int leftHeight = getHeight(treeNode.left);
			int rightHeight = getHeight(treeNode.right);
			if(leftHeight > rightHeight){
				return leftHeight+1;
			}else{
				return rightHeight+1;
			}
		}
		
		return height;
	}
	
	public void insertElement(int a ){
		
		BtreeNode newElement = new BtreeNode();
		newElement.data = a;
		newElement.left =null;
		newElement.right = null;
		
		if(root == null){ // Tree is empty
			root = newElement;
		} else { 
			
			if(a <= root.data){ // If the data is less , add it to the left tree
				
				if(root.left !=null){ // If the left node is not null , add the element in the left tree 
					SubhashBinaryTree leftTree = new SubhashBinaryTree();
					leftTree.root = root.left;
					leftTree.insertElement(a);
				} else{ // else add the new element as a leaf on the left
					root.left = newElement;
				}
				
			} else {
				if(root.right !=null){
					SubhashBinaryTree rightTree = new SubhashBinaryTree(root.right);
					rightTree.root = root.right;
					rightTree.insertElement(a);
				} else {
					root.right = newElement;
				}
			}
		}
	}
	
	/* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = getHeight(root);
        int i;
        for (i=1; i<=h; i++){
        	printGivenLevel(root, i);
        	System.out.println("");
        }
            
    }
    
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(BtreeNode root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
    
    /* Print nodes at the given level */
    void printGivenLevel (BtreeNode root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
    
    public void inOrderTraversal(BtreeNode node){
    	
    	if(node == null){
    		return;
    	}
    	
    	inOrderTraversal(node.left);
    	System.out.print(node.data+" ");
    	inOrderTraversal(node.right);
    	
    }
    
}
