package b_operator;

/**
 *  증가(++)/감소(--) 연산자
 */
public class Ex01_IncDec {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		// [1]
		System.out.println("a="+a+"b="+b);
		System.out.println("a="+a+1+"b="+b+1);	//a 51 b 71 
//		System.out.println("a="+(a+1)+"b="+(b+1));	//a 51 b 71 
//		
//		
//		a++;
//		b--;
		System.out.println("a="+a+"b="+b);
		int c = 5;
		int d = 7;
		System.out.println("c= "+(c++)+"d="+(d--));		//c = 5  d = 7
		System.out.println("c="+c+"d="+d);				// c = 6 d =6 
		
		System.out.println("c= "+(++c)+"d="+(--d));		// c = 7 d = 5
		System.out.println("c="+c+"d="+d);				// c = 7 d = 5
		
		int result = ++a;		// 증가하고 대입
		int result2 = b--;		// 대입하고 감소
		System.out.println("result="+result+"result2="+result2);
		System.out.println("a="+a+"b="+b);
		
		
		
//		System.out.println("a="+ a++ +"b=" + b--);		//출력값에 영향을 주지 않는다.
		
		System.out.println("a="+a+"b="+b);
		a=a+1;
		b=b-1;
		
		
		
		// [2]



	}

}


	