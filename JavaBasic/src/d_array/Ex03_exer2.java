package d_array;

import java.util.Calendar;

public class Ex03_exer2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();	//이미 만들어진 데이터를 가져오는 경우 new 없음
//		int year = cal.get(Calendar.YEAR);
//		int mon = cal.get(Calendar.MONTH);
//		int day = cal.get(Calendar.DATE);
//		System.out.printf("%d년 %d월 %d일",year,mon+1,day);

		long time_cur = 0L;
		long time_prev = -1L;
		int n = 0;
		time_cur = System.currentTimeMillis();
		System.out.println(time_cur);
	}

}
