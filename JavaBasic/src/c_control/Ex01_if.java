package c_control;
import java.util.Calendar;
public class Ex01_if {

	public static void main(String[] args) {
		
		String id = "950325-1012346";
		char sung = id.charAt(7);
		if(sung=='1' | sung=='3' | sung=='9') 
			System.out.println("male");
		else if(sung=='2' | sung=='4' | sung=='0')
			System.out.println("female");
		else {};
		
		int age=0;
		int age_int = Integer.parseInt(id.substring(0,2));
		Calendar get_year = Calendar.getInstance();
		int year = get_year.get(Calendar.YEAR);
		System.out.println(year);
		if(sung =='1' || sung=='2') 
			age = year- (1900 + age_int) + 1;
		else if(sung =='3' || sung=='4')
			age = year- (2000 + age_int) + 1;
		else if(sung =='9' || sung=='0')
			age = year- (1800 + age_int) + 1;
		System.out.println(age);
	}

}
