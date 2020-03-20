package b_operator;

import java.util.Scanner;

/*
 *  논리연산자의 상태를 먼저 확인
 */
public class Ex06_GeneralLogical {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("성적: ");
		int grade = input.nextInt();
		System.out.println("태도: ");
		String attitude = input.next();
		if(grade >= 80 && attitude.equals("A")) {
			System.out.println("성적향상반");
		}
		else if(grade >=80 || attitude.equals("A")) {
			System.out.println("우등생");
		}
		else {
			System.out.println("노력요망");
		}
		
		
		
		
		
		
		
		
		/*
		 *  [ 문제 1 ]
 			문자를 하나 입력받아서 그 문자가 대문자인지 소문자 인지 출력하기
 		 */


	}

}
