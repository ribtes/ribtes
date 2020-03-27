package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex09_week {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("샘플갯수: ");
		int num = input.nextInt();
		input.nextLine();		//쓰레기값 처리
		char [][]ch = new char [num][];		//케이스갯수만큼  배열형 char 생성
		int []total =new int[num];
		HERE:
		for( int i=0; i<num; i++) {			//num 만큼 실행
			int sum = 0;					//매 케이스마다 ox 초기화

			ch[i] = input.nextLine().toCharArray();		//char[num]에다가 ox를 한개씩 쪼개어 대입
			if(ch[i].length>80 || ch[i].length<0) {
				System.out.println("범위를 넘어감");
				i--;
				continue;
			}
			//길이와 ox는 어떻게??
			//ch[i] = new char[ref.length];						//;;
			for(int j=0; j<ch[i].length; j++) {

				if(ch[i][j]=='O' |ch[i][j]=='o' ) {
					sum++;
					total[i]+=sum;
				}
				else if(ch[i][j]=='x' |ch[i][j]=='X'){
					sum=0;
				}
				else {
					System.out.println("o 또는 x 의 형태가 아님");
					i--;
					continue HERE;
				}
			}
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<ch[i].length; j++) {
				System.out.printf("%s",ch[i][j]);
			}
			System.out.println(" = "+total[i]);
		}
		//문제 2
		
//		int grade[][]= new int[num][];
//		double total[] = new double[num];
//		double ave[] = new double[num];
//		for(int i=0; i<num; i++) {
//			System.out.print("학생 수 입력: ");
//			int student = input.nextInt();
//			input.nextLine();
//			System.out.print("점수 입력: ");
//			String str = input.nextLine();
//			StringTokenizer stt = new StringTokenizer(str);
//			grade[i] = new int[stt.countTokens()];
//			for(int j=0; j<student; j++) {
//				grade[i][j]=Integer.parseInt(stt.nextToken());
//				total[i]+=grade[i][j];
//			}
//			//System.out.println("total = "+total[i]);
//			ave[i]=total[i]/student;
//			System.out.println("ave= "+ave[i]);
//			double smart = 0.0;
//			for(int k=0;k<student; k++) {
//				if(grade[i][k]>ave[i]) {
//					System.out.println(grade[i][k]);
//					smart++;
//				}
//			}
//			double show_me = (double)(smart/student*100);
//			System.out.printf("%d번 케이스의 비율: %f%%\n",i+1,show_me);
//		}
	}

}
