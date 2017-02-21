package com.subhash.linkedlist;

public class SubhashLinkedList {
	
	private Node firstElement;
	private int LIST_SIZE ;
	
	public SubhashLinkedList(){
		firstElement = null;
		LIST_SIZE =0;
	}
	
	public void addElement(int a){
		
		LIST_SIZE++;
		Node newElement = new Node(a);
		if(firstElement != null){
			newElement.next = firstElement;
		}
		firstElement = newElement;
	}
	
	public void addElementAtEnd(int a){
		LIST_SIZE++;
		Node newElement = new Node(a);
		
		if(firstElement == null){
			firstElement = newElement;
			return;
		}
		
		Node temp = firstElement;
		while(temp.next !=null){
			temp = temp.next;
		}
		temp.next = newElement;
	}
	
	public void displayLinkedList(){
		int i=0;
		if(firstElement == null){
			System.out.println("Linked list is empty");
		}else{
			Node temp = firstElement;
			while(i<this.LIST_SIZE){
				System.out.print(temp.data  );
				temp = temp.next;
				i++;
				if(i < this.LIST_SIZE)
					System.out.print( " --> ");
					
			}
		}
	}

}
