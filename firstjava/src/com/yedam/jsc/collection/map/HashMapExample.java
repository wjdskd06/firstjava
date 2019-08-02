package com.yedam.jsc.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("ȫ�浿", 50);
		map.put("�̼���", 60);
		map.put("������", 70);
		map.put("�̼���", 80);
		System.out.println("�� : " + map.get("ȫ�浿"));
		Set<String> set = map.keySet();
		for (String str : set) {
			System.out.println(str + "," + map.get(str));
		}
		System.out.println("==============");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str + "," + map.get(str));
		}

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> itra = entrySet.iterator();
		while (itra.hasNext()) {
			Map.Entry<String, Integer> ent = itra.next();
			System.out.println(ent.getKey() + "," + ent.getValue());
		}

	}

}
