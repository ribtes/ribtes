package d_array;

import java.util.Scanner;

public class Ex03_심심풀이 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("몇kg을 들고 갈까?: ");
		int gram = input.nextInt();
		int i= -1;		// 의미없는 초기화
		int j = -1;		// 의미없는 초기화
		int count = 0;
		Outer:
			for(i=0; i<10000; i++) {
				for(j=0; j<16666; j++) {
					if((5*i+3*j)==gram) {
						if(gram%(15)==0) {
							i=gram/5;
							j=0;
							count=1;
							break Outer;
						}
						count =1;
						break Outer;
					}
					else if((5*i+3*j)==gram-1) {
						if(5*i<gram) {
							continue Outer;
						}
						else {
							count=2;
							break Outer;
						}
					}
					if((5*i+3*j)>gram) {
						continue Outer;
					}
				}
			}
		switch(count) {
		case 1: {System.out.printf("5kg: %d개 \t 3kg: %d개",i,j); break;}
		case 2: {System.out.println("-1");}
		}

	}

}
