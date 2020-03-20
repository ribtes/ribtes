package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex02_exer {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
//		String str = input.nextLine();
//		StringTokenizer stt = new StringTokenizer(str);
//		int [] grade = new int[stt.countTokens()];
//		int length = grade.length;
//		int total = 0;
//		for(int i = 0; stt.hasMoreTokens(); i++) {
//			total += Integer.parseInt(stt.nextToken());
//			//grade[i] = temp;
//			//total += grade[i];
//		}
//
//		System.out.print("총점: ");
//		System.out.println(total);
//		double ave = total/length;
//		System.out.print("평균: ");
//		System.out.println(ave);
		
		
		
		//연습 최댓값 찾기
		String str = input.nextLine();
		StringTokenizer stt = new StringTokenizer(str);
		int [] grade = new int[stt.countTokens()];
		int max = 0;
		for(int i=0; stt.hasMoreTokens(); i++) {
			grade[i] = Integer.parseInt(stt.nextToken());
			if(grade[i]>max) {
				max = grade[i];
			}
		}
		System.out.println("Max: "+max);
	}

}
