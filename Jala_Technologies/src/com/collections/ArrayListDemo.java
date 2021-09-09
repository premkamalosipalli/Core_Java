package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Banana");
		arrayList.add("Pineapple");
		arrayList.add("Peach");
		arrayList.add("Avocado");
		arrayList.add("Melon");
		arrayList.add("Orange");
		arrayList.add("Kiwi");
		arrayList.add("Passion Fruit");
		arrayList.add("Lemon and Lime");
		arrayList.add("Grapes");

		// adding element to at specified index
		arrayList.add(4, "Mango");
		System.out.println("Element added successfully");

		// remove element at a specified index
		arrayList.remove(4);
		System.out.println("Element deleted successfully");

		// update element at specified index
		arrayList.set(0, "Mango");
		System.out.println("Element Updated successfully");

		// check whether element present at specified index
		if (arrayList.get(0) != null) {
			System.out.println("Elemet is present at given index");
		} else {
			System.out.println("Elemet is not present at given index");
		}

		// get an element at specified index
		System.out.println("Element at specified Index:" + arrayList.get(1));

		// get the size of array list
		System.out.println("Size of the arraylist:" + arrayList.size());

		// check whether given element is present
		if (arrayList.contains("Bananna")) {
			System.out.println("Element is present in the arraylist");
		} else {
			System.out.println("Element is not present in the arraylist");
		}

		Iterator<String> iterator = arrayList.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		// remove all elements in the array list
		arrayList.removeAll(arrayList);
		System.out.println("Removed all elements in the arraylist");

		Iterator<String> iterator1 = arrayList.iterator();

		while (iterator1.hasNext()) {

			System.out.println(iterator1.next());
		}
		System.out.println("The array list is empty");

	}

}
