package c_control;

import java.util.Scanner;

public class Ex03_if_성적 {

	private static Scanner input;

	public static void main(String[] args) {

		
		input = new Scanner(System.in);
//		System.out.print("국어 점수: ");
//		int kor = input.nextInt();
//		System.out.print("영어 점수: ");
//		int eng = input.nextInt();
//		System.out.print("수학 점수: ");
//		int math = input.nextInt();
//		
//		int total = kor+eng+math;
//		int ave = (total/3) /10;
//		char grade=' ';
//
//		switch(ave) {
//		case 10:
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		default:
//			grade = 'F';
//			break;
//				
//		}
//		System.out.println("성적은"+grade+" 입니다.");
		
		
		// 3개의 정수 비교
		System.out.print("첫번째 수를 입력->");
		int a = input.nextInt();
		System.out.print("두번째 수를 입력->");
		int b = input.nextInt();
		System.out.print("세번째 수를 입력->");
		int c = input.nextInt();
	
		int max = (a>b && a>c)? a:((b>c)? b:c);
		int min = (a<b && a<c)? a:((b<c)? b:c);
		int mid = ((c != max) && (c != min))? c:((b != max) && (b != min))? b:((b==c || b==a))? b:a;
//		c가 최소최대에 사용되지 않았다면 중간값=c
//		c가 사용 되었을 경우 b를 검사하여 b가 사용되지 않았다면 중간값=b
//		c,b 모두 사용 되었고, b가 c와a중에 중복이 있을경우 b (중복이 있을경우 a,c중에 각각 최소최대가 존재하기에 b가 어느값이든 중간값이 된다.)
//		중복이 없을경우 a (중복이 없는경우 c와 b가 각각 최소 최대가 되기때문에 자동으로 a가 중간값)
		System.out.println("max: "+max);	//a
		System.out.println("mid: "+mid);	//b
		System.out.println("min: "+min);	//c
	}
}
