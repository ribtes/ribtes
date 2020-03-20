package a_datatype;

/* [주의] 클래스명을 절대로 String 이라고 하면 안된다 */
/* 
 * String은 기본 데이타 타입이 아닌 참조형 데이타 타입이다.
 * 참조형은 new를 이용하여 객체를 생성해야 한다.
 */
public class Ex04_String {

	public static void main(String[] args) {
		
		//String a = "이경호"; --> 축약형 자동으로 참조를 하므로 중복이 있을경우 이미 있는 참조형을 같이 사용하게 된다.
		String a= new String("이경호");
		String b = new String("이경호");			// 참조형으로 사용하겠다는 선언
		
		if(a.equals(b)) {
			System.out.println("동일");
		}
		else {
			System.out.println("다르다");
		}
		
		if(a==b) {
			System.out.println("동일");
		}
		else {
			System.out.println("다르다");
		}
		
		
		
	}

}
