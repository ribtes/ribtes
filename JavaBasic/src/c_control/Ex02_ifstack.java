package c_control;

import java.util.Scanner;
public class Ex02_ifstack {

	public static Scanner input;

	public static void main(String[] args) {

		System.out.print("학번 입력: ");
		input = new Scanner(System.in);
		String num = input.next();
		
		String classnum = num.substring(5, 7);	
		String years = num.substring(0, 4);
		
		String sub = "";
		String major = "";

//		if(num.charAt(4)=='1') {
//			sub="공대";
//			if(classnum.equals("11")) {
//				major = "컴퓨터학과";
//			}
//			else if(classnum.equals("12")) {
//				major = "소프트웨어과";
//			}
//			else if(classnum.equals("13")) {
//				major ="모바일학과";
//			}
//			else if(classnum.equals("22")) {
//				major ="자바학과";
//			}
//			else if(classnum.equals("33")) {
//				major ="서버학과";
//			}
//		}
//		else if(num.charAt(4)=='2') {
//		
//		sub="사회대";
//		
//		if(classnum.equals("11")) {
//			major ="사회학과";
//		}
//		else if(classnum.equals("12")) {
//			major ="경영학과";
//		}
//		else if(classnum.equals("13")) {
//			major ="경영학과";
//		}
//	}
		switch(num.charAt(4)) {
		case '1' :
			sub="공대";
			switch(classnum) {
			
			case "11" :
				major = "컴퓨터학과";
				break;
			case "12" :
				major = "소프트웨어과";
				break;
			case "13" :
				major ="모바일학과";
				break;
			case "22" :
				major ="자바학과";
				break;
			case "23" :
				major ="서버학과";
				break;
			}
			break;
			
		case '2' :
			sub="사회대";
			switch(classnum) {
			case "11" :
				major ="사회학과";
				break;
			case "12" :
				major ="경영학과";
				break;
			case "13" :
				major ="경영학과";
				break;
			}
			break;
		}
		System.out.print(years+"년도에 입학한 "+sub+" "+major+" 학생입니다.");
	}

}
