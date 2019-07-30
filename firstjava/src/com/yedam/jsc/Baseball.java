package com.yedam.jsc;

import java.util.Scanner;


public class Baseball {
	public static void main(String[] args) {
		int[] num = new int[3];
		int[] ans = new int[3];

		Scanner sc = new Scanner(System.in);
				
		for(int i=0; i<3; i++) { 
//		System.out.println((int)(Math.random()*9)+1);
		num[i] = (int)(Math.random()*9)+1;
		}
		
		for(int i=0; i<3; i++) { 
			System.out.println(num[i]);
			
		}
		
			int j = 0;
			while(j<3) { 
				System.out.println("숫자 입력 : ");
				String number = sc.nextLine();
				j++;
			}
		
		
		
		

}
}
