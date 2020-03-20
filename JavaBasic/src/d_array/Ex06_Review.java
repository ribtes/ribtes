package d_array;

public class Ex06_Review {

	public static void main(String[] args) {
		//초기화와 증감식은 n개 있어도 된다.
		char [][]ch =new char[3][4]; 
		char ref = 'a';
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<ch[i].length; j++,ref++) {
				ch[i][j]=ref;
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}

	}

}
