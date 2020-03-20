package d_array;
public class Ex04_Lotto {

	public static void main(String[] args) {
		
		
		int [][] lotto = new int [5][6];
		int [] num = new int[45];
		for(int i=0; i<45; i++) {
			num[i]=i+1;
		}
		
		
		for(int i=0; i<5; i++) {					// 줄 수
			int count =(int) (Math.random() * 38);
			for(int k = 0; k < 100; k++){			//랜덤 돌리기
				int temp1 = (int) ((Math.random() * 45)); // 1 ~ 45
				int temp2 = (int) ((Math.random() * 45));
				if (temp1 == temp2) {				//중복없애기
					continue;
				} else {
					int temp3 = num[temp2];
					num[temp2] = num[temp1];
					num[temp1] = temp3;
				}
			}
			
			for(int j=0; j<6; j++) {				//로또 채우기
				lotto[i][j]=num[count];
				count++;
			}
			count =0;
		}
//		for(int i=0; i<45; i++) {
//			System.out.print(num[i]+" ");
//			if(i%6==1) {
//				System.out.println();
//			}
//		}

		int temp = -1;
		for(int i=0; i<5; i++) {
			for(int j=0;j<6; j++) {
				for(int k=j+1; k<6; k++) {
					if(lotto[i][j]>lotto[i][k]) {
						temp = lotto[i][k];
						lotto[i][k]=lotto[i][j];
						lotto[i][j]=temp;
					}
				}
			}
		}
		
		
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<6; j++) {
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}
	}

}
