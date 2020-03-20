package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_while {

	private static Scanner input;

	public static void main(String[] args) {


//		input = new Scanner(System.in);
//		System.out.println("입력: ");
//		String str = input.nextLine();
//		StringTokenizer stt = new StringTokenizer(str);
//		int  count1 = 0;
//		int  count2 = 0;
//		while( stt.hasMoreTokens() ) {
//			String temp = stt.nextToken();
//			int num = Integer.parseInt(temp);
//			if(num%2==0) {
//				count2++;
//			}
//			else {
//				count1++;
//			}
//			
//		}
//		System.out.printf("홀수: %d \t 짝수: %d",count1,count2);
//	}

		input = new Scanner(System.in);
		System.out.println("입력: ");
		String str = input.nextLine();
		StringTokenizer stt = new StringTokenizer(str);		//문자열을 토큰화
		char clab = '짝';
		while( stt.hasMoreTokens() ) {
			String temp = stt.nextToken();
			int num = Integer.parseInt(temp);
			boolean tf = false;
			while(num!=0) {
				int chek = num %10;
				if(chek==3 |chek==6 |chek==9 ) {
					System.out.println(clab);
					tf = true;
				}
				num/=10;
			}
			if(!tf)
				System.out.println(temp);
		}
		//boolean을 활용한 방법.
		int count=0;
		for(int i=1; i<10000; i++) {
			int num = i;
			while(num!=0) {
				int check_369 = num%10;
				if(check_369==8) {
					count++;
				}
				num /=10;
				
			}
		}
		System.out.println(count);
	}
}