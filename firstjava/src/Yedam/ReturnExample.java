package Yedam;

public class ReturnExample {
		public static void main(String[]args) {
			
			int [] num = {10,20,30,40,50};
			int [] numAry = new int[5];
			int [] intary = {1,2,3,4,5};
			int maxvalue = 0;
			for(int i = 0; i<intary.length; i++) {
				if(maxvalue < intary[i])
					maxvalue = intary[i];
				}
			System.out.println(maxvalue);
			
			String[] strAry = {"sun", "mon", "tue", "wed", "thr", "fri", "sat"};
			for(String str : strAry) {
				System.out.println(str);
			}
			
			
			
			
			for(int i=0; i<intary.length; i++) {
				System.out.println(intary[i]);
			}
						
			System.out.println(num[0]);
			num[0] = 100;
			System.out.println(num[0]);
			
			
//			String[] strAry = {"hi","my", "name","is", "jsc"};
//			for(int i=0; i<strAry.length; i++) {
//				System.out.println(strAry[i]);
//			}
			
			int[] intAry = new int[11];
			int sum = 0;
			for(int i=1; i<11; i++) {
				sum = i * 5;
				intAry [i] = sum;
			System.out.println("Reslut : " +sum);
			}
			System.out.println(intAry);
			}
		
		
		
		
		
		
				
		}

