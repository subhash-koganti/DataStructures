package com.subhash.stack;

public class SubhashStack {
	
	private int[] elements;
	private int STACK_SIZE = 0;
	private int topOfStack = -1;
	
	public SubhashStack(int size){
		this.STACK_SIZE = size;
		this.elements = new int[this.STACK_SIZE];
	}
	
	public void push(int a){
		
		
		if(topOfStack + 1 < this.STACK_SIZE){
			topOfStack++;
			elements[topOfStack] = a;
			System.out.println("Pushed the element - " + a);
			
		} else {
			System.out.println("Sorry the stack is full");
		}
		displayStack();
		
	}
	
	public int pop(){
		
		if(topOfStack <= -1){
			System.out.println("Sorry the stack is empty");
			return -1;
		}else{
			int poppedElem = elements[topOfStack];
			elements[topOfStack--]= -1;
			System.out.println("Popped Element - " + poppedElem);
			displayStack();
			return poppedElem;
		}
		
		
	}
	
	public void displayStack(){
		
		System.out.println("---------------------------");
		System.out.println("Top of Stack - " + topOfStack );
		
		for(int i=this.STACK_SIZE-1; i>=0;i--){
			System.out.println("elements["+ i + "]:"+elements[i]  );
		}
		System.out.println("---------------------------");
	}
	
}
