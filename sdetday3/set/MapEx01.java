package com.training.sdetday3.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Harry", 4000);
		map.put("Peter", 4455);
		map.put("Britt", 2233);
		
		System.out.println("Harry Balanae" +map.get("Harry"));
		System.out.println("Peter Balance"+map.get("Peter"));
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		
		while(itr.hasNext()){
			//System.out.println(itr.next());
			
			
			Map.Entry element = (Entry) itr.next();
			
			
			System.out.println(element.getKey());
			System.out.println(element.getValue());
		}
		

	}

}
