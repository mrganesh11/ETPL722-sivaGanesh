package com.evergent.corejava.collections;

import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo5 {

	public static void main(String[] args) {
		TreeSet mySet = new TreeSet();
		mySet.add(100);
		mySet.add(50);
		mySet.add(60);
		mySet.add(80);
		mySet.add(80);
		mySet.add(100);
		System.out.println(mySet);
		Iterator i = mySet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
