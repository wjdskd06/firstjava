package Yedam.map.copy;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(new Integer(87), "È«±æµ¿");
		map.put(new Integer(98), "±è±æµ¿");
		map.put(new Integer(75), "¹Ú¹®¼ö");
		map.put(new Integer(95), "ÀÌ¼ø½Å");
		map.put(new Integer(80), "±èÀ¯½Å");
		map.put(new Integer(75), "È«¹®¼ö");
		Set<Integer> set = map.keySet();
		for(Integer intValue : set) {
			System.out.println(intValue+" "+map.get(intValue));
		}
		NavigableMap<Integer, String> desMap = map.descendingMap();
		Set<Integer>keySet = desMap.keySet();
		for(Integer ivalue : keySet) {
			System.out.println(ivalue);
		}
		Map.Entry<Integer, String> entry = null;
		entry = map.firstEntry();
		System.out.println(entry.getKey()+", "+entry.getValue());
		entry = map.lastEntry();
		System.out.println(entry.getKey()+", "+entry.getValue());
		entry = map.lowerEntry(new Integer(95));
		System.out.println(entry.getKey()+", "+entry.getValue());
		entry = map.higherEntry(new Integer(80));
		System.out.println(entry.getKey()+", "+entry.getValue());
		while(!map.isEmpty()) {
			map.pollFirstEntry();
			System.out.println(entry.getKey()+", "+entry.getValue()+","+map.size());
			
			
			
			
		}
		
		

	}

}
