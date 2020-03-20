package b_operator;

import java.util.Scanner;

/**
 *  두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

// 나머지 연산자 활용 - 홀/짝수 구하기

public class Ex03_Arithmetic {

	public static void main(String[] args) { 
		
		Scanner input = new Scanner(System.in);
		
//		System.out.print("첫번째 숫자: ");
//		double num1 = input.nextDouble();
//		
//		System.out.print("두번째 숫자: ");
//		double num2 = input.nextDouble();
		
//		
//		double result_add = num1+num2;
//		double result_sub = num1-num2;
//		double result_mul = num1*num2;
//		double result_div = num1/num2;
//		double result_res = num1%num2;
//		
//		System.out.println("더하기: "+result_add+
//							"\n빼기: "+result_sub+
//							"\n곱하기: "+result_mul+
//							"\n나누기: "+result_div+
//							"\n나머지: "+result_res);
		
//		System.out.println("년도 입력: ");
//		int year = input.nextInt();
//		System.out.println(year+"년은");
//		if(year%400==0) {
//			System.out.println("윤년입니다.");
//		}
//		else if (year%100==0) {
//			System.out.println("평년 입니다.");
//		}
//		else if(year%4==0) {
//			System.out.println("윤년입니다.");
//		}
//		else {
//			
//			System.out.println("평년 입니다.");
//		}
//		while(true) {
//			System.out.print("홀짝에 사용할 정수형 숫자 입력: ");
//			int holzzak = input.nextInt();
//			if(holzzak==1234) {
//				System.out.println("break");
//				break;
//			}
//			else if(holzzak%2==0) {
//				System.out.println(holzzak+"은 짝수입니다.");
//			}
//			else {
//				System.out.println(holzzak+"은 홀수입니다.");
//				if(holzzak%3==0) {
//					System.out.println("그리고 3의 배수 이기도 합니다.");
//				}
//			}
//		}
		String s = input.next();
		System.out.println(s);
		
	}

}
