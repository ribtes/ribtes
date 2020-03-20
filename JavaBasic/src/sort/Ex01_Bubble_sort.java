package sort;

public class Ex01_Bubble_sort {

	public static void main(String[] args) {
		
		
		int [] score = new int[] {88,61,65,34,78};
		int temp = -2;
		for(int i=0; i<score.length; i++) {
			for(int j=i; j<score.length; j++) {
				if(score[i]>score[j]) {
					temp = score[i];
					score[i]=score[j];
					score[j]=temp;
				}
			}
		}
		for(int i=0; i<score.length; i++){
			System.out.println(score[i]);
		}

	}

}
