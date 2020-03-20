package d_array;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char [][] num= new char [10][10];
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<10; j++) {
				num[i][j] = '■';
			}
		}
		char star = '□';
		num[0][0] = star;
		
		do {
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					System.out.print(num[i][j]+" ");
				}
				System.out.println();
			}
			String str = input.next();
			break;
		}while(true);
		

		
	}

}
