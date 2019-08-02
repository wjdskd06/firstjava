package com.yedam.jsc.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Oracle");
		list.add(1, "JDBC");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "," + list.get(i));
		}
		list.remove(2);
		System.out.println("==============");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "," + list.get(i));
		}
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("================");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		List<String> list1 = new LinkedList<>();
		for(int i=0; i<=100000; i++) {
			list.add(0, "Hello");//arraylist
		}

	
		
		for(int i=0;  i<=100000; i++) {
			list1.add("Hello");//newVector<>();
		}
		
		
		
		//list = new Vector<>();

	}
}