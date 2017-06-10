package com.subhash.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	DoubleLinkedList cacheNodes;
	Map<String,CacheNode> lruCacheMap = new HashMap<String,CacheNode>();
	
	public void addElement(String e){
		
		if(!lruCacheMap.containsKey(e)){
			CacheNode newNode = new CacheNode(e);
			lruCacheMap.put(e,newNode);
//			cacheNodes.addElement(newNode);
		}
	}
	
//	public String getElement(String key){
//		
//	}

}
