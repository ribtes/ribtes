package b_operator;

import java.util.Scanner;

public class Ex09_Samhang {

	public static void main(String[] args) {
		
		// a, b를 입력받아 두 수 중 큰 수를 출력
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수를 입력->");
		int a = input.nextInt();
		System.out.print("두번째 수를 입력->");
		int b = input.nextInt();
		System.out.print("세번째 수를 입력->");
		int c = input.nextInt();
	
		int max = (a>b & a>c)? a:((b>c)? b:c);
		int min = (a<b & a<c)? a:((b<c)? b:c);
		int mid = ((c != max) & (c != min))? c:((b != max) & (b != min))? b:a;  
		System.out.println("max: "+max);
		System.out.println("mid: "+mid);
		System.out.println("min: "+min);
		
		
		
		
		
		
	}

}
