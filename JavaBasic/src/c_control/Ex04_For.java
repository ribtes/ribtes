package c_control;

import java.util.Scanner;

public class Ex04_For {

	private static Scanner input;

	public static void main(String[] args) {
		
//		for(int i=2; i<10; i++) {
//			System.out.println();
//			for(int j=1; j<10; j++) {
//				System.out.print(i+" x "+j+" = "+i*j);
//				System.out.print("\t");
//			}
//		}
//		
//		System.out.println("\n");
//		
//		int total = 0;
//		int total2 = 0;
//		for(int i=1; i<=100; i++) {
//			if(i%2==0) {
//				total+=i;
//			}
//			else {
//				total2+=i;
//			}
//			
//		}
//		System.out.println("total = "+total);
//		System.out.println("total2 = "+total2);
//		
//		for(int i=0; i<5; i++) {
//			for(int k=5; k>i; k--) {
//				System.out.print(' ');
//			}
//			
//			for(int j=0; j<=i; j++) {
//				
//				System.out.print('*');
//				System.out.print(' ');
//			}
//			System.out.println();
//		}
//		
//		
//		for(char alp='Z'; alp>='A'; alp-- ) {
//			System.out.print(alp);
//			
//		}
//		System.out.println();
//		
		input = new Scanner(System.in);
//		System.out.print("숫자 입력: ");
//		int num = input.nextInt();
//		for(int i = 1; i<=num; i++) {
//			System.out.print(i+" ");
//			if(i%5==0) {
//				System.out.println();
//			}
//			
//		}
//		System.out.print("알파벳 입력: ");
//		String ch = input.next();
//		char alt = ch.charAt(0);
//		
//		if(alt>='a' && alt<='z') {
//			
//			for(char i = 'a'; i<=alt; i++) {
//				System.out.print(i+" ");
//			}
//		}
//		
//		else if(alt>='A' && alt<='Z') {
//			
//			for(char i = 'Z'; alt<=i; alt++) {
//				System.out.print(alt+" ");
//			}
//		}
//		
//		else
//			System.out.println("알파벳이 아닙니다.");
		
		
		
//		input.nextLine();
//		System.out.println("문자입력: ");
//		String str = input.nextLine();
//		for(int i=1; i<=str.length(); i++) {
//			System.out.print(str.charAt(str.length()-i));
//		}
		
		
		System.out.println("숫자 입력: ");
		int num1 = input.nextInt();
		int temp = 0;
		for(int i = 0; i<num1; i++) {
			
			for(int j = 0; j<num1; j++) {
				for(int k=temp+1; k>=0; k++ ) {
					temp=k;
					if(temp%2==1) {
						System.out.print(temp%10);
						break;
					}

				}
				//temp+=2;
			}
			System.out.println();
		}
	}
}