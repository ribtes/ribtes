package a_datatype;

public class Ex03_Declaration {

	public static void main(String[] args) {
		
		// 변수 선언 - 값 대입
		int kor;
		kor = 80;
		
		
		// 초기화 : 변수 선언시 값 대입
	
		//  kor와 eng 두개 이상의 변수를 한 번에 선언
		
		 int mat=90, eng=88;
		 
		 System.out.println("kor :"+ kor+", eng : "+eng+"\n");
		 System.out.printf("국어: %d, 영어 : %d \n",kor,eng);

		
		//---------------------------------------------------
		// 점수바꾸기 - swap
		 int temp;
		 temp = kor;
		 kor = eng;
		 eng = temp;
		 System.out.println("국어 : "+kor+",영어 : "+eng);
		 
		 if(kor == eng) {
			 System.out.println("동일한 점수");
		 }
		 else{
			System.out.println("다른 점수");
		 }
		
	}

}
