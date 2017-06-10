package com.subhash.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer implements Comparable<Customer>{
	
	private int creditScore;
	
	public Customer(int score){
		this.creditScore = score;
	}

	@Override
	public int compareTo(Customer o) {
		if(this.creditScore < o.creditScore){
			System.out.println("returning -1--" + this.creditScore + "< " + o.creditScore);
			return -1;
		}
		else if(this.creditScore == o.creditScore){
			System.out.println("returning 0--" + this.creditScore + "==" + o.creditScore);
			return 0;
		}else{
			System.out.println("returning 1--" + this.creditScore + "> " + o.creditScore);
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Customer c1=  new Customer(749);
		Customer c2 = new Customer(632);
		Customer c3 = new Customer(832);
		Customer c4 = new Customer(632);
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);
		
		System.out.println(customers);
		Collections.sort(customers);
		System.out.println(customers);
		
		if(c1.compareTo(c2)>0){
			System.out.println("Test");
		}
	}

	@Override
	public String toString() {
		return "Customer [creditScore=" + creditScore + "]";
	}
	
	
	

}
