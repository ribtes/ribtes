package temp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ja_beginner_선택정렬 {
	static int arr[];
	public static void main(String[] args) {
		makeArray();
		makeSelectionSort();
	}
	static int[] makeArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("수열의 길이 입력: ");
		int length = input.nextInt();
		input.nextLine();
		System.out.println("길이만큼의 숫자 입력: ");
		String str = input.nextLine();
		StringTokenizer stt = new StringTokenizer(str);
		arr = new int[length];
		for(int i=0;stt.hasMoreTokens(); i++) {
			arr[i]=Integer.parseInt(stt.nextToken());
		}
		return arr;
	}
	static void makeSelectionSort() {
		
		for(int i=0; i<arr.length; i++) {
			int min=i;
			int temp=0;
			for(int j=i; j<arr.length; j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
			output();
			if(checkIfEnd()) break;
		}
	}
	static void output() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static boolean checkIfEnd() {
		int count=0;
		try {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]<=arr[i+1]) count++;
			}
		}catch(Exception ex) {}
		if(count==(arr.length-1)) return true;
		else return false;
	}
}
