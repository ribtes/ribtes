package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex08_exam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("학생 수 입력: ");
		int student_num = input.nextInt();
		input.nextLine();	//쓰레기값.
		int [][]score = new int[student_num][3];
		for(int i=0; i<score.length;i++) {
			System.out.printf("%d번 학생의 국영수 점수 입력: ",i+1);
			String str = input.nextLine();
			StringTokenizer stt = new StringTokenizer(str);
			for(int j=0; stt.hasMoreTokens(); j++) {
				score[i][j]=Integer.parseInt(stt.nextToken());
			}
		}
		for(int i=0; i<score.length;i++) {
			double total = 0,ave=0;
			for(int j=0; j<score[i].length;j++) {
				total+=score[i][j];
			}
			ave = total/score[i].length;
			System.out.printf("%d번 학생의 총점은 %f점, 평균은 %f점 입니다.\n",i+1,total,ave);
		}
		double []total = new double[3];
		double []ave = new double[3];
		
		for(int i=0; i<total.length;i++) {
			for(int j=0; j<score.length;j++) {
				total[i]+=score[j][i];
			}
			ave[i] = total[i]/score.length;
		}
		System.out.printf("국어점수 총점은 %f점, 평균은 %f점 입니다.\n",total[0],ave[0]);
		System.out.printf("영어점수 총점은 %f점, 평균은 %f점 입니다.\n",total[1],ave[1]);
		System.out.printf("수학점수 총점은 %f점, 평균은 %f점 입니다.\n",total[2],ave[2]);
	}
}
