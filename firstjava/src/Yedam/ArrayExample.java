package Yedam;

public class ArrayExample {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		int a = 1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				intAry[i][j] = a++;
				if(a%5==1) {
					System.out.println("\t"+intAry[i][j]);
				}
				else {
					System.out.print("\t"+intAry[i][j]);
				}
				
			}
		}
	}

}
