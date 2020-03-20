package d_array;

public class Ex07_동적크기 {

	public static void main(String[] args){
//		char [][]star =new char[5][]; 
//		
//		for(int i=0; i<star.length; i++){
//			star[i]= new char[i+1];		//동적할당
//			for(int j=0; j<=i; j++) {
//				star[i][j]='*';
//				System.out.print(star[i][j]+" ");
//			}
//			System.out.println();
//		}
//		int [][]num = new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
//		int max= 0;
//		int num1 =0;
//		for(int i = 0; i<num.length;i++) {
//			int total = 0;
//			for(int j = 0; j<num[i].length;j++) {
//				total+=num[i][j];
//			}
//			if(total>max) {
//				max=total;
//				num1=i;
//			}
//		}
//		System.out.printf("%d행",num1);
//		//문제1
//		int [][]num = new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
//		int total[] = new int[num.length];
//		int max = 0;
//		for(int i = 0; i<num.length;i++) {
//			for(int j = 0; j<num[i].length;j++) {
//				total[i]+=num[i][j];
//			}
//		}
//		for(int k=0; k<num.length;k++) {
//			if(total[k]>total[max]) {
//				max = k;
//			}
//		}
//		System.out.println(max);
		int [][]num = new int[][]{{-2, 11, 2, -7, -11},{3,-5, 12, 3, -21},
									{21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};
		int max= -100;
		int []num1 =new int[] {0,0};
		for(int i = 0; i<num.length;i++) {
			int total = 0;
			for(int j = 0; j<num[i].length;j++) {
				total+=num[i][j];
			}
			if(total>max) {
				max=total;
				num1[0]=i;
				for(int k = 0; k<num[i].length;k++) {
					if(num[i][k]>total) {
						total = num[i][k];
						num1[1]=k;
					}
				}
			}
		}
		System.out.printf("%d %d",num1[0],num1[1]);
	}

}
