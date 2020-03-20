 package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		
		// 일반논리 에서만 적용
		
		int a = 3;
		if( a > 3 && ++a > 3) {
			System.out.println("조건 만족");
		}
		System.out.println("A= "+ a );
	}

}
