package a_datatype;

import java.util.Scanner;

public class Ex05_Scanner {

	public static void main(String[] args) {
		
		// 1 .국, 영, 수 점수를 저장할 변수를 선언하고 값을 지정
		// 2. 총점 구하기
		// 3. 평균 구하기
//		int kor = 90, eng = 87, math = 95;
//		int sum = kor+eng+math;
//		double ave = (double)sum / 3;
//		System.out.println("총점: "+sum+"\n 평균: "+ave);
//		String s = "오늘도 우리는 행복이 의무다.";
//		
		int kor, eng, math;
		Scanner input = new Scanner(System.in);
		System.out.print("국어 점수: ");
		kor = input.nextInt();
		
		System.out.print("영어 점수: ");
		eng = input.nextInt();
		
		System.out.print("수학 점수: ");
		math = input.nextInt();
		int total = kor+eng+math;
		double ave = (double)total / 3;
		System.out.println(ave);
		
		
	}

}

/*
# next() 와 nextLine() 차이점

	next()는 \n \t 같은 문자를 만나면 그 전까지 읽는다
	nextLine()은 \n 개행문자까지 읽어서 한 줄임을 인식한다.
	
	[ 예 ] 오늘도 우리는 행복이 의무다
	
	next()는 4개의 토큰으로 인식하지만
	nextLine()은 한 줄로 인식한다.
*/