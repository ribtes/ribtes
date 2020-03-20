package c_control;
import java.util.Scanner;
public class exam_중간값 {
	private static Scanner input;
	public static void main(String[] args) {
		
		
		
		// 3개의 정수 비교
		input = new Scanner(System.in);
		System.out.print("첫번째 수를 입력->");
		int A = input.nextInt();
		System.out.print("두번째 수를 입력->");
		int B = input.nextInt();
		System.out.print("세번째 수를 입력->");
		int C = input.nextInt();
	
		int mid = A>B?(A>C?(B>C?B:C):A): (A>C?A:(B>C?C:B));
		System.out.println(mid);
	}

}
