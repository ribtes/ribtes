package c_control;

import java.util.Scanner;

public class exam_Review {

	private static Scanner input;

	public static void main(String[] args) {

		
		input = new Scanner(System.in);
		System.out.print("주사위합(입력값): ");
		int num = input.nextInt();

		if(num>=2 && num<=12) {
			for(int i=1; i<7; i++) {
				for(int j=1; j<7;j++ ) {
					if(i+j==num) {
						System.out.println("1주사위: "+i+"\t2주사위: "+j);
						break;
					}
				}
				
				
			}
		}
		else {
			System.out.println("Error. 범위이탈");
		}

	}

}



