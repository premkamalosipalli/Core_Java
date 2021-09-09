package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Five");
		hashSet.add("Six");
		hashSet.add("Seveen");
		hashSet.add("Eight");
		hashSet.add("Nine");
		hashSet.add("Ten");

		// Print all the Keys of the set to the console
		Iterator<String> iterator = hashSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Converting HashSet to Array
		String[] hashElements = hashSet.toArray(new String[hashSet.size()]);

		// Fetch the value of a Key
		System.out.println("Fetched value of the key:" + hashElements[3]);

		// Create a clone/copy of HashMap
		System.out.println("cloned Hash Map:" + hashSet.clone());

		// Check if the given Key is in the Map
		System.out.println("Is the key 'Pavan' present? :" + hashSet.contains("Pavan"));

		// Check if the map is empty
		System.out.println("Hash Map is empty or not:" + hashSet.isEmpty());

		// Print the size of the Set to the console
		System.out.println("Size of the Map:" + hashSet.size());

		// Remove a specific Key-value pair
		System.out.println("Remove a specific Element:" + hashSet.remove("Pavan"));
		
		// Print all the Keys of the set to the console
				Iterator<String> iterator1 = hashSet.iterator();

				while (iterator1.hasNext()) {
					System.out.println(iterator1.next());
				}

		// Copy all the elements of the Set to another Set
		HashSet<String> copySet = new HashSet<>(hashSet);
		System.out.println("Copy all the elements of the Map to another Map:" + copySet);

	}

}
