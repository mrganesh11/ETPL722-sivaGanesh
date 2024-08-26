package com.evergent.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		myList.add(100);
		myList.add("hello");
		myList.add(45.5);
		myList.add(100);
		System.out.println(myList);
		Iterator i = myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
