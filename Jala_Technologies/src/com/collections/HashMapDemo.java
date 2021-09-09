package com.collections;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		
		hashMap.put(121, "Prem");
		hashMap.put(122, "Kamal");
		hashMap.put(123, "Osipalli");
		hashMap.put(124, "Kumar");
		hashMap.put(125, "Kiran");
		hashMap.put(126, "Nani");
		hashMap.put(121, "Munny");
		hashMap.put(127, "Alex");
		hashMap.put(128, "Pavan");
		hashMap.put(129, "Surya");
		hashMap.put(130, "Girija");
		
		//Fetch the value of a Key
		System.out.println("Fetched value of the key:"+hashMap.get(121));
		
		//Create a clone/copy of HashMap
		System.out.println("cloned Hash Map:"+hashMap.clone());
		
		//Check if the given Key is in the Map
		System.out.println("Is the key '125' present? :" +hashMap.containsKey(125));
		
		//Check if the value is in the Map
		System.out.println("Is the Value 'Pavan' present? :" +hashMap.containsValue("Pavan"));
		
		//Check if the map is empty
		System.out.println("Hash Map is empty or not:"+hashMap.isEmpty());
		
		//Print the size of the Map to the console
		System.out.println("Size of the Map:"+hashMap.size());
		
		//Print all the Keys of the map to the console
		System.out.println("Keys of the maps:"+hashMap.keySet());
		
		//Print all the Keys of the Value to the console
		System.out.println("Keys of the maps:"+hashMap.values());
		
		//Remove a specific Key-value pair
		System.out.println("Remove a specific Key-value pair:"+hashMap.remove(122));
		
		//Copy all the elements of the Map to another Map
		HashMap<Integer,String> copyMap=new HashMap<Integer, String>();
		
		copyMap.putAll(hashMap);
		System.out.println("Copy all the elements of the Map to another Map:"+copyMap);
		
	}

}
