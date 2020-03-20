package c_control;

public class Ex03_switchcase {

	public static void main(String[] args) {

		String id = "950325-1112346";
		char add = id.charAt(8);
		String home = "";
		switch(1) {
		
		case '0' : 
			home="서울";
			break;
		case '1' : 
			home="인천";
			break;
		case '2' : 
			home="경기도";
			break;

		}
		System.out.println("출신지: "+home);
	}

}
