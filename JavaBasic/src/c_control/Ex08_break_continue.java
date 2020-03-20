package c_control;

public class Ex08_break_continue {

	public static void main(String[] args) {
		HERE:
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				if(j==1) break HERE;
				System.out.printf("<%d, %d> \n",i,j);
			}
			System.out.println("========");
		}
	}
}

