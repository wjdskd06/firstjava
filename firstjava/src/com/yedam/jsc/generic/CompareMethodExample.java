package com.yedam.jsc.generic;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(10, "Hong");
		Pair<Integer, String> p2 = new Pair<>(10, "Hong");
		boolean result = Util.compart(p1, p2);
		if(result)
			System.out.println("�������� ������ ��ü.");
		else
			System.out.println("�������� ������ ��ü�� �ƴմϴ�.");
			
	}
}
