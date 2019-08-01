package com.yedam.jsc.exception;

public class ExceptionExample1 {
	public static void main(String[] args) {

		try {
			String str1 = args[0];
			String str2 = args[1];
			System.out.println(str1);
			System.out.println(str2);
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			System.out.println("num1 => " + num1);
			System.out.println("num2 => " + num2);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("�迭���� �߻� or ��ȯ�� �� ���� Ÿ�� �Դϴ�.");
			e.getMessage();
			e.printStackTrace();

		}

		catch (Exception e3) {
			System.out.println("�� �� ���� ���� �߻�.");
		} finally {
			System.out.println("try ������ ����Ǹ� �׻� ����Ǵ� ���� ���.");
		}
		System.out.println("���α׷��� �� �κ�.");
	}

}
