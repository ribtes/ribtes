package c_control;

import java.util.Scanner;

public class exam_while {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.print("높이: ");
		int height = input.nextInt();
		System.out.print("넓이: ");
		int length = input.nextInt();
		int i = 1;
		while(i<=height*length) {
			System.out.print(i+" ");
			if(i%length==0) {
				System.out.println();
			}
			i++;
		}
		
		
		
		System.out.println("정사각형: ");
		int length1 = input.nextInt();
		if(length1<=100) {
			for(int j=1; j<=length1; j++) {
				for(int k=0; k<length1; k++) {
					System.out.print((j+(length1*k))+" ");
				}
				System.out.println();
			}
		}
		
		
		
		
		System.out.print("높이2: ");
		int height2 = input.nextInt();
		System.out.print("넓이2: ");
		int length2 = input.nextInt();
		
		if(height2 <=100 && length2<=100) {
			int n = 1;
			boolean direction = true;
			while(n<=height2*length2) {
				System.out.print(n+" ");
				if(direction) {
					n++;
					if(n%length2==0) {
						System.out.println(n+" ");
						n+=length2;
						direction = false;
					}	
				}
				else {
					n--;
					if(n%length2==1) {
						System.out.println(n+" ");
						n+=length2;
						direction = true;
					}
				}
			}
		}
	}

}
