package com.subhash.lrucache;

public class CacheNode {
	
	private String data ;
	private CacheNode prev;
	private CacheNode next;
	
	public CacheNode(String data ){
		this.data = data;
		prev = null;
		next = null;
	}
	
}
