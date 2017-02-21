package com.subhash.queue;

import java.util.Scanner;

public class QueueMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SubhashQueue queue= new SubhashQueue(5);
		queue.enQueue(4);
		sc.nextLine();
		queue.enQueue(54);
		sc.nextLine();
		queue.enQueue(22);
		sc.nextLine();
		queue.enQueue(442);
		sc.nextLine();
		queue.enQueue(12);
		sc.nextLine();
		
		
		queue.deQueue();
		sc.nextLine();
		queue.deQueue();
		sc.nextLine();
		queue.deQueue();
		sc.nextLine();
		queue.deQueue();
		sc.nextLine();
		queue.deQueue();
		sc.nextLine();
		queue.deQueue();
		
		queue.enQueue(999);
		queue.enQueue(4);
		sc.nextLine();
		queue.enQueue(54);
		sc.nextLine();
		queue.enQueue(22);
		sc.nextLine();
		queue.enQueue(442);
		sc.nextLine();
		queue.enQueue(12);
		sc.nextLine();
		
		
		queue.deQueue();
		sc.nextLine();
		queue.deQueue();
		sc.nextLine();
		queue.deQueue();
		sc.nextLine();
		queue.deQueue();
		sc.nextLine();
		queue.deQueue();
		sc.nextLine();
		queue.deQueue();
	}

}
