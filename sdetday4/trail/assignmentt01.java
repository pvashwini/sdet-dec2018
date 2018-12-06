package com.training.sdetday4.trail;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class assignmentt01 {
	
	static Map<String, String[]> myMap = new HashMap<>();
	
	  static {
		  
	        myMap.put("calculus",new String[] {"math","logic"});
	        myMap.put("chemisty",new String[] {"ions","electrons"});
	        myMap.put("biology",new String[] {"life","bacteria"});
	    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter key");
		String choice = sc.next();
		sc.close();
		
		System.out.println(choice);
		
	     for(String s:myMap.get("biology")){
	            System.out.println(s);
	        }
	    }
		

	}


