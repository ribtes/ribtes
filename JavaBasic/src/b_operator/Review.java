package b_operator;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("자신의 점수를 입력하세요: ");
		int grade = input.nextInt();
		
		if(grade>=80 && grade<=90) 
		{
			System.out.println("평균");
		}
		
	}
	

}
