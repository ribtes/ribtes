package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_baseball {

	public static void main(String[] args) {
		int[] num = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int temp1, temp2, temp3;

		for (int i = 0; i < 100; i++) {
			temp1 = (int) (Math.random() * 10);
			temp2 = (int) (Math.random() * 10);
			temp3 = -1;

			if (temp1 == temp2) {
				continue;
			} else {
				temp3 = num[temp2];
				num[temp2] = num[temp1];
				num[temp1] = temp3;
			}

		} // end for 'i'

		int[] com = new int[3];

		for (int n = 0; n < 3; n++) {
			com[n] = num[n];
			System.out.println(com[n]);
		}

		Scanner input = new Scanner(System.in);

		int count = 5;
		Outer: while (count != 0) {
			System.out.print("세개의 숫자 입력: ");
			String str = input.nextLine();
			StringTokenizer stt = new StringTokenizer(str);
			int[] user = new int[3];

			if (stt.countTokens() > 3) {
				System.out.println("\n3개 이상의 숫자를 입력하셨습니다.\n");
				continue Outer;
			}
			
			for (int j = 0; stt.hasMoreTokens(); j++) {
				user[j] = Integer.parseInt(stt.nextToken());
			}

			for (int i = 0; i < com.length; i++) {
				if (user[i] > 9) {
					System.out.println("\n중복된 숫자를 입력 하셨습니다.\n");
					continue Outer;
				}
				for (int j = i + 1; j < 3; j++) {
					if (user[i] == user[j]) {
						System.out.println("\n범위를 이탈한 숫자를 입력 하셨습니다.\n");
						continue Outer;
					}
				}
			} // end for 'i' 2

			int strike = 0;
			int ball = 0;

			for (int k = 0; k < com.length; k++) {
				for (int i = 0; i < com.length; i++) {
					if (com[k] == user[i]) {
						if (k == i) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			} // end for 'k'
			if (strike == 3) {
				System.out.println("정답!");
				System.out.printf("%d %d %d", com[0], com[1], com[2]);
				break Outer;

			} else {
				System.out.printf("%d Strike \t %d Ball\n", strike, ball);
				count--;
				if (count == 0) {
					System.out.printf("\n기회가 모두 소진 되었습니다. 정답은: %d %d %d 입니다", com[0], com[1], com[2]);
				}
			}
		} // end while

	}
}
