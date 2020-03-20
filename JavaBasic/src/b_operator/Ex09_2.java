package b_operator;

import java.util.Scanner;

public abstract class Ex09_2 {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수 입력: ");
		int grade = input.nextInt();
		System.out.println();
		
		String pnp  = (grade >= 80)? "합격":"불합격"; 
		System.out.println(pnp);
	}

}
