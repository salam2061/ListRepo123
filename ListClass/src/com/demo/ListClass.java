package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(35);
		list1.add(68);
		list1.add(69);
		list1.add(71);
		
		list2.addAll(list1);
		
		Iterator<Integer> itr = list2.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
