package com.yedam.jsc.nestedClass;

import java.util.Iterator;

public class DataStructure {
	// 필드
	private final static int size = 15;
	private int[] arrayOfInts = new int[size];

	// 생성자
	public DataStructure() {
		for (int i = 0; i < size; i++) {
			arrayOfInts[i] = i;

		}

	}

	// 메소드
	public void printEven() {
		DatastructureIterator iterator = this.new EvenIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		System.out.println();

	}

	// int -> integer
	interface DatastructureIterator extends Iterator<Integer> {

	}

	private class EvenIterator implements DatastructureIterator {
		private int nextIndex = 0;

		@Override
		public boolean hasNext() {
			return (nextIndex <= size - 1);
		}

		@Override
		public Integer next() {
			Integer retVal = Integer.valueOf(arrayOfInts[nextIndex]);
			nextIndex += 2;
			return retVal;
		}

	}
	

	public static void main(String[] args) {
		DataStructure ds = new DataStructure();
		ds.printEven();
	}
}

