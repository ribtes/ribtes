package c_control;

import java.util.Scanner;

public class Ex05_For2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		int star_Max = 5; 
//		for(int i=0; i<star_Max; i++) {
//			
//			for(int k = star_Max; k>i; k--) {
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
//		// 문제 1
//		for(int i =0; i<26; i++) {
//			for(char alp = 'A'; alp<=('A'+i); alp++) {
//				System.out.print(alp);
//			}
//			System.out.println();
//		}
//		
//		// 문제 2
//		for(int i=0; i<26; i++) {
//			for(char alp = 'A'; alp<=('Z'-i); alp++) {
//				System.out.print(alp);
//			}
//			System.out.println();
//		}
//		
//		// 문제3
//		for(int i=0; i<26; i++) {
//			for(char alp =(char)('A'+i); alp<='Z';alp++) {
//				
//				System.out.print(alp);
//			}
//			
//			System.out.println();
//		}
//		// 문제4
//		for(int i=0; i<26; i++) {
//			for(char alp ='Z'; alp>='Z'-i;alp--) {
//				
//				System.out.print(alp);
//			}
//			
//			System.out.println();
//		}
//
//		//문제 5
//		for(int i=0; i<26; i++) {
//			for(int j = 26; j>(26-i); j--) {
//				System.out.print(' ');
//			}
//			for(char alp =(char)('A'+i); alp<='Z';alp++) {
//			
//				System.out.print(alp);
//			}
//		
//			System.out.println();
//		}
		//문제6
//		System.out.println("정수 입력: ");
//		int num = input.nextInt();
//		for(int i=0; i<num; i++) {
//			for(int j = 0; j<num-i; j++) {
//				System.out.print("  ");
//			}
//
//			for(int k=num; k>=num-i;k--) {
//				System.out.print(num-k+1);
//				System.out.print(" ");
//			}
//		
//			System.out.println();
//		}
		//문제 7
		
//		System.out.println("정수 입력: ");
//		int num = input.nextInt();
//		int temp = 0;
//		for(int i=0; i<num; i++) {
//			for(int j = num; j>(num-i); j--) {
//				System.out.print("  ");
//			}
//
//			for(int k=0; k<num-i;k++) {
//				temp++;
//				System.out.print(temp);
//				System.out.print(" ");
//			}
//		
//			System.out.println();
//		}
		//도전과제
		System.out.print("높이: ");
		int height = input.nextInt();
		
		System.out.print("넓이: ");
		int length = input.nextInt();
		
		for(int j= 1; j<=length*height; j++) {
			
			System.out.print(j+" ");
			if(j%length==0) {
				System.out.println();
			}
		}
	}

}
