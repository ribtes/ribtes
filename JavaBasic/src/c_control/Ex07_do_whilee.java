package c_control;

import java.util.Scanner;

public class Ex07_do_whilee {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.print("구구단: ");
		int num = input.nextInt();
		String result = "";
		do {
			for (int i=1; i<10; i++) {
				System.out.printf("%d x %d = %d\n",num,i,num*i);
			}
			System.out.println("구구단 다시? :(Y/N) ");
			result = input.next();
		}while(result.equals("N") || result.equals("n"));
		
	}

}
