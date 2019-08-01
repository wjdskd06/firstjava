package com.yedam.jsc.generic;

public class BoxingMethodExample {
	Box<integer> box = Util.boxing(new Integer(10));
	box.get();
	return box;
}
public static<K,V> boolean compart(Pair<K,V> p1, Pair<K,V> p2) {
	boolean keyV=p1.getKey().equals(p2.getKey());
	boolean valueV=p1.getValue().equals(p2.getValue());
	return keyV && valueV;
	
}
}
