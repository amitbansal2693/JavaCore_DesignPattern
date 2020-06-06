package com.java8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class java8each {
	public static void main(String []args) {
		HashMap<Integer, String> map = new HashMap<>();
	 
	map.put(1, "A");
	map.put(2, "B");
	map.put(3, "C");
	map.put(3, "D");
	Hashtable<Integer, String> hashtable = new Hashtable<>();
	hashtable.put(2, "a");
	hashtable.put(1, "c");
	hashtable.put(3, "a");
	hashtable.put(4, "b");
	System.out.println(hashtable);
	
    HashSet<String> set=new HashSet();  
    try{    
    	//code that may throw an exception    
    	}catch(Exception ref){}    
	
	
	}
	
	
}
