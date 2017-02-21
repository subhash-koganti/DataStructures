package com.subhash.queue;

public class SubhashQueue {
	
	int[] elements;
	int QUEUE_SIZE=0;
	int front=0;
	int rear =0;
	
	public SubhashQueue(int size){
		elements = new int[size];
		QUEUE_SIZE = size;
	}
	
	public void enQueue(int a){
		if(rear+1 > QUEUE_SIZE){
			System.out.println("Sorry the Queue is full");
		}else{
			
			elements[rear++] = a;
			System.out.println("Element Queued " + a);
			displayQueue();
		}
	}
	
	public int deQueue(){
		if( front == rear){
			System.out.println("Sorry the Queue is Empty");
			front =0;
			rear =0;
			return -1;
		}
		else{
			int resultElem = elements[front];
			elements[front]=-1;
			front++;
			System.out.println("Element DeQueued = "+ resultElem);
			displayQueue();
			return resultElem;
		}
	}
	
	public void displayQueue(){
		for(int i=QUEUE_SIZE-1;i>=0;i--){
			System.out.println("Elements["+i+"] = "+ elements[i]);
		}
	}

}
